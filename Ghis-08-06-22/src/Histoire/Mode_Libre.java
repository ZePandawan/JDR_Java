package Histoire;

import Joueur.Joueur;
import Terrain.*;
import java.util.Scanner;

import Commandes.*;

public class Mode_Libre{

	Commandes commande = new Commandes();
	protected static Scanner scanner = new Scanner(System.in);
	protected Shop shop = new Shop();
	
	public void modeLibre()
	{
		commande.afficherEntete(30, "Quel est votre nom ?");
		System.out.print("-> Nom : ");
		String nom = scanner.next();
		
		Joueur joueur = new Joueur(nom);
		
		int choix = 0;
		
		while(choix !=10)
		{
			commande.nettoyerConsole();
			commande.afficherEntete(30,
					"""
							Choisissez une zone de la carte :\s

							[1] Foret\s
							[2] Plaine\s
							[3] Plaine desolées\s
							[4] Marais\s
							[5] Montagne\s
							[6] Montagne du destin\s
							[7] Forteresse\s
							[8] Tour de Sauron\s\n
							[9] Shop\s\n
							[10] Retour\s
							""");
			choix = commande.lectureInt("->", 9);

			switch (choix) {
				case 1 : {
					Terrain foret = Terrain.Foret;
					foret.combatTerrain(joueur);
					break;
				}
				case 2 : {
					Terrain plaine = Terrain.Plaine;
					plaine.combatTerrain(joueur);
					break;
				}
				case 3 : {
					Terrain plaine_desolees = Terrain.Plaine_desolees;
					plaine_desolees.combatTerrain(joueur);
					break;
				}
				case 4 : {
					Terrain marais = Terrain.Marais;
					marais.combatTerrain(joueur);
					break;
				}
				case 5 : {
					Terrain montagne = Terrain.Montagne;
					montagne.combatTerrain(joueur);
					break;
				}
				case 6 : {
					Terrain montagne_du_destin = Terrain.Montagne_du_destin;
					montagne_du_destin.combatTerrain(joueur);
					break;
				}
				case 7 : {
					Terrain forteresse = Terrain.Forteresse;
					forteresse.combatTerrain(joueur);
					break;
				}
				case 8 : {
					Terrain tour_de_sauron = Terrain.Tour_de_Sauron;
					tour_de_sauron.combatTerrain(joueur);
					break;
				}
				case 9 : {
					shop.afficherShop(joueur);
					break;
				}
				case 10 :
				{
					break;
				}
				default :
				{break;}
			}
		}
	}
}