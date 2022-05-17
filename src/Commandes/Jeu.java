package Commandes;

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
	
	public void Combat(Joueur joueur, Monstre ennemi)
	{
		System.out.println("Début de l'attaque ");
		joueur.Attaque(ennemi);
		StopProgramme();
		if(ennemi.getSante() <= 0) {
			System.out.println("Le monstre est mort ! Vous êtes victorieux !!!");
			joueur.Recapitulatif();
			return;
		}
		else
		{
			ennemi.Attaque(joueur);
			StopProgramme();
			if(joueur.getHp() <= 0) {
				System.out.println("Le montre à réussi a vous tuer... Game Over !");
				joueur.Recapitulatif();
				return;
			}
		}
		MenuCombat(joueur, ennemi);
	}
	
	public void MenuCombat(Joueur joueur, Monstre ennemi) {
		boolean choixPrit = false;
		do {
			System.out.println("Choisissez une action :");
			System.out.println("[1] : Attaque Physique");
			System.out.println("[2] : Attaque Magique");
			System.out.println("[3] : Sac");
			System.out.println("[4] : Parade / Esquive");
			int choix = LectureInt("->", 4);
			
			if(choix == 1) {
				Combat(joueur, ennemi);
			}
		}while(choixPrit == false);
		
	}
}
