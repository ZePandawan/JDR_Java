package Commandes;

import Joueur.Joueur;

public class Jeu extends Interface {
	
	static Joueur joueur;
	
	public void DebutJeu() {
		boolean nomValide = false;
		String nom;
		
		//Affichage de l'écran d'accueil
		NettoyerConsole();
		AfficherEntete("MIDDLE EARTH WAR RPG");
		StopProgramme();
		
		//Choix du nom du Joueur
		do {
			NettoyerConsole();
			AfficherSeparateur(30);
			System.out.println("Quel est ton nom aventurier ?!");
			AfficherSeparateur(30);
			nom = scanner.next();
			
			//Demande si le Nom est bon pour le Joueur
			NettoyerConsole();
			AfficherEntete("Votre nom est bien : " + nom + "\n Est-ce bien cela ?!");
			System.out.println("(1) Oui !");
			System.out.println("(2) Non !");
			int entree = LectureInt("->", 2);
			
			if(entree == 1) {
				nomValide = true;
			}
		}while(!nomValide);
		
		//Création d'un nouveau Personnage
		joueur = new Joueur(nom);
	}
}
