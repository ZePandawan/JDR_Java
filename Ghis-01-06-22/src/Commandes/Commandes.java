package Commandes;

import java.util.Scanner;

public class Commandes implements CommandesIntf {
	static Scanner scanner = new Scanner(System.in);
	
	public int LectureInt(String choix, int choixUtilisateur) {
		int entree;
		
		do {
			System.out.print(choix);
			try {
				entree = Integer.parseInt(scanner.next());
			}catch(Exception e) {
				entree = -1;
				System.out.println("Veuillez rentrer une valeur enti?re !");
			}
		}while(entree < 1 || entree > choixUtilisateur);
		return entree;
	}

	public void NettoyerConsole() {
		for(int i = 0; i<5; i++) {
			System.out.println();
		}
	}
	
	public void AfficherSeparateur(int n) {
		for(int i=0; i<n; i++ ) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	public void AfficherEntete(int nombre, String texte) {
		AfficherSeparateur(nombre);
		System.out.println(texte);
		AfficherSeparateur(nombre);
	}
	
	public void StopProgramme() {
		System.out.print("\n Entrer '' pour continuer : ");
		scanner.nextLine();
	}
	
	public void DebugScanner() {
		scanner.nextLine();
	}

}
