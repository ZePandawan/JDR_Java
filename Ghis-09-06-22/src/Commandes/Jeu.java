package Commandes;

import Attaque.Attaque;
import Joueur.Joueur;
import Monstres.Ennemi;
import Histoire.Menu;

public class Jeu extends Commandes implements JeuIntf {
	
	protected static Joueur joueur;
	
	public void menuCombat(Joueur joueur, Ennemi ennemi) 
	{
		nettoyerConsole();
		
		afficherEntete(30, 
				  "    Vie : " + joueur.getHp() + "   Mana : " + joueur.getMana() + "\n\n"
				+ "Choisissez une action : \n"
				+ "[1] : Attaque Physique \n"
				+ "[2] : Attaque Magique \n"
				+ "[3] : Sac à dos");
		int choix = lectureInt("->", 3);
			
		switch(choix)
		{
			case 1 :
			{
				nettoyerConsole();
				menuAttaquesPhysiques(joueur, ennemi);
				break;
			}
			case 2 :
			{
				nettoyerConsole();
				menuAttaquesMagiques(joueur, ennemi);
				break;
			}
			case 3 : 
			{
				nettoyerConsole();
				joueur.getInventaire().utiliser_objet(joueur, ennemi, this);
				menuCombat(joueur, ennemi);
			}
			default :
			{break;}
		}
	}
	
	public void menuAttaquesPhysiques(Joueur joueur, Ennemi ennemi) 
	{
		afficherEntete(30, 
				  "Choisissez une attaque : \n"
				+ "[1] : " + joueur.getClasse().getAttaquesPhysiques().get(0).getNom() + "\n"
				+ "[2] : " + joueur.getClasse().getAttaquesPhysiques().get(1).getNom() + "\n"
				+ "[3] : Retour");
		int choix = lectureInt("->",3);
			
		switch(choix)
		{
			case 1 :
			{
				nettoyerConsole();
				descriptionAttaquesPhysiques(joueur, ennemi, 1);
				break;
			}
			case 2 :
			{
				nettoyerConsole();
				descriptionAttaquesPhysiques(joueur, ennemi, 2);
				break;
			}
			case 3 :
			{
				nettoyerConsole();
				menuCombat(joueur, ennemi);
				break;
			}
			default :
			{break;}
		}
	}
	
	public void descriptionAttaquesPhysiques(Joueur joueur, Ennemi ennemi, int choix){
		
		afficherEntete(30,
				  "Validez vous votre attaque !?\n\n"
				+ "Description : " + joueur.getClasse().getAttaquesPhysiques().get(choix-1).getDescription() + "\n\n"
				+ "[1] : Oui \n"
				+ "[2] : Non");
		int choixValidation = lectureInt("->",2);
			
		switch(choixValidation)
		{
			case 1:
			{
				switch(choix)
				{
					case 1:
					{
						combat(joueur, ennemi, joueur.getClasse().getAttaquesPhysiques().get(0));
						break;
					}
					case 2:
					{
						combat(joueur, ennemi, joueur.getClasse().getAttaquesPhysiques().get(1));
						break;
					}
					default:
					{break;}
				}
				break;
			}
			case 2:
			{
				nettoyerConsole();
				menuAttaquesPhysiques(joueur, ennemi);
				break;
			}
			default:
			{break;}
		}
	}
	
	public void menuAttaquesMagiques(Joueur joueur, Ennemi ennemi) {
		
		afficherEntete(30, 
				  "Choisissez une attaque : \n"
				+ "[1] : " + joueur.getClasse().getAttaquesMagiques().get(0).getNom() + "\n"
				+ "[2] : " + joueur.getClasse().getAttaquesMagiques().get(1).getNom() + "\n"
				+ "[3] : Retour");
		int choix = lectureInt("->",3);
			
		switch(choix)
		{
			case 1 :
			{
				nettoyerConsole();
				descriptionAttaquesMagiques(joueur, ennemi, 1);
				break;
			}
			case 2 :
			{
				nettoyerConsole();
				descriptionAttaquesMagiques(joueur, ennemi, 2);
				break;
			}
			case 3 :
			{
				nettoyerConsole();
				menuCombat(joueur, ennemi);
				break;
			}
			default :
			{break;}
		}
	}
	
	public void descriptionAttaquesMagiques(Joueur joueur, Ennemi ennemi, int choix){
		
		afficherEntete(30,
				  "Validez vous votre attaque !?\n\n"
				+ "Description : " + joueur.getClasse().getAttaquesMagiques().get(choix-1).getDescription() + "\n\n"
				+ "[1] : Oui \n"
				+ "[2] : Non");
		int choixValidation = lectureInt("->",2);
			
		switch(choixValidation)
		{
			case 1:
			{
				switch(choix)
				{
					case 1:
					{
						combat(joueur, ennemi, joueur.getClasse().getAttaquesMagiques().get(0));
						break;
					}
					case 2:
					{
						combat(joueur, ennemi, joueur.getClasse().getAttaquesMagiques().get(1));
						break;
					}
					default:
					{break;}
				}
				break;
			}
			case 2:
			{
				nettoyerConsole();
				menuAttaquesMagiques(joueur, ennemi);
				break;
			}
			default:
			{break;}
		}
	}	
	
	public void combat(Joueur joueur, Ennemi ennemi, Attaque attaque)
	{
		nettoyerConsole();
		afficherEntete(30, 
				  "     Début de l'attaque \n"
				+ "       Tour du Joueur !");
		
		debugScanner();
		stopProgramme();
		nettoyerConsole();
		
		joueur.attaqueEnnemi(joueur, ennemi, attaque);

		if(ennemi.getSante() <= 0) {
			
			afficherEntete(30,"Le monstre est mort ! Vous êtes victorieux !!!");
			debugScanner();
			
			joueur.getXp().xp(joueur, ennemi);
			joueur.recapitulatif();
		}
		else
		{
			nettoyerConsole();
			afficherEntete(30, "       Tour du monstre ! ");
			stopProgramme();
			
			ennemi.attaque(joueur);
			
			if(joueur.getHp() <= 0) {
				
				afficherEntete(30,"Le monstre a réussi a vous tuer... Game Over !");
				debugScanner();
				joueur.recapitulatif();
				stopProgramme();
				
				Menu menu = new Menu();
				menu.menuPrincipal();
				
			}
			else
			{
				nettoyerConsole();
				menuCombat(joueur, ennemi);
			}
		}
	}
}