package Commandes;

import Attaque.*;
import Joueur.*;
import Monstres.*;

public class Jeu extends Interface {
	
	static Joueur joueur;
	
	public void MenuPrincipal()
	{
		NettoyerConsole();
		AfficherEntete(30,
				  "  LE SEIGNEUR DES ANNEAUX \n"
				+ "   La quête de l'anneau");
		StopProgramme();
		
		NettoyerConsole();
		AfficherSeparateur(30);
		System.out.println("[1] Nouvelle Partie");
		System.out.println("[2] Charger Partie");
		System.out.println("[3] Règle du jeu");
		System.out.println("[4] Quitter");
		AfficherSeparateur(30);
		
		int choix = LectureInt("->",4);
		
		switch(choix)
		{
			case 1 : 
			{
				NouvellePartie();
				break;
			}
			case 2 :
			{
				//ChargerPartie();
				break;
			}
			case 3 :
			{
				//RegleDuJeu();
				break;
			}
			case 4 :
			{
				//Quitter();
				break;
			}
			default :
			{}
		}
	}
	
	public void NouvellePartie()
	{
		Introduction();
	}
	
	public void Introduction()
	{
		NettoyerConsole();
		AfficherSeparateur(122);
		System.out.println(
				  "                                                       INTRODUCTION                                                       \n\n"
				+ "                    *Plongé dans vos pensées, vous repensez au chemin qui vous à ammené jusqu'ici...*                     \n"
				+ "*Vous êtes aligné en rang avec une cinquante de personnes. Humains, Nains, Elfes, vous passez en analyse chaque personne.*\n"
				+ "      *Nombreux d'entre eux sont des rescapés d'anciennes batailles, d'autres, des survivants de villages assiégés.*      \n"
				+ "                          *Un chevalier fais son apparition et débute un discours à haute voix.*                          \n");
		AfficherSeparateur(122);
		
		StopProgramme();
		NettoyerConsole();
		AfficherEntete(122,
				  "\n??? : Vous n'êtes pas ici pour vous lamenter sur votre anciennes vies ! \n"
				+ "??? : L'armée de Sauron s'approche à grand pas ! Et les orques sont quasiment aux portes de la ville ! \n"
				+ "??? : Pour ceux qui ne me connaissent pas... Je suis Aragorn ! Fils d'Arathorn ! \n"
				+ "Aragorn : Je serai votre commandant pendant le siège de cette ville ! \n\n"
				+ "                               *Aragorn tourne le regard vers vous et vous pointe du doigt*                               \n"
				+ "\nAragorn : Toi là ! Approche ! Nous allons voir si tu es digne de défendre cette ville !\n");
		
		StopProgramme();
		DefPersonnage();
		
		NettoyerConsole();
		AfficherEntete(122,  
				  "\nAragorn : Bien ! Il est maintenant temps de te former à la bataille, suis moi " + joueur.getName() +"                     \n");
		StopProgramme();
		CombatIntro();
		
				
	}
	
	public void DefPersonnage()
	{
		String nom;
		
		NettoyerConsole();
		AfficherEntete(122, "\nAragorn : Quel est votre nom mon brave ?!\n");
		System.out.print("-> Nom : ");
		nom = scanner.next();

		
		NettoyerConsole();
		AfficherEntete(122,"\nAragorn : Votre nom est " + nom + ". N'est-ce pas ? \n\n"
				+ "[1] Oui ! \n"
				+ "[2] Non ! \n");
		int choix = LectureInt("->", 2);
		
		switch(choix)
		{
			case 1 :
			{
				joueur = new Joueur(nom);	
				break;
			}
			case 2 :
			{
				System.out.println();
				DefPersonnage();
				break;
			}
			default :
			{}
		}
	}
	
	public void CombatIntro() {
		NettoyerConsole();
		AfficherEntete(122,  
				    "\nAragorn : Commence d'abord par te munir de ton/ta " + joueur.getClasse().getArme().getNom() + " ce sera ton seul moyen de survie pendant cette guerre.\n\n"
				  + "             *Vous récupérez votre équipement, l'inspectez et vous préparez pour le début de l'entrainement*             \n\n"
				  + "Aragorn : Tout au long de ton aventure, tu renconteras principalement 2 type de créatures. \n"
				  + "Aragorn : Tu as d'abord les créatures dites 'Physique' comme toi ou moi. \n"
				  + "Aragorn : Grâce à notre armure nous avons une résistance aux attaques physiques. \n"
				  + "Aragorn : De l'autre côté les créatures 'Magique' ont une résistances aux attaques magiques. \n"
				  + "Aragorn : Soit donc bien minutieux quant aux attaques que tu utilises.\n");
		StopProgramme();
		
		NettoyerConsole();
		AfficherEntete(122,  
				      "\nAragorn : Commençons l'entrainement !"
				    + "Aragorn : A toi l'honneur mon ami");
		
		Aragorn Aragorn = new Aragorn();
		
		MenuCombat(joueur, Aragorn);
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
	
	public void MenuCombat(Joueur joueur, Monstre ennemi) 
	{
		NettoyerConsole();
		System.out.println("Choisissez une action :");
		System.out.println("[1] : Attaque Physique");
		System.out.println("[2] : Attaque Magique");
		//System.out.println("[3] : Sac");
		//System.out.println("[4] : Parade / Esquive");
		int choix = LectureInt("->", 2);
			
		switch(choix)
		{
			case 1 :
			{
				NettoyerConsole();
				MenuAttaquesPhysiques(joueur, ennemi);
			}
			case 2 :
			{
				NettoyerConsole();
				MenuAttaquesMagiques(joueur, ennemi);
			}
			default :
			{}
		}
	}
	
	public void MenuAttaquesPhysiques(Joueur joueur, Monstre ennemi) {

		System.out.println("Choisissez une attaque :");
		for(int i = 0; i<joueur.getClasse().getAttaquesPhysiques().size(); i++)
		{
			System.out.println("[" + (i+1) +"] : " + joueur.getClasse().getAttaquesPhysiques().get(i).getNom());
		}
		System.out.println("[3] : Retour");
		int choix = LectureInt("->",joueur.getClasse().getAttaquesPhysiques().size()+1);
			
		switch(choix)
		{
			case 1 :
			{
				NettoyerConsole();
				DescriptionAttaquesPhysiques(joueur, ennemi, 1);
			}
			case 2 :
			{
				NettoyerConsole();
				DescriptionAttaquesPhysiques(joueur, ennemi, 2);
			}
			case 3 :
			{
				NettoyerConsole();
				MenuCombat(joueur, ennemi);
			}
		}
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
