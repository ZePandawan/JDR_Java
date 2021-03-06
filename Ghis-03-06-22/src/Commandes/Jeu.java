package Commandes;

import Attaque.*;
import Joueur.*;
import Monstres.*;
import Consommables.Consommables;
import Histoire.Menu;

public class Jeu extends Commandes {
	
	static Joueur joueur;
	
	public void Combat(Joueur joueur, Ennemi ennemi, Attaque attaque)
	{
		NettoyerConsole();
		AfficherEntete(30, 
				  "     D?but de l'attaque \n"
				+ "       Tour du Joueur !");
		
		DebugScanner();
		StopProgramme();
		NettoyerConsole();
		
		joueur.AttaqueEnnemi(joueur, ennemi, attaque);

		if(ennemi.getSante() <= 0) {
			
			AfficherEntete(30,"Le monstre est mort ! Vous ?tes victorieux !!!");
			DebugScanner();
			
			joueur.getXp().xp(joueur, ennemi);
			joueur.Recapitulatif();
		}
		else
		{
			NettoyerConsole();
			AfficherEntete(30, "       Tour du monstre ! ");
			StopProgramme();
			
			ennemi.Attaque(joueur);
			
			if(joueur.getHp() <= 0) {
				
				AfficherEntete(30,"Le monstre a r?ussi a vous tuer... Game Over !");
				DebugScanner();
				joueur.Recapitulatif();
				StopProgramme();
				
				Menu menu = new Menu();
				menu.MenuPrincipal();
				
			}
			else
			{
				NettoyerConsole();
				MenuCombat(joueur, ennemi);
			}
		}
	}
	
	public void MenuCombat(Joueur joueur, Ennemi ennemi) 
	{
		NettoyerConsole();
		
		AfficherEntete(30, 
				  "    Vie : " + joueur.getHp() + "   Mana : " + joueur.getMana() + "\n\n"
				+ "Choisissez une action : \n"
				+ "[1] : Attaque Physique \n"
				+ "[2] : Attaque Magique \n"
				+ "[3] : Sac ? dos");
		int choix = LectureInt("->", 3);
			
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
			case 3 : 
			{
				NettoyerConsole();
				joueur.getInventaire().afficher_inventaire(joueur);
				joueur.getInventaire().ajouter_inventaire(Consommables.Biere, joueur);
				joueur.getInventaire().afficher_inventaire(joueur);
				joueur.getInventaire().supprimer_inventaire(Consommables.Biere, joueur);
				joueur.getInventaire().afficher_inventaire(joueur);
			}
			default :
			{break;}
		}
	}
	
	public void MenuAttaquesPhysiques(Joueur joueur, Ennemi ennemi) 
	{
		AfficherEntete(30, 
				  "Choisissez une attaque : \n"
				+ "[1] : " + joueur.getClasse().getAttaquesPhysiques().get(0).getNom() + "\n"
				+ "[2] : " + joueur.getClasse().getAttaquesPhysiques().get(1).getNom() + "\n"
				+ "[3] : Retour");
		int choix = LectureInt("->",3);
			
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
	
	public void DescriptionAttaquesPhysiques(Joueur joueur, Ennemi ennemi, int choix){
		
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
				break;
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
	
	public void MenuAttaquesMagiques(Joueur joueur, Ennemi ennemi) {
		
		AfficherEntete(30, 
				  "Choisissez une attaque : \n"
				+ "[1] : " + joueur.getClasse().getAttaquesMagiques().get(0).getNom() + "\n"
				+ "[2] : " + joueur.getClasse().getAttaquesMagiques().get(1).getNom() + "\n"
				+ "[3] : Retour");
		int choix = LectureInt("->",3);
			
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
	
	public void DescriptionAttaquesMagiques(Joueur joueur, Ennemi ennemi, int choix){
		
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
				break;
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
