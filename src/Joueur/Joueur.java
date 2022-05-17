package Joueur;

import Classes.*;
import Commandes.*;
import Races.*;


public class Joueur extends Personnage {
	
	Interface Commande = new Interface();
	
	private String[] Classes = {"Archer", "Barbare", "Barde", "Guerrier", "Lutteur", "Mage", "Rodeur","Roublard"};
	private int numeroClasse;
	
	private String[] Races = {"Elfe", "Ent", "Gobelin", "Hobbit", "Humain", "Maiar", "Nain", "Orque"}; 
	private int numeroRace;
	
	private String[] Actions = {"Attaquer", "Lancer un sort", "Se proteger", "Intimider"};
	
	boolean classeValide = false;
	boolean raceValide = false;
	
	//Constructeur Joueur
	public Joueur(String name) {
		super(name, 100, 0);
		
		//Choix de la classe
		ChoixClasse();
		ChoixRace();
		Recapitulatif();
		
	}

	
	public void ChoixClasse() {
		do {
			Commande.NettoyerConsole();
			Commande.AfficherEntete("Choisis ta classe Aventurier");
			for(int i=0; i < Classes.length; i++) {
				System.out.println("(" + (i+1) + ")" + Classes[i]);
			}
			
			//Choix du joueur :
			int entree = Commande.LectureInt("->", Classes.length);
			Commande.NettoyerConsole();
			
			//Attribution du choix
			if(entree == 1) {
				classe = new Archer();
				maxHp = classe.getSante();
				hp = classe.getSante();
				mana = classe.getMana();
				numeroClasse = 0;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[0] + "\n " + 
										classe.getDescription() + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 2) {
				classe = new Barbare();
				maxHp = classe.getSante();
				hp = classe.getSante();
				mana = classe.getMana();
				numeroClasse = 1;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[1] + "\n " + 
										classe.getDescription() + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 3) {
				classe = new Barde();
				maxHp = classe.getSante();
				hp = classe.getSante();
				mana = classe.getMana();
				numeroClasse = 2;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[2] + "\n " + 
										classe.getDescription() + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 4) {
				classe = new Guerrier();
				maxHp = classe.getSante();
				hp = classe.getSante();
				mana = classe.getMana();
				numeroClasse = 3;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[3] + "\n " + 
										classe.getDescription() + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 5) {
				classe = new Lutteur();
				maxHp = classe.getSante();
				hp = classe.getSante();
				mana = classe.getMana();
				numeroClasse = 4;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[4] + "\n " + 
										classe.getDescription() + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 6) {
				classe = new Mage();
				maxHp = classe.getSante();
				hp = classe.getSante();
				mana = classe.getMana();
				numeroClasse = 5;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[5] + "\n " + 
										classe.getDescription() + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 7) {
				classe = new Rodeur();
				maxHp = classe.getSante();
				hp = classe.getSante();
				mana = classe.getMana();
				numeroClasse = 6;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[6] + "\n " + 
										classe.getDescription() + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 8) {
				classe = new Roublard();
				maxHp = classe.getSante();
				hp = classe.getSante();
				mana = classe.getMana();
				numeroClasse = 7;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[7] + "\n " + 
										classe.getDescription() + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
		}while(!classeValide);
	}
	
	public void ChoixRace() {
		do {
			Commande.NettoyerConsole();
			Commande.AfficherEntete("Choisis ta Race Aventurier");
			for(int i=0; i < Races.length; i++) {
				System.out.println("(" + (i+1) + ")" + Races[i]);
			}
			
			//Choix du joueur :
			int entree = Commande.LectureInt("->", Races.length);
			Commande.NettoyerConsole();
			
			//Attribution du choix
			if(entree == 1) {
				race = new Elfe();
				numeroRace = 0;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[0] + "\n" + 
										race.getDescription() + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 2) {
				race = new Ent();
				numeroRace = 1;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[1] + "\n" + 
										race.getDescription() + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 3) {
				race = new Gobelin();
				numeroRace = 2;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[2] + "\n" + 
										race.getDescription() + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 4) {
				race = new Hobbit();
				numeroRace = 3;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[3] + "\n" + 
										race.getDescription() + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 5) {
				race = new Humain();
				numeroRace = 4;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[4] + "\n" + 
										race.getDescription() + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 6) {
				race = new Maiar();
				numeroRace = 5;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[5] + "\n" + 
										race.getDescription() + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 7) {
				race = new Nain();
				numeroRace = 6;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[6] + "\n" + 
										race.getDescription() + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 8) {
				race = new Orque();
				numeroRace = 7;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[7] + "\n" + 
										race.getDescription() + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
		}while(!raceValide);
	}

	public void Recapitulatif() {
		Commande.NettoyerConsole();
		Commande.AfficherSeparateur(30);
		System.out.println("Voici un récapitulatif de votre personnage");
		System.out.println("Nom : " + name);
		System.out.println("Vie : " + hp);
		System.out.println("Mana : " + mana);
		System.out.println("Race : " + Races[numeroRace]);
		System.out.println("Classe : " + Classes[numeroClasse]);
		System.out.println("Compétences : " + Attaques);
		System.out.println("Physique : " + classe.getPhysique());
		System.out.println("Social : " + classe.getSocial());
		System.out.println("Mental : " + classe.getMental());
		Commande.AfficherSeparateur(30);
		Commande.StopProgramme();
		
	}
}
