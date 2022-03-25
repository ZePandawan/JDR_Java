package Joueur;

import Commandes.*;
import Classes.*;
import Races.*;
import java.util.ArrayList;


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

	@Override
	public int attack() {
		return 0;
	}

	@Override
	public int defend() {
		return 0;
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
				this.DescriptionClasse = new Classes.Archer().getDescription();
				this.Physique = new Classes.Archer().getPhysique();
				this.Social = new Classes.Archer().getSocial();
				this.Mental = new Classes.Archer().getMental();
				this.hp = new Classes.Archer().getSante();
				this.maxHp = new Classes.Archer().getSante();
				this.mana = new Classes.Archer().getMana();
				this.Attaques = new Classes.Archer().getAttaques();
				this.DescriptionClasse = new Classes.Archer().getDescription();
				numeroClasse = 0;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[0] + "\n " + 
										this.DescriptionClasse + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 2) {
				this.DescriptionClasse = new Classes.Barbare().getDescription();
				this.Physique = new Classes.Barbare().getPhysique();
				this.Social = new Classes.Barbare().getSocial();
				this.Mental = new Classes.Barbare().getMental();
				this.hp = new Classes.Barbare().getSante();
				this.maxHp = new Classes.Barbare().getSante();
				this.mana = new Classes.Barbare().getMana();
				this.Attaques = new Classes.Barbare().getAttaques();
				this.DescriptionClasse = new Classes.Barbare().getDescription();
				numeroClasse = 1;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[1] + "\n " + 
										this.DescriptionClasse + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 3) {
				this.DescriptionClasse = new Classes.Barde().getDescription();
				this.Physique = new Classes.Barde().getPhysique();
				this.Social = new Classes.Barde().getSocial();
				this.Mental = new Classes.Barde().getMental();
				this.hp = new Classes.Barde().getSante();
				this.maxHp = new Classes.Barde().getSante();
				this.mana = new Classes.Barde().getMana();
				this.Attaques = new Classes.Barde().getAttaques();
				this.DescriptionClasse = new Classes.Barde().getDescription();
				numeroClasse = 2;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[2] + "\n " + 
										this.DescriptionClasse + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 4) {
				this.DescriptionClasse = new Classes.Guerrier().getDescription();
				this.Physique = new Classes.Guerrier().getPhysique();
				this.Social = new Classes.Guerrier().getSocial();
				this.Mental = new Classes.Guerrier().getMental();
				this.hp = new Classes.Guerrier().getSante();
				this.maxHp = new Classes.Guerrier().getSante();
				this.mana = new Classes.Guerrier().getMana();
				this.Attaques = new Classes.Guerrier().getAttaques();
				this.DescriptionClasse = new Classes.Guerrier().getDescription();
				numeroClasse = 3;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[3] + "\n " + 
										this.DescriptionClasse + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 5) {
				this.DescriptionClasse = new Classes.Lutteur().getDescription();
				this.Physique = new Classes.Lutteur().getPhysique();
				this.Social = new Classes.Lutteur().getSocial();
				this.Mental = new Classes.Lutteur().getMental();
				this.hp = new Classes.Lutteur().getSante();
				this.maxHp = new Classes.Lutteur().getSante();
				this.mana = new Classes.Lutteur().getMana();
				this.Attaques = new Classes.Lutteur().getAttaques();
				this.DescriptionClasse = new Classes.Lutteur().getDescription();
				numeroClasse = 4;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[4] + "\n " + 
										this.DescriptionClasse + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 6) {
				this.DescriptionClasse = new Classes.Mage().getDescription();
				this.Physique = new Classes.Mage().getPhysique();
				this.Social = new Classes.Mage().getSocial();
				this.Mental = new Classes.Mage().getMental();
				this.hp = new Classes.Mage().getSante();
				this.maxHp = new Classes.Mage().getSante();
				this.mana = new Classes.Mage().getMana();
				this.Attaques = new Classes.Mage().getAttaques();
				this.DescriptionClasse = new Classes.Mage().getDescription();
				numeroClasse = 5;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[5] + "\n " + 
										this.DescriptionClasse + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 7) {
				this.DescriptionClasse = new Classes.Rodeur().getDescription();
				this.Physique = new Classes.Rodeur().getPhysique();
				this.Social = new Classes.Rodeur().getSocial();
				this.Mental = new Classes.Rodeur().getMental();
				this.hp = new Classes.Rodeur().getSante();
				this.maxHp = new Classes.Rodeur().getSante();
				this.mana = new Classes.Rodeur().getMana();
				this.Attaques = new Classes.Rodeur().getAttaques();
				this.DescriptionClasse = new Classes.Rodeur().getDescription();
				numeroClasse = 6;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[6] + "\n " + 
										this.DescriptionClasse + "\n " +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui !");
				System.out.println("(2) Non !");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix == 1) {
					classeValide = true;
				}
			}
			else if(entree == 8) {
				this.DescriptionClasse = new Classes.Roublard().getDescription();
				this.Physique = new Classes.Roublard().getPhysique();
				this.Social = new Classes.Roublard().getSocial();
				this.Mental = new Classes.Roublard().getMental();
				this.hp = new Classes.Roublard().getSante();
				this.maxHp = new Classes.Roublard().getSante();
				this.mana = new Classes.Roublard().getMana();
				this.Attaques = new Classes.Roublard().getAttaques();
				this.DescriptionClasse = new Classes.Roublard().getDescription();
				numeroClasse = 7;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " +  Classes[7] + "\n " + 
										this.DescriptionClasse + "\n " +
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
				this.DescriptionRace = new Races.Elfe().getDescription();
				numeroRace = 0;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[0] + "\n" + 
										this.DescriptionRace + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 2) {
				this.DescriptionRace = new Races.Ent().getDescription();
				numeroRace = 1;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[1] + "\n" + 
										this.DescriptionRace + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 3) {
				this.DescriptionRace = new Races.Gobelin().getDescription();
				numeroRace = 2;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[2] + "\n" + 
										this.DescriptionRace + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 4) {
				this.DescriptionRace = new Races.Hobbit().getDescription();
				numeroRace = 3;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[3] + "\n" + 
										this.DescriptionRace + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 5) {
				this.DescriptionRace = new Races.Humain().getDescription();
				numeroRace = 4;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[4] + "\n" + 
										this.DescriptionRace + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 6) {
				this.DescriptionRace = new Races.Maiar().getDescription();
				numeroRace = 5;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[5] + "\n" + 
										this.DescriptionRace + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 7) {
				this.DescriptionRace = new Races.Nain().getDescription();
				numeroRace = 6;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[6] + "\n" + 
										this.DescriptionRace + "\n" +
										"Ce choix te convient-il aventurier ?!");
				System.out.println("(1) Oui ! ");
				System.out.println("(2) Non ! ");
				int choix = Commande.LectureInt("->", 2);
				
				if(choix ==1) {
					raceValide = true;
				}
			}
			else if(entree == 8) {
				this.DescriptionRace = new Races.Orque().getDescription();
				numeroRace = 7;
				
				Commande.AfficherEntete("Vous avez choisi la classe : " + Races[7] + "\n" + 
										this.DescriptionRace + "\n" +
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
		Commande.AfficherSeparateur(30);
		System.out.println("Voici un récapitulatif de votre personnage");
		System.out.println("Nom : " + name);
		System.out.println("Vie : " + hp);
		System.out.println("Mana : " + mana);
		System.out.println("Race : " + Races[numeroRace]);
		System.out.println("Classe : " + Classes[numeroClasse]);
		System.out.println("Compétences : " + Attaques);
		Commande.AfficherSeparateur(30);
		Commande.StopProgramme();
		
	}
}
