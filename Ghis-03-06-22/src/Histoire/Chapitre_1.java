package Histoire;
import Joueur.Joueur;
import Monstres.*;

public class Chapitre_1 extends Histoire {

	
	public void Chapitre1(Joueur joueur)
	{
		Commande.NettoyerConsole();
		Commande.AfficherEntete(122, 
				  "                                                       CHAPITRE I														\n"
				+ "                                           Le d�but d'une longue aventure											   \n\n"
				+ "*Vous suivez la route principale jusqu'� Edoras la capitale du Rohan. Cette ville est pleine de vie et est parfaite pour*\n"
				+ "                     *se ravitailler en provision et passer du bon temps avant une longue aventure.*                     \n");
		
		Commande.StopProgramme();
		Commande.NettoyerConsole();
		Commande.AfficherEntete(122, 
				  "\n*Vous arrivez en ville, la nuit commence � tomber. Les soldats montent la garde et certains commerces ferment leur porte*\n");
		Commande.StopProgramme();
		Commande.NettoyerConsole();
		
		Choix_Edoras(joueur);
		
		Chapitre_2 chpt2 = new Chapitre_2();
		chpt2.Chapitre2();
	}
	
	public void Choix_Edoras(Joueur joueur)
	{
		Commande.AfficherEntete(30, 
				  "\n    Que d�sirez vous faire ? \n\n"
				+ "[1] Continuer votre route \n"
				+ "[2] Visiter le shop \n"
				+ "[3] Vous reposer au bar \n");
		int choix = Commande.LectureInt("->", 3);
		
		switch(choix)
		{
			case 1 :
			{
				Chapitre_2 chpt2 = new Chapitre_2();
				chpt2.Chapitre2();
				break;
			}
			case 2 :
			{
				//Shop de Vincent
				break;
			}
			case 3 :
			{
				EdorasBar(joueur);
				break;
			}
			default :
			{
				
			}
		}
	}
	
	public void EdorasBar(Joueur joueur)
	{
		Commande.NettoyerConsole();
		Commande.AfficherEntete(122,
				  "                  *Vous entrez dans le bar. Une odeur de bi�re et de sueur arrive jusqu'� votre nez.*                  \n"
				+ "         *L'ambiance est aux festivit�s. Au centre dela pi�ce un barde accompagne la dance d'une jolie femme.*         \n"
				+ "                               *Le barman remarque votre pr�sence et se tourne vers vous*                              \n\n"
				+ "Barman : Hey vous ! Vous n'�tes pas du coin ?! Je vous sers une bi�re ?! \n");
		
		Commande.DebugScanner();
		Commande.StopProgramme();
		Commande.NettoyerConsole();
		
		ChoixBoisson(joueur);
		
		Commande.NettoyerConsole();
		Commande.AfficherEntete(122,
				  "\n       *La soir�e bat son plein, vous d�cidez de vous asseoir pr�s du feu et d'�couter les histoires du barde*        \n"
				+ "             *La fatigue commence doucement � vous prendre, vous poussant � repenser � votre p�rieuse qu�te.*           \n"
				+ "                  *Cette nuit sera surement la derni�re que vous passerez dans un endroit conforable.*                  \n");
		
		Commande.StopProgramme();
		Commande.NettoyerConsole();
		Commande.AfficherEntete(122, 
				  "\n                        *Dans le coin du bar, un homme semble vous regarder avec insistance.*                        \n"
				+ "                                *Il finit par s'approcher de vous, lentement et en titubant.*                           \n"
				+ "                            *Vous sentez alors une forte odeur de bi�re venant de ce geant.*                           \n\n"
				+ "Homme odorant : J'aime p� ta t�te �tranger ! Viens t'battre si t'es un homme ! \n");
		
		Ennemi brute = Ennemi.Brute;
		Commande.MenuCombat(joueur, brute);
		
	}
	
	public void ChoixBoisson(Joueur joueur)
	{
		Commande.AfficherEntete(30, 
				  "\n      Votre r�ponse :\n\n"
				+ "[1] : Avec plaisir ! \n"
				+ "[2] : Juste de l'eau. \n");
		int choix = Commande.LectureInt("->", 2);
		
		switch(choix)
		{
			case 1 :
			{
				Commande.NettoyerConsole();
				Commande.AfficherEntete(30, 
						  "Barman : �a vous ferra 2 pi�ces d'or ! \n\n"
						+ "[1] Payer \n"
						+ "[2] Vous m'en ferrez cadeau hein ?! (r�ussite : " + joueur.getClasse().getSocial() + "%) \n"
						+ "[3] Je m'en tiendrai � de l'eau.  \n");
				int choix2 = Commande.LectureInt("->", 3);
				
				switch(choix2)
				{
					case 1 :
					{
						//joueur.setOr(2)
						//joueur.AddInventory(Bi�re);
						
						Commande.NettoyerConsole();
						System.out.println("La bi�re a �t� ajout�e � votre inventaire");
						Commande.StopProgramme();
						break;
					}
					case 2 :
					{
						int resultat_de = random.nextInt(1, 101);
 						if(resultat_de < joueur.getClasse().getSocial())
 						{
 							//joueur.AddInventory(Bi�re)
 							
 							Commande.NettoyerConsole();
 							System.out.println("C'est une r�ussite !!! \nLa bi�re a �t� ajout�e � votre inventaire");
 							Commande.DebugScanner();
 							Commande.StopProgramme();
 						}
 						else
 						{
 							Commande.NettoyerConsole();
 							Commande.AfficherEntete(122, 
 									  "Barman : Bien sur, vous voulez mon bar avec ?! \n"
 									+ "Barman : D�gagez de l� !!");
 							
 							Commande.DebugScanner();
 							Commande.StopProgramme();
 							
 							Chapitre_2 chpt2 = new Chapitre_2();
 							chpt2.Chapitre2();	
 						}
 						break;
					}
					case 3 :
					{
						Commande.NettoyerConsole();
						Commande.AfficherEntete(122, 
								  "Barman : Bien ! Un peu d'eau pour le jeune homme ! \n"
								+ "Barman : Installez vous o� bon vous semble.");
						Commande.StopProgramme();
						break;
					}
					default:
					{break;}
				}
				break;
			}
			case 2 :
			{
				Commande.AfficherEntete(122, 
						  "Barman : Bien ! Un peu d'eau pour le jeune homme ! \n"
						+ "Barman : Installez vous o� bon vous semble.");
				Commande.DebugScanner();
				Commande.StopProgramme();
				break;
			}
			default:
			{break;}
		}
	}
}
