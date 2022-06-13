package Histoire;

import Joueur.Joueur;
import Monstres.Ennemi;

public class Chapitre_2 extends Histoire implements Chapitre2Intf {

	public void chapitre2(Joueur joueur)
	{
		commande.nettoyerConsole();
		commande.afficherEntete(122,
				  "                                                       CHAPITRE II													 \n"
				+ "                                              Un alié quelque peu spécial											 \n\n"
				+ "                  *Vous voilà de retour sur votre chemin que cela soit de votre plein grés ou par obligation.*        \n"
				+ "                  *La route jusqu'au mordor est encore longue et ce ne sont pas les obstacles qui manqueront.*        \n");
		commande.stopProgramme();
		commande.nettoyerConsole();
		commande.afficherEntete(122, 
				  "                                  *Votre chemin vous à mené jusqu'à la forêt de Druadan* 							\n"
				+ "		*Cette forêt si paisible dans vos souvenirs ne laisse désormais place qu'à une ambiance lugubre et terrifiante* \n"
				+ "			*Vous avancez avec vigilance dans ce lieu, analysant chaque recoin et chaque branche d'arbre.* 				");
		commande.stopProgramme();
		commande.nettoyerConsole();
		commande.afficherEntete(122, 
			      "                  *Soudain ! Survenant de derrière un arbre, un gobelin vous prend en embuscade.*                   \n"
				+ "                      *Vous n'avez d'autre choix que de sortir votre arme et de vous battre !*                      ");
		commande.stopProgramme();
		commande.nettoyerConsole();
		
		Ennemi gobelin = Ennemi.Gobelin;
		commande.menuCombat(joueur, gobelin);
		
		commande.nettoyerConsole();
		commande.afficherEntete(122, 
				  "          *Votre ennemi est désormais mort... Vous décider de prendre un certains temps afin de panser vos blessures.* \n"
				+ "                       *En relevant la tête vous remarquer de la dépouille du mort n'est plus là !* \n"
				+ "                         *Des traces de sang se dirigent en direction d'un mur en pierre écroulé.* \n");
		commande.stopProgramme();
		commande.nettoyerConsole();
		commande.afficherEntete(122, 
				  "        *Au fur et à mesure que vous vous rapprochez du mur, vous entendez des rales et du bruits de craquements d'os.* \n"
				+ "                           *La créature commence à parler dans un dialecte que vous connaissez* \n\n"
				+ "??? : Oh oui mon précieux ! Nous allons nous régaler ce soir ! \n"
				+ "??? : Grâce à cet étranger, qui a tué le gobelin, nous allons soupeeeeeeeeeeer !");
		
		commande.stopProgramme();
		commande.nettoyerConsole();
		commande.afficherEntete(122, 
				  "??? : Qu'est ce que tu dis mon précieux ?... Nous devrions manger l'étranger aussi ?! *GOLLUM GOLLUM* \n"
				+ "Gollum : Il faut retrouver l'étranger... Le tuer, et le dévoreeeeeeeer. \n\n"
				+ "                         *Gollum est sur le point de venir vous attaquer*");
		commande.stopProgramme();
		commande.nettoyerConsole();
		
		Ennemi gollum = Ennemi.Gollum;
		attaqueGollum(joueur, gollum);
		
		commande.stopProgramme();
		commande.nettoyerConsole();
		commande.afficherEntete(122, 
				  "Gollum : Nooooooon ne nous tuez pas, ayez pitié !!! \n"
				+ "Gollum : Gollum peut vous aider ! Nous connaissons un chemin secret jusqu'au Mordor \n"
				+ "Gollum : Oui ouiiiiii, suivez nous ! Nous savons comment détruire Sauron ! \n"
				+ "Gollum : Vite étranger, vite avant que d'autres monstres n'arrivent !");
		commande.stopProgramme();
		commande.nettoyerConsole();
		
		commande.afficherEntete(122, 
				  "                 *C'est donc sur cette alliance quelque peu imprévue que votre aventure se poursuit.*                 \n"
				+ "                 *Pouvez-vous seulement compter sur Gollum pour vous menez jusqu'à votre objectif ?*                  \n"
				+ "                                         *Réussirez vous à battre Sauron ?!*                                          \n"
				+ "                      *Tant de questions, qui resteront pour le moment sans réponse...\n\n"
				+ "                                                       *FIN*");
		commande.stopProgramme();
		System.exit(0);
	}
	
	public void attaqueGollum(Joueur joueur, Ennemi gollum)
	{
		commande.afficherEntete(33, 
				  "Que voulez vous faire ?\n\n"
				+ "[1] Tendre un piège (réussite : " + joueur.getClasse().getMental() + "%) \n"
				+ "[2] Attaquer Gollum");
		int choix = commande.lectureInt("->", 2);
		
		switch(choix)
		{
			case 1 :
			{
				if(joueur.getClasse().getMental() >= random.nextInt(1, 101))
				{
					commande.afficherEntete(122, "Vous avez réussi a piéger Gollum ! \n");
					commande.stopProgramme();
					break;
				}
				else
				{
					commande.afficherEntete(122, 
							  "Vous n'avez pas réussi a piéger Gollum ! \n"
							+ "Celui ci se retourne vers vous et vous attaque");
					commande.debugScanner();
					commande.stopProgramme();
					commande.menuCombat(joueur, gollum);
					break;
				}
			}
			case 2 :
			{
				commande.afficherEntete(122, "Vous attaquez Gollum ! \n");
				commande.menuCombat(joueur, gollum);
				break;
			}
			default :
			{break;}
		}
	}
}