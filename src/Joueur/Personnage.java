package Joueur;

import java.util.ArrayList;

public abstract class Personnage {

	protected String name;
	protected int maxHp, hp, exp, mana;
	protected String Race;
	protected String Classe;
	
	protected int Physique;
	protected int Social;
	protected int Mental;
	
	protected String DescriptionClasse;
	protected String DescriptionRace;
	protected ArrayList<String> Attaques = new ArrayList<String>();
	protected ArrayList<String> Inventaire = new ArrayList<String>();
	
	public Personnage(String name, int maxHp, int exp) {
		this.name = name;
		this.maxHp = maxHp;
		this.exp = exp;
		this.hp = maxHp;
	}
	
	//Méthodes communes à tous les Joueurs
	public abstract int attack();
	public abstract int defend();
	
}
