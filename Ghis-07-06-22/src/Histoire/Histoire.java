package Histoire;

import java.util.Random;
import java.util.Scanner;

import Commandes.*;
import Joueur.Joueur;

public class Histoire {
	
	protected static Scanner scanner = new Scanner(System.in);
	protected Jeu commande = new Jeu();
	protected Random random = new Random();

	
	public Joueur defPersonnage(Joueur joueur)
	{
		String nom;
		
		commande.nettoyerConsole();
		commande.afficherEntete(122, "\nAragorn : Quel est votre nom mon brave ?!\n");
		System.out.print("-> Nom : ");
		nom = scanner.nextLine();

		
		commande.nettoyerConsole();
		commande.afficherEntete(122,"\nAragorn : Votre nom est " + nom + ". N'est-ce pas ? \n\n"
				+ "[1] Oui ! \n"
				+ "[2] Non ! \n");
		int choix = commande.lectureInt("->", 2);
		
		
		while(choix == 2)
		{
			commande.nettoyerConsole();
			commande.afficherEntete(122, "\nAragorn : Quel est votre nom mon brave ?!\n");
			System.out.print("-> Nom : ");
			nom = scanner.nextLine();

			
			commande.nettoyerConsole();
			commande.afficherEntete(122,"\nAragorn : Votre nom est " + nom + ". N'est-ce pas ? \n\n"
					+ "[1] Oui ! \n"
					+ "[2] Non ! \n");
			choix = commande.lectureInt("->", 2);
		}
		
		joueur = new Joueur(nom);
		return joueur;
	}
}