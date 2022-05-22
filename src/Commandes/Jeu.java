package Commandes;

import Attaque.*;
import Joueur.*;
import Monstres.*;

public class Jeu extends Interface {
	
	static Joueur joueur;
	
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
				break;
			}
			case 2 :
			{
				NettoyerConsole();
				MenuAttaquesMagiques(joueur, ennemi);
				break;
			}
			default :
			{break;}
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
				break;
			}
			case 2 :
			{
				NettoyerConsole();
				DescriptionAttaquesPhysiques(joueur, ennemi, 2);
				break;
			}
			case 3 :
			{
				NettoyerConsole();
				MenuCombat(joueur, ennemi);
				break;
			}
			default :
			{break;}
		}
	}
	
	public void DescriptionAttaquesPhysiques(Joueur joueur, Monstre ennemi, int choix){
		
		AfficherEntete(30,
				  "Validez vous votre attaque !?\n\n"
				+ "Description : " + joueur.getClasse().getAttaquesPhysiques().get(choix-1).getDescription() + "\n\n"
				+ "[1] : Oui \n"
				+ "[2] : Non");
		int choixValidation = LectureInt("->",2);
			
		switch(choixValidation)
		{
			case 1:
			{
				switch(choix)
				{
					case 1:
					{
						Combat(joueur, ennemi, joueur.getClasse().getAttaquesPhysiques().get(0));
						break;
					}
					case 2:
					{
						Combat(joueur, ennemi, joueur.getClasse().getAttaquesPhysiques().get(1));
						break;
					}
					default:
					{break;}
				}
			}
			case 2:
			{
				NettoyerConsole();
				MenuAttaquesPhysiques(joueur, ennemi);
				break;
			}
			default:
			{break;}
		}
	}
	
	public void MenuAttaquesMagiques(Joueur joueur, Monstre ennemi) {
		
		System.out.println("Choisissez une attaque :");
		for(int i = 0; i<joueur.getClasse().getAttaquesMagiques().size(); i++)
		{
			System.out.println("[" + (i+1) +"] : " + joueur.getClasse().getAttaquesMagiques().get(i).getNom());
		}
		System.out.println("[3] : Retour");
		int choix = LectureInt("->",joueur.getClasse().getAttaquesMagiques().size()+1);
			
		switch(choix)
		{
			case 1 :
			{
				NettoyerConsole();
				DescriptionAttaquesMagiques(joueur, ennemi, 1);
				break;
			}
			case 2 :
			{
				NettoyerConsole();
				DescriptionAttaquesMagiques(joueur, ennemi, 2);
				break;
			}
			case 3 :
			{
				NettoyerConsole();
				MenuCombat(joueur, ennemi);
				break;
			}
			default :
			{break;}
		}
	}
	
	public void DescriptionAttaquesMagiques(Joueur joueur, Monstre ennemi, int choix){
		
		AfficherEntete(30,
				  "Validez vous votre attaque !?\n\n"
				+ "Description : " + joueur.getClasse().getAttaquesMagiques().get(choix-1).getDescription() + "\n\n"
				+ "[1] : Oui \n"
				+ "[2] : Non");
		int choixValidation = LectureInt("->",2);
			
		switch(choixValidation)
		{
			case 1:
			{
				switch(choix)
				{
					case 1:
					{
						Combat(joueur, ennemi, joueur.getClasse().getAttaquesMagiques().get(0));
						break;
					}
					case 2:
					{
						Combat(joueur, ennemi, joueur.getClasse().getAttaquesMagiques().get(1));
						break;
					}
					default:
					{break;}
				}
			}
			case 2:
			{
				NettoyerConsole();
				MenuAttaquesMagiques(joueur, ennemi);
				break;
			}
			default:
			{break;}
		}
	}		
}
