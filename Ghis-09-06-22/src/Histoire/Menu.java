package Histoire;

import Commandes.Commandes;
import Joueur.Joueur;

public class Menu implements MenuIntf {
	
	protected Mode_Libre libre = new Mode_Libre();
	protected Commandes commande = new Commandes();
	protected Intro intro = new Intro();
	
	protected Joueur joueur;
	
	public void menuPrincipal()
	{
		commande.nettoyerConsole();
		commande.afficherEntete(30,
				  "  LE SEIGNEUR DES ANNEAUX \n"
				+ "   La quête de l'anneau");
		commande.stopProgramme();
		
		commande.nettoyerConsole();
		commande.afficherEntete(30,
				  "[1] Nouvelle Histoire \n"
				+ "[2] Charger Histoire \n"
				+ "[3] Mode Libre \n"
				+ "[4] Règle du jeu \n"
				+ "[5] Quitter");
		
		int choix = commande.lectureInt("->",5);
		
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
		intro.introduction(joueur);
	}
	
	public void afficher_Regle()
	{
		commande.afficherEntete(122,
				  "                                                     LISTE DES REGLES                                                     \n\n"
				+ "Bienvenue dans le Seigneur des Anneaux : La quête de l'anneau. Ce jeu est basé sur le principe d'un jeu de rôle / RPG.    \n"
				+ "C'est à dire que chacune de vos actions (Attaque, Intimidation etc...) se verront accompagnée d'un jet de dé à 100 faces. \n"
				+ "Si le résultat du dé est inférieur ou égale à la compétence sur laquelle se base l'action, celle-ci est réussi.           \n"
				+ "A l'inverse, si le résultat du dé est supérieur à votre stat, votre action se verra être un échec.                        \n\n"
				+ "Vous disposez de 2 mode de jeu. Mode Histoire, qui vous plongera dans la quête de l'anneau.                               \n"
				+ "L'autre, Mode Libre, vous permettra de voyager sur la carte et d'affronter divers ennemis.                                  \n\n"
				+ "Le mode Histoire est recommandé pour tout nouveau joueur afin de bien comprendre le système qu'itilise ce jeu.            \n");
		
		commande.stopProgramme();
		menuPrincipal();
	}
	
	public void modeLibre()
	{
		libre.modeLibre();
	}
}