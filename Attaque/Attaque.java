package Attaque;
import Classes.Classe;

public class Attaque {
	
	protected String _nom;
	protected String _description;
	protected int _degats;
	protected String _type;
	
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
	
	public String getType() {
		return _type;
	}
}