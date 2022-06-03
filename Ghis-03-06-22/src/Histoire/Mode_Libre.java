package Histoire;

import Joueur.Joueur;
import Terrain.*;
import java.util.Scanner;

import Commandes.*;

public class Mode_Libre{

	Commandes Commande = new Commandes();
	protected static Scanner scanner = new Scanner(System.in);
	
	public void ModeLibre()
	{
		Commande.AfficherEntete(30, "Quel est votre nom ?");
		System.out.print("-> Nom : ");
		String nom = scanner.next();
		
		Joueur joueur = new Joueur(nom);
		
		int choix = 0;
		
		while(choix !=9)
		{
			Commande.AfficherEntete(30,
					"""
							Choisissez une zone de la carte :\s

							[1] Foret\s
							[2] Plaine\s
							[3] Plaine desolées\s
							[4] Marais\s
							[5] Montagne\s
							[6] Montagne du destin\s
							[7] Forteresse\s
							[8] Tour de Sauron\s
							[9] Retour\s
							""");
			choix = Commande.LectureInt("->", 9);

			switch (choix) {
				case 1 : {
					Terrain foret = Terrain.Foret;
					foret.CombatTerrain(joueur);
					break;
				}
				case 2 : {
					Terrain plaine = Terrain.Plaine;
					plaine.CombatTerrain(joueur);
					break;
				}
				case 3 : {
					Terrain plaine_desolees = Terrain.Plaine_desolees;
					plaine_desolees.CombatTerrain(joueur);
					break;
				}
				case 4 : {
					Terrain marais = Terrain.Marais;
					marais.CombatTerrain(joueur);
					break;
				}
				case 5 : {
					Terrain montagne = Terrain.Montagne;
					montagne.CombatTerrain(joueur);
					break;
				}
				case 6 : {
					Terrain montagne_du_destin = Terrain.Montagne_du_destin;
					montagne_du_destin.CombatTerrain(joueur);
					break;
				}
				case 7 : {
					Terrain forteresse = Terrain.Forteresse;
					forteresse.CombatTerrain(joueur);
					break;
				}
				case 8 : {
					Terrain tour_de_sauron = Terrain.Tour_de_Sauron;
					tour_de_sauron.CombatTerrain(joueur);
					break;
				}
				case 9 : {
					break;
				}
				default :{
					break;
				}
			}
		}
	}
}