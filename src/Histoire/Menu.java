package Histoire;

import Commandes.Interface;
import Joueur.Joueur;

public class Menu {
	
	static Joueur joueur;
	
	Interface Commande = new Interface();
	Intro Intro = new Intro();
	
	public void MenuPrincipal()
	{
		Commande.NettoyerConsole();
		Commande.AfficherEntete(30,
				  "  LE SEIGNEUR DES ANNEAUX \n"
				+ "   La quête de l'anneau");
		Commande.StopProgramme();
		
		Commande.NettoyerConsole();
		Commande.AfficherSeparateur(30);
		System.out.println("[1] Nouvelle Partie");
		System.out.println("[2] Charger Partie");
		System.out.println("[3] Règle du jeu");
		System.out.println("[4] Quitter");
		Commande.AfficherSeparateur(30);
		
		int choix = Commande.LectureInt("->",4);
		
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
		Intro.Introduction(joueur);
	}
}
