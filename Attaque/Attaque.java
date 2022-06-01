package Attaque;
import Classes.Classe;
import Joueur.Joueur;

import java.util.Random;

public class Attaque {
	
	protected String _nom;
	protected String _description;
	protected int _degats;
	protected String _type;
	protected Random random = new Random();

	protected Classe _classe;
	protected Joueur _joueur;
	
	public Attaque(Classe classe) {
		_classe = classe;
	}
	
	public String getNom() {
		return _nom;
	}
	
	public int ValeurAttaque(Joueur joueur)
	{
		return 0;
	}
	
	public int ValeurAttaque()
	{
		return 0;
	}
	
	public String getDescription() {
		return _description;
	}
	
	public String getType() {
		return _type;
	}
}