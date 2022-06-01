package Jeu;

import Commandes.*;
import Histoire.*;

public class Main {

	public static void main(String[] args) {
		
		Menu Jeu = new Menu();
		Jeu Commande = new Jeu();
		//Lancement du jeu
		Jeu.MenuPrincipal();
		Commande.NettoyerConsole();
		
	}

}
