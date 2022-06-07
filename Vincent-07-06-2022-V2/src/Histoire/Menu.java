package Histoire;

import Commandes.Commandes;
import Joueur.Joueur;

public class Menu {
	
	protected static Joueur joueur;
	
	protected Mode_Libre Libre = new Mode_Libre();
	protected Commandes Commande = new Commandes();
	protected Intro Intro = new Intro();
	protected Regles Regles = new Regles();
	
	public void menuPrincipal()
	{
		Commande.nettoyerConsole();
		Commande.afficherEntete(30,
				  "  LE SEIGNEUR DES ANNEAUX \n"
				+ "   La quête de l'anneau");
		Commande.stopProgramme();
		
		Commande.nettoyerConsole();
		Commande.afficherEntete(30,
				  "[1] Nouvelle Histoire \n"
				+ "[2] Charger Histoire \n"
				+ "[3] Mode Libre \n"
				+ "[4] Règle du jeu \n"
				+ "[5] Quitter");
		
		int choix = Commande.lectureInt("->",5);
		
		switch(choix)
		{
			case 1 : 
			{
				nouvellePartie();
				break;
			}
			case 2 :
			{
				//ChargerPartie();
				break;
			}
			case 3 :
			{
				modeLibre();
				break;
			}
			case 4 :
			{
				afficher_Regle();
				break;
			}
			case 5 :
			{
				System.exit(0);
			}
			default :
			{break;}
		}
		menuPrincipal();
	}
	
	public void nouvellePartie()
	{
		Intro.introduction(joueur);
	}
	
	public void afficher_Regle()
	{
		Regles.afficher_Regles();
		menuPrincipal();
	}
	
	public void modeLibre()
	{
		Libre.modeLibre();
	}
}