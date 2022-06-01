package Histoire;

import java.util.Scanner;

import Commandes.*;
import Joueur.Joueur;

public class Histoire {
	
	protected static Scanner scanner = new Scanner(System.in);
	protected Interface Commande = new Interface();
	
	public Joueur DefPersonnage(Joueur joueur)
	{
		String nom;
		
		Commande.NettoyerConsole();
		Commande.AfficherEntete(122, "\nAragorn : Quel est votre nom mon brave ?!\n");
		System.out.print("-> Nom : ");
		nom = scanner.next();

		
		Commande.NettoyerConsole();
		Commande.AfficherEntete(122,"\nAragorn : Votre nom est " + nom + ". N'est-ce pas ? \n\n"
				+ "[1] Oui ! \n"
				+ "[2] Non ! \n");
		int choix = Commande.LectureInt("->", 2);
		
		
		while(choix == 2)
		{
			Commande.NettoyerConsole();
			Commande.AfficherEntete(122, "\nAragorn : Quel est votre nom mon brave ?!\n");
			System.out.print("-> Nom : ");
			nom = scanner.next();

			
			Commande.NettoyerConsole();
			Commande.AfficherEntete(122,"\nAragorn : Votre nom est " + nom + ". N'est-ce pas ? \n\n"
					+ "[1] Oui ! \n"
					+ "[2] Non ! \n");
			choix = Commande.LectureInt("->", 2);
		}
		
		joueur = new Joueur(nom);
		return joueur;
	}
}
