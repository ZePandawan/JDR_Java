package Histoire;

import Commandes.Commandes;
import Joueur.Joueur;
import ModeLibre.Mode_Libre;

public class Menu {
	
	protected static Joueur joueur;
	
	Mode_Libre Libre = new Mode_Libre();
	Commandes Commande = new Commandes();
	Intro Intro = new Intro();
	Regles Regles = new Regles();
	
	public void MenuPrincipal()
	{
		Commande.NettoyerConsole();
		Commande.AfficherEntete(30,
				  "  LE SEIGNEUR DES ANNEAUX \n"
				+ "   La quête de l'anneau");
		Commande.StopProgramme();
		
		Commande.NettoyerConsole();
		Commande.AfficherEntete(30,
				  "[1] Nouvelle Histoire \n"
				+ "[2] Charger Histoire \n"
				+ "[3] Mode Libre \n"
				+ "[4] Règle du jeu \n"
				+ "[5] Quitter");
		
		int choix = Commande.LectureInt("->",5);
		
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
				ModeLibre();
				break;
			}
			case 4 :
			{
				Afficher_Regle();
				break;
			}
			case 5 :
			{
				System.exit(0);
			}
			default :
			{break;}
		}
	}
	
	public void NouvellePartie()
	{
		Intro.Introduction(joueur);
	}
	
	public void Afficher_Regle()
	{
		Regles.Afficher_Regles();
		MenuPrincipal();
	}
	
	public void ModeLibre()
	{
		Libre.ModeLibre();
	}
}
