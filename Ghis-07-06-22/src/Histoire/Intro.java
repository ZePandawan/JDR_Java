package Histoire;

import Attaque.Attaque;
import Joueur.*;
import Monstres.Ennemi;

public class Intro extends Histoire {

	public void introduction(Joueur joueur)
	{
		commande.nettoyerConsole();
		commande.afficherEntete(122,
				  "                                                       INTRODUCTION                                                       \n\n"
				+ "                    *Plongé dans vos pensées, vous repensez au chemin qui vous à ammené jusqu'ici...*                     \n"
				+ "*Vous êtes aligné en rang avec une cinquantaine de personnes. Humains, Nains, Elfes, vous passez en analyse chaque personne.*\n"
				+ "      *Nombreux d'entre eux sont des rescapés d'anciennes batailles, d'autres, des survivants de villages assiégés.*      \n"
				+ "                          *Un chevalier fais son apparition et débute un discours à haute voix.*                          \n");
		
		commande.stopProgramme();
		commande.nettoyerConsole();
		commande.afficherEntete(122,
				  "\n??? : Vous n'êtes pas ici pour vous lamenter sur votre anciennes vies ! \n"
				+ "??? : L'armée de Sauron s'approche à grand pas ! Et les orques sont quasiment aux portes de la ville ! \n"
				+ "??? : Pour ceux qui ne me connaissent pas... Je suis Aragorn ! Fils d'Arathorn ! \n"
				+ "Aragorn : Je serai votre commandant pendant le siège de cette ville ! \n\n"
				+ "                               *Aragorn tourne le regard vers vous et vous pointe du doigt*                               \n"
				+ "\nAragorn : Toi là ! Approche ! Nous allons voir si tu es digne de défendre cette ville !\n");
		
		commande.stopProgramme();
		joueur = defPersonnage(joueur);
		
		commande.stopProgramme();
		commande.afficherEntete(122,  
				    "\nAragorn : Bien ! Maintenant que votre contrat est terminé \n"
				  + "Aragorn : Il est maintenant temps de te former à la bataille, suis moi " + joueur.getName() +" !                    \n");
		commande.stopProgramme();
		combatIntro(joueur);
		
		
		commande.stopProgramme();
		commande.nettoyerConsole();
		commande.afficherEntete(122,  
				   "\nAragorn : Beau travail " + joueur.getName() +"                     \n"
				 + "Aragorn : Maintenant que tu t'es prouvé légitime de défendre cette ville, je vais t'attribuer une mission.\n"
				 + "Aragorn : Nous ne gagnerons surement pas cette bataille, les armées de Saurons sont trop importantes\n"
				 + "Aragorn : Le seul moyen de nous sauver et de détruire Sauron ! \n");
		commande.stopProgramme();
		
		commande.nettoyerConsole();
		commande.afficherEntete(122,  
				   "\nAragorn : Tu devras donc te faufiler jusqu'au Mordor et affronter Sauron.                     \n"
				 + "Aragorn : Toutes ses troupes seront concentrées ici, tu auras donc un avantage.\n"
				 + "Aragorn : Tu auras 4 jours de voyages, nous te fournirons armes, armure, vivre et monture.\n"
				 + "Aragorn : Nous comptons sur toi mon ami ! \n");
		commande.stopProgramme();
		
		
		Chapitre_1 Chp1 = new Chapitre_1();
		Chp1.chapitre1(joueur);
				
	}
	
	public void combatIntro(Joueur joueur) {
		commande.nettoyerConsole();
		commande.afficherEntete(122,  
				    "\nAragorn : Commence d'abord par te munir de ton/ta " + joueur.getClasse().getArme().getNom() + " ce sera ton seul moyen de survie pendant cette guerre.\n\n"
				  + "             *Vous récupérez votre équipement, l'inspectez et vous préparez pour le début de l'entrainement*             \n\n"
				  + "Aragorn : Tout au long de ton aventure, tu renconteras principalement 2 type de créatures. \n"
				  + "Aragorn : Tu as d'abord les créatures dites 'Physique' comme toi ou moi. \n"
				  + "Aragorn : Grâce à notre armure nous avons une résistance aux attaques physiques. \n"
				  + "Aragorn : De l'autre côté les créatures 'Magique' ont une résistances aux attaques magiques. \n"
				  + "Aragorn : Soit donc bien minutieux quant aux attaques que tu utilises.\n");
		commande.stopProgramme();
		
		commande.nettoyerConsole();
		commande.afficherEntete(122,  
				      "\nAragorn : Commençons l'entrainement !"
				    + "\nAragorn : A toi l'honneur mon ami\n");
		
		Ennemi Aragorn = Ennemi.Aragorn;
		
		tutorielMenuCombat(joueur, Aragorn);
	}
	
	public void tutorielMenuCombat(Joueur joueur, Ennemi ennemi)
	{
		commande.afficherEntete(30,
				  "Choisissez une action :\n\n"
				+ "[1] : Attaque Physique\n"
				+ "[2] : Attaque Magique");
		//System.out.println("[3] : Sac");
		//System.out.println("[4] : Parade / Esquive");
		int choix = commande.lectureInt("->", 2);
			
		switch(choix)
		{
			case 1 :
			{
				commande.nettoyerConsole();
				commande.afficherEntete(122,
						  "\nAragorn : N'oublies pas que je suis une créature Physique ! \n"
						+ "Aragorn : Ce genre d'attaque n'a que très peu d'effet sur moi ! \n");
				tutorielMenuCombat(joueur, ennemi);
				break;
			}
			case 2 :
			{
				commande.nettoyerConsole();
				tutorielMenuAttaquesMagiques(joueur, ennemi);
				break;
			}
			default :
			{break;}
		}
	}
	
	public void tutorielMenuAttaquesMagiques(Joueur joueur, Ennemi ennemi)
	{
		commande.afficherEntete(30, 
				  "Choisissez une attaque : \n"
				+ "[1] : " + joueur.getClasse().getAttaquesMagiques().get(0).getNom() + "\n"
				+ "[2] : " + joueur.getClasse().getAttaquesMagiques().get(1).getNom() + "\n"
				+ "[3] : Retour");
		int choix = commande.lectureInt("->",3);
			
		switch(choix)
		{
			case 1 :
			{
				commande.nettoyerConsole();
				tutorielDescriptionAttaqueMagiques(joueur, ennemi, 1);
				break;
			}
			case 2 :
			{
				commande.nettoyerConsole();
				tutorielDescriptionAttaqueMagiques(joueur, ennemi, 2);
				break;
			}
			case 3 :
			{

				commande.nettoyerConsole();
				tutorielMenuCombat(joueur, ennemi);
				break;
			}
			default :
			{break;}
		}	
	}
	
	public void tutorielDescriptionAttaqueMagiques(Joueur joueur, Ennemi ennemi, int choix)
	{

		commande.afficherEntete(30,
				  "Validez vous votre attaque !?\n\n"
				+ "Description : " + joueur.getClasse().getAttaquesMagiques().get(choix-1).getDescription() + "\n\n"
				+ "[1] : Oui \n"
				+ "[2] : Non");
		
		int choixValidation = commande.lectureInt("->",2);
			
		switch(choixValidation)
		{
			case 1 :
			{
				switch(choix)
				{
					case 1 :
					{
						commande.nettoyerConsole();
						tutorielCombat(joueur, ennemi, joueur.getClasse().getAttaquesMagiques().get(0));
						break;
					}
					case 2 :
					{
						commande.nettoyerConsole();
						tutorielCombat(joueur, ennemi, joueur.getClasse().getAttaquesMagiques().get(1));
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 2 :
			{
				commande.nettoyerConsole();
				tutorielMenuAttaquesMagiques(joueur, ennemi);
				break;
			}
			default :
			{break;}
		}
	}
	
	public void tutorielCombat(Joueur joueur, Ennemi ennemi, Attaque attaque)
	{
		commande.nettoyerConsole();
		commande.afficherEntete(30,
				  "    Début de l'attaque !\n"
				+ "     Tour du Joueur ! ");
		
		joueur.attaqueEnnemi(joueur, ennemi, attaque);
		joueur.setMana(joueur.getClasse().getMana());
		
		commande.debugScanner();
		commande.stopProgramme();
		commande.nettoyerConsole();
		
		if(ennemi.getSante() <= 0) 
		{
			commande.afficherEntete(30, 
					  "   Le monstre est mort ! \n"
					+ "   Vous êtes victorieux !");
			joueur.recapitulatif();
		}
		else
		{
			commande.nettoyerConsole();
			tutorielMenuCombat(joueur, ennemi);
		}
	}
}