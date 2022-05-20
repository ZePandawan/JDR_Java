package Jeu;

import Commandes.*;

public class Main {

	public static void main(String[] args) {
		
		Jeu Commande = new Jeu();
		//Lancement du jeu
		Commande.DebutJeu();
		Commande.NettoyerConsole();
		
	}

}
