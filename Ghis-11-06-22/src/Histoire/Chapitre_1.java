package Histoire;
import Joueur.Joueur;
import Monstres.*;
import Consommables.Consommables;

public class Chapitre_1 extends Histoire implements Chapitre1Intf{

	public void chapitre1(Joueur joueur)
	{
		commande.nettoyerConsole();
		commande.afficherEntete(122, 
				  "                                                       CHAPITRE I														\n"
				+ "                                           Le début d'une longue aventure											   \n\n"
				+ "*Vous suivez la route principale jusqu'à Edoras la capitale du Rohan. Cette ville est pleine de vie et est parfaite pour*\n"
				+ "                     *se ravitailler en provision et passer du bon temps avant une longue aventure.*                     \n");
		
		commande.stopProgramme();
		commande.nettoyerConsole();
		commande.afficherEntete(122, 
				  "\n*Vous arrivez en ville, la nuit commence à tomber. Les soldats montent la garde et certains commerces ferment leur porte*\n");
		commande.stopProgramme();
		commande.nettoyerConsole();
		
		choix_Edoras(joueur);
		
		Chapitre_2 chpt2 = new Chapitre_2();
		chpt2.Chapitre2();
	}
	
	public void choix_Edoras(Joueur joueur)
	{
		commande.afficherEntete(30, 
				  "\n    Que désirez vous faire ? \n\n"
				+ "[1] Continuer votre route \n"
				+ "[2] Visiter le shop \n"
				+ "[3] Vous reposer au bar \n");
		int choix = commande.lectureInt("->", 3);
		
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
				shop.afficherShop(joueur);
				choix_Edoras(joueur);
				break;
			}
			case 3 :
			{
				edorasBar(joueur);
				break;
			}
			default :
			{
				
			}
		}
	}
	
	public void edorasBar(Joueur joueur)
	{
		commande.nettoyerConsole();
		commande.afficherEntete(122,
				  "                  *Vous entrez dans le bar. Une odeur de bière et de sueur arrive jusqu'à votre nez.*                  \n"
				+ "         *L'ambiance est aux festivités. Au centre dela pièce un barde accompagne la dance d'une jolie femme.*         \n"
				+ "                               *Le barman remarque votre présence et se tourne vers vous*                              \n\n"
				+ "Barman : Hey vous ! Vous n'êtes pas du coin ?! Je vous sers une bière ?! \n");
		
		commande.debugScanner();
		commande.stopProgramme();
		commande.nettoyerConsole();
		
		choixBoisson(joueur);
		
		commande.nettoyerConsole();
		commande.afficherEntete(122,
				  "\n       *La soirée bat son plein, vous décidez de vous asseoir près du feu et d'écouter les histoires du barde*        \n"
				+ "             *La fatigue commence doucement à vous prendre, vous poussant à repenser à votre périeuse quête.*           \n"
				+ "                  *Cette nuit sera surement la dernière que vous passerez dans un endroit conforable.*                  \n");
		
		commande.stopProgramme();
		commande.nettoyerConsole();
		commande.afficherEntete(122, 
				  "\n                        *Dans le coin du bar, un homme semble vous regarder avec insistance.*                        \n"
				+ "                                *Il finit par s'approcher de vous, lentement et en titubant.*                           \n"
				+ "                            *Vous sentez alors une forte odeur de bière venant de ce geant.*                           \n\n"
				+ "Homme odorant : J'aime pô ta tête étranger ! Viens t'battre si t'es un homme ! \n");
		
		Ennemi brute = Ennemi.Brute;
		commande.menuCombat(joueur, brute);
	}
	
	public void choixBoisson(Joueur joueur)
	{
		commande.afficherEntete(30, 
				  "\n      Votre réponse :\n\n"
				+ "[1] : Avec plaisir ! \n"
				+ "[2] : Juste de l'eau. \n");
		int choix = commande.lectureInt("->", 2);
		
		switch(choix)
		{
			case 1 :
			{
				commande.nettoyerConsole();
				commande.afficherEntete(30, 
						  "Barman : ça vous ferra 2 pièces d'or ! \n\n"
						+ "[1] Payer \n"
						+ "[2] Vous m'en ferrez cadeau hein ?! (réussite : " + joueur.getClasse().getSocial() + "%) \n"
						+ "[3] Je m'en tiendrai à de l'eau.  \n");
				int choix2 = commande.lectureInt("->", 3);
				
				switch(choix2)
				{
					case 1 :
					{
						shop.acheterItem(Consommables.Biere, joueur);
						
						commande.nettoyerConsole();
						System.out.println("La bière a été ajoutée à votre inventaire");
						commande.stopProgramme();
						break;
					}
					case 2 :
					{
						int resultat_de = random.nextInt(1, 101);
 						if(resultat_de < joueur.getClasse().getSocial())
 						{
 							commande.nettoyerConsole();
 							System.out.println("C'est une réussite !!! \nLa bière a été ajoutée à votre inventaire");
 							commande.debugScanner();
 							commande.stopProgramme();
 						}
 						else
 						{
 							commande.nettoyerConsole();
 							commande.afficherEntete(122, 
 									  "Barman : Bien sur, vous voulez mon bar avec ?! \n"
 									+ "Barman : Dégagez de là !!");
 							
 							commande.debugScanner();
 							commande.stopProgramme();
 							
 							Chapitre_2 chpt2 = new Chapitre_2();
 							chpt2.Chapitre2();	
 						}
 						break;
					}
					case 3 :
					{
						commande.nettoyerConsole();
						commande.afficherEntete(122, 
								  "Barman : Bien ! Un peu d'eau pour le jeune homme ! \n"
								+ "Barman : Installez vous où bon vous semble.");
						commande.stopProgramme();
						break;
					}
					default:
					{break;}
				}
				break;
			}
			case 2 :
			{
				commande.afficherEntete(122, 
						  "Barman : Bien ! Un peu d'eau pour le jeune homme ! \n"
						+ "Barman : Installez vous où bon vous semble.");
				commande.debugScanner();
				commande.stopProgramme();
				break;
			}
			default:
			{break;}
		}
	}
}