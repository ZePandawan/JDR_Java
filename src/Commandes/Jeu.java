package Commandes;

import Attaque.*;
import Joueur.*;
import Monstres.*;

public class Jeu extends Interface {
	
	static Joueur joueur;
	
	public void DebutJeu() {
		boolean nomValide = false;
		String nom;
		
		//Affichage de l'écran d'accueil
		NettoyerConsole();
		AfficherEntete("MIDDLE EARTH WAR RPG");
		StopProgramme();
		
		//Choix du nom du Joueur
		do {
			NettoyerConsole();
			AfficherSeparateur(30);
			System.out.println("Quel est ton nom aventurier ?!");
			AfficherSeparateur(30);
			nom = scanner.next();
			
			//Demande si le Nom est bon pour le Joueur
			NettoyerConsole();
			AfficherEntete("Votre nom est bien : " + nom + "\n Est-ce bien cela ?!");
			System.out.println("(1) Oui !");
			System.out.println("(2) Non !");
			int entree = LectureInt("->", 2);
			
			if(entree == 1) {
				nomValide = true;
			}
		}while(!nomValide);
		
		//Création d'un nouveau Personnage
		joueur = new Joueur(nom);
		
		Araignee a1 = new Araignee();
		MenuCombat(joueur, a1);
	}
	
	public void Combat(Joueur joueur, Monstre ennemi, Attaque attaque)
	{
		NettoyerConsole();
		System.out.println("Début de l'attaque ");
		System.out.println("Tour du Joueur ! ");
		
		joueur.AttaqueEnnemi(ennemi, attaque);
		StopProgramme();
		
		if(ennemi.getSante() <= 0) {
			System.out.println("Le monstre est mort ! Vous êtes victorieux !!!");
			joueur.Recapitulatif();
			return;
		}
		else
		{
			NettoyerConsole();
			System.out.println("Tour du monstre ! ");
			ennemi.Attaque(joueur);
			StopProgramme();
			if(joueur.getHp() <= 0) {
				System.out.println("Le montre à réussi a vous tuer... Game Over !");
				joueur.Recapitulatif();
				return;
			}
		}
		NettoyerConsole();
		MenuCombat(joueur, ennemi);
	}
	
	public void MenuCombat(Joueur joueur, Monstre ennemi) {
		boolean choixPrit = false;
		do {
			NettoyerConsole();
			System.out.println("Choisissez une action :");
			System.out.println("[1] : Attaque Physique");
			System.out.println("[2] : Attaque Magique");
			System.out.println("[3] : Sac");
			System.out.println("[4] : Parade / Esquive");
			int choix = LectureInt("->", 4);
			
			if(choix == 1) {
				NettoyerConsole();
				MenuAttaquesPhysiques(joueur, ennemi);
			}
			if(choix == 2) {
				NettoyerConsole();
				MenuAttaquesMagiques(joueur, ennemi);
			}
		}while(choixPrit == false);
		
	}
	
	public void MenuAttaquesPhysiques(Joueur joueur, Monstre ennemi) {
		boolean choixAttaque = false;
		do {
			System.out.println("Choisissez une attaque :");
			for(int i = 0; i<joueur.getClasse().getAttaquesPhysiques().size(); i++)
			{
				System.out.println("[" + (i+1) +"] : " + joueur.getClasse().getAttaquesPhysiques().get(i).getNom());
			}
			System.out.println("[3] : Retour");
			int choix = LectureInt("->",joueur.getClasse().getAttaquesPhysiques().size()+1);
			
			if(choix == 1)
			{
				NettoyerConsole();
				DescriptionAttaquesPhysiques(joueur, ennemi, 1);
			}
			
			if(choix == 2)
			{
				NettoyerConsole();
				DescriptionAttaquesPhysiques(joueur, ennemi, 2);
			}
			if(choix == 3)
			{
				NettoyerConsole();
				MenuCombat(joueur, ennemi);
			}
		}while(choixAttaque == false);
	}
	
	public void DescriptionAttaquesPhysiques(Joueur joueur, Monstre ennemi, int choix){
		boolean ValidationChoix = false;
		do {
			System.out.println("Validez vous votre attaque !?");
			System.out.println("Description : " + joueur.getClasse().getAttaquesPhysiques().get(choix-1).getDescription());
			System.out.println("[1] : Oui");
			System.out.println("[2] : Non");
			int choixValidation = LectureInt("->",2);
			
			if(choixValidation == 1) {
				if(choix == 1)
				{
					Combat(joueur, ennemi, joueur.getClasse().getAttaquesPhysiques().get(0));
				}
				if(choix == 2)
				{
					Combat(joueur, ennemi, joueur.getClasse().getAttaquesPhysiques().get(1));
				}
			}
			if(choixValidation == 2)
			{
				NettoyerConsole();
				MenuAttaquesPhysiques(joueur, ennemi);
			}
		}while(ValidationChoix == false);
	}
	
	public void MenuAttaquesMagiques(Joueur joueur, Monstre ennemi) {
		boolean choixAttaque = false;
		do {
			System.out.println("Choisissez une attaque :");
			for(int i = 0; i<joueur.getClasse().getAttaquesMagiques().size(); i++)
			{
				System.out.println("[" + (i+1) +"] : " + joueur.getClasse().getAttaquesMagiques().get(i).getNom());
			}
			System.out.println("[3] : Retour");
			int choix = LectureInt("->",joueur.getClasse().getAttaquesMagiques().size()+1);
			
			if(choix == 1)
			{
				NettoyerConsole();
				DescriptionAttaquesMagiques(joueur, ennemi, 1);
			}
			
			if(choix == 2)
			{
				NettoyerConsole();
				DescriptionAttaquesMagiques(joueur, ennemi, 2);
			}
			if(choix == 3)
			{
				NettoyerConsole();
				MenuCombat(joueur, ennemi);
			}
		}while(choixAttaque == false);
	}
	
	public void DescriptionAttaquesMagiques(Joueur joueur, Monstre ennemi, int choix){
		boolean ValidationChoix = false;
		do {
			System.out.println("Validez vous votre attaque !?");
			System.out.println("Description : " + joueur.getClasse().getAttaquesMagiques().get(choix-1).getDescription());
			System.out.println("[1] : Oui");
			System.out.println("[2] : Non");
			int choixValidation = LectureInt("->",2);
			
			if(choixValidation == 1) {
				if(choix == 1)
				{
					if(joueur.getClasse().getMana() >=1)
					{
						NettoyerConsole();
						Combat(joueur, ennemi, joueur.getClasse().getAttaquesMagiques().get(0));
					}
					else
					{
						System.out.println("Vous n'avez pas assez de mana !");
						MenuAttaquesMagiques(joueur, ennemi);
					}
				}
				if(choix == 2)
				{
					if(joueur.getClasse().getMana() >=2)
					{
						NettoyerConsole();
						Combat(joueur, ennemi, joueur.getClasse().getAttaquesMagiques().get(1));
					}
					else
					{
						System.out.println("Vous n'avez pas assez de mana !");
						MenuAttaquesMagiques(joueur, ennemi);
					}
				}
			}
			if(choixValidation == 2)
			{
				NettoyerConsole();
				MenuAttaquesMagiques(joueur, ennemi);
			}
		}while(ValidationChoix == false);
	}
}
