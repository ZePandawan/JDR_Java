package Attaque;
import Classes.*;

public class Attaque {
	
	protected String _nom;
	protected String _description;
	protected int _degats;
	
	Classe _classe;
	
	public Attaque(Classe classe) {
		_classe = classe;
	}
	
	public String getNom() {
		return _nom;
	}
	
	public int ValeurAttaque()
	{
		return 0;
	}
	
	public String getDescription() {
		return _description;
	}
}