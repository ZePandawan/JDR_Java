package Joueur;

import Commandes.Interface;
import Commandes.Jeu;

import java.util.ArrayList;

import Classes.*;

public class Joueur extends Personnage {
	
	public String[] Classes = {"Archer", "Barbare", "Barde", "Guerrier", "Lutteur", "Mage", "Rodeur","Roublard"};
	public int numeroClasse;
	
	public String[] Races = {"Elfe", "Ent", "Gobelin", "Hobbit", "Humain", "Maiar", "Nain", "Orque"}; 
	public int numeroRace;
	
	public String[] Actions = {"Attaquer", "Lancer un sort", "Se proteger", "Intimider"};
	
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
		Commandes.Interface.NettoyerConsole();
		Commandes.Interface.AfficherEntete("Choisis ta classe Aventurier");
		for(int i=0; i < Classes.length; i++) {
			System.out.println("(" + (i+1) + ")" + Classes[i]);
		}
		
		//Choix du joueur :
		int entree = Commandes.Interface.LectureInt("->", Classes.length);
		Commandes.Interface.NettoyerConsole();
		
		//Attribution du choix
		if(entree == 1) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Classes[0] );
			numeroClasse = 0;
			
			this.Physique = new Classes.Archer().getPhysique();
			this.Social = new Classes.Archer().getSocial();
			this.Mental = new Classes.Archer().getMental();
			this.hp = new Classes.Archer().getSante();
			this.maxHp = new Classes.Archer().getSante();
			this.mana = new Classes.Archer().getMana();
			this.Attaques = new Classes.Archer().getAttaques();
		}
		else if(entree == 2) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Classes[1] );
			numeroClasse = 1;
			
			this.Physique = new Classes.Barbare().getPhysique();
			this.Social = new Classes.Barbare().getSocial();
			this.Mental = new Classes.Barbare().getMental();
			this.hp = new Classes.Barbare().getSante();
			this.maxHp = new Classes.Barbare().getSante();
			this.mana = new Classes.Barbare().getMana();
			this.Attaques = new Classes.Barbare().getAttaques();
		}
		else if(entree == 3) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Classes[2] );
			numeroClasse = 2;
			
			this.Physique = new Classes.Barde().getPhysique();
			this.Social = new Classes.Barde().getSocial();
			this.Mental = new Classes.Barde().getMental();
			this.hp = new Classes.Barde().getSante();
			this.maxHp = new Classes.Barde().getSante();
			this.mana = new Classes.Barde().getMana();
			this.Attaques = new Classes.Barde().getAttaques();
		}
		else if(entree == 4) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Classes[3] );
			numeroClasse = 3;
			
			this.Physique = new Classes.Guerrier().getPhysique();
			this.Social = new Classes.Guerrier().getSocial();
			this.Mental = new Classes.Guerrier().getMental();
			this.hp = new Classes.Guerrier().getSante();
			this.maxHp = new Classes.Guerrier().getSante();
			this.mana = new Classes.Guerrier().getMana();
			this.Attaques = new Classes.Guerrier().getAttaques();
		}
		else if(entree == 5) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Classes[4] );
			numeroClasse = 4;
			
			this.Physique = new Classes.Lutteur().getPhysique();
			this.Social = new Classes.Lutteur().getSocial();
			this.Mental = new Classes.Lutteur().getMental();
			this.hp = new Classes.Lutteur().getSante();
			this.maxHp = new Classes.Lutteur().getSante();
			this.mana = new Classes.Lutteur().getMana();
			this.Attaques = new Classes.Lutteur().getAttaques();
		}
		else if(entree == 6) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Classes[5] );
			numeroClasse = 5;
			
			this.Physique = new Classes.Mage().getPhysique();
			this.Social = new Classes.Mage().getSocial();
			this.Mental = new Classes.Mage().getMental();
			this.hp = new Classes.Mage().getSante();
			this.maxHp = new Classes.Mage().getSante();
			this.mana = new Classes.Mage().getMana();
			this.Attaques = new Classes.Mage().getAttaques();
		}
		else if(entree == 7) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Classes[6] );
			numeroClasse = 6;
			
			this.Physique = new Classes.Rodeur().getPhysique();
			this.Social = new Classes.Rodeur().getSocial();
			this.Mental = new Classes.Rodeur().getMental();
			this.hp = new Classes.Rodeur().getSante();
			this.maxHp = new Classes.Rodeur().getSante();
			this.mana = new Classes.Rodeur().getMana();
			this.Attaques = new Classes.Rodeur().getAttaques();
		}
		else if(entree == 8) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Classes[7] );
			numeroClasse = 7;
			
			this.Physique = new Classes.Roublard().getPhysique();
			this.Social = new Classes.Roublard().getSocial();
			this.Mental = new Classes.Roublard().getMental();
			this.hp = new Classes.Roublard().getSante();
			this.maxHp = new Classes.Roublard().getSante();
			this.mana = new Classes.Roublard().getMana();
			this.Attaques = new Classes.Roublard().getAttaques();
		}
		Commandes.Interface.StopProgramme();
	}
	
	public void ChoixRace() {
		Commandes.Interface.NettoyerConsole();
		Commandes.Interface.AfficherEntete("Choisis ta Race Aventurier");
		for(int i=0; i < Races.length; i++) {
			System.out.println("(" + (i+1) + ")" + Races[i]);
		}
		
		//Choix du joueur :
		int entree = Commandes.Interface.LectureInt("->", Races.length);
		Commandes.Interface.NettoyerConsole();
		
		//Attribution du choix
		if(entree == 1) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Races[0] );
			numeroRace = 0;
		}
		else if(entree == 2) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Races[1] );
			numeroRace = 1;
		}
		else if(entree == 3) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Races[2] );
			numeroRace = 2;
		}
		else if(entree == 4) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Races[3] );
			numeroRace = 3;
		}
		else if(entree == 5) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Races[4] );
			numeroRace = 4;
		}
		else if(entree == 6) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Races[5] );
			numeroRace = 5;
		}
		else if(entree == 7) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Races[6] );
			numeroRace = 6;
		}
		else if(entree == 8) {
			Commandes.Interface.AfficherEntete("Vous avez choisi la classe : " + Races[7] );
			numeroRace = 7;
		}
		Commandes.Interface.StopProgramme();
	}

	public void Recapitulatif() {
		Commandes.Interface.AfficherSeparateur(30);
		System.out.println("Voici un récapitulatif de votre personnage");
		System.out.println("Nom : " + name);
		System.out.println("Vie : " + hp);
		System.out.println("Mana :" + mana);
		System.out.println("Race : " + Races[numeroRace]);
		System.out.println("Classe : " + Classes[numeroClasse]);
		System.out.println("Compétences : " + Attaques);
		Commandes.Interface.AfficherSeparateur(30);
		Commandes.Interface.StopProgramme();
		
	}
}
