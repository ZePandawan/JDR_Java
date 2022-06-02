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
						""");
		int choix = Commande.LectureInt("->", 8);

		switch (choix) {
			case 1 : {
				TerrainEnum foret = TerrainEnum.Foret;
				foret.CombatTerrain(joueur);
			}
			case 2 : {
				TerrainEnum plaine = TerrainEnum.Plaine;
				plaine.CombatTerrain(joueur);
			}
			case 3 : {
				TerrainEnum plaine_desolees = TerrainEnum.Plaine_desolees;
				plaine_desolees.CombatTerrain(joueur);
			}
			case 4 : {
				TerrainEnum marais = TerrainEnum.Marais;
				marais.CombatTerrain(joueur);
			}
			case 5 : {
				TerrainEnum montagne = TerrainEnum.Montagne;
				montagne.CombatTerrain(joueur);
			}
			case 6 : {
				TerrainEnum montagne_du_destin = TerrainEnum.Montagne_du_destin;
				montagne_du_destin.CombatTerrain(joueur);
			}
			case 7 : {
				TerrainEnum forteresse = TerrainEnum.Forteresse;
				forteresse.CombatTerrain(joueur);
			}
			case 8 : {
				TerrainEnum tour_de_sauron = TerrainEnum.Tour_de_Sauron;
				tour_de_sauron.CombatTerrain(joueur);
			}
		}
	}
}
