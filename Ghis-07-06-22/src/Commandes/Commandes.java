package Commandes;

import java.util.Scanner;

public class Commandes implements CommandesIntf {
	static Scanner scanner = new Scanner(System.in);
	
	public int lectureInt(String choix, int choixUtilisateur) {
		int entree;
		
		do {
			System.out.print(choix);
			try {
				entree = Integer.parseInt(scanner.next());
			}catch(Exception e) {
				entree = -1;
				System.out.println("Veuillez rentrer une valeur entière !");
			}
		}while(entree < 1 || entree > choixUtilisateur);
		return entree;
	}

	public void nettoyerConsole() {
		for(int i = 0; i<5; i++) {
			System.out.println();
		}
	}
	
	public void afficherSeparateur(int n) {
		for(int i=0; i<n; i++ ) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public void afficherEntete(int nombre, String texte) {
		afficherSeparateur(nombre);
		System.out.println(texte);
		afficherSeparateur(nombre);
	}
	
	public void stopProgramme() {
		System.out.print("\n Entrer '' pour continuer : ");
		scanner.nextLine();
	}
	
	public void debugScanner() {
		scanner.nextLine();
	}
}