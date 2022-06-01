package ModeLibre;

import Joueur.Joueur;
import Terrain.*;

import java.util.Scanner;

import Commandes.*;

public class Mode_Libre {

	Commandes Commande = new Commandes();
	protected static Scanner scanner = new Scanner(System.in);
	
	public void ModeLibre()
	{
		Commande.AfficherEntete(30, "Quel est votre nom ?");
		String nom = scanner.next();
		
		Joueur joueur = new Joueur(nom);
		Commande.AfficherEntete(30,
				  "Choisissez une zone de la carte : \n\n"
				+ "[1] Foret \n"
				+ "[2] Plaine \n");
		int choix = Commande.LectureInt("->", 2);
		
		switch(choix)
		{
			case 1:
			{
				Foret foret = new Foret();
				foret.CombatTerrain(joueur);
				break;
			}
			case 2:
			{
				break;
			}
			default :
			{break;}
		}
	}
}
