package Commandes;

import java.util.Scanner;

public class Interface {
	static Scanner scanner = new Scanner(System.in);
	
	public static int LectureInt(String choix, int choixUtilisateur) {

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

	public static void NettoyerConsole() {
		for(int i = 0; i<100; i++) {
			System.out.println();
		}
	}
	
	public static void AfficherSeparateur(int n) {
		for(int i=0; i<n; i++ ) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static void AfficherEntete(String titre) {
		AfficherSeparateur(30);
		System.out.println(titre);
		AfficherSeparateur(30);
	}
	
	public static void StopProgramme() {
		System.out.println("\n Entrer quelque chose pour continuer...");
		scanner.next();
	}

}
