package Attaque;
import Classes.Classe;
import Joueur.Joueur;

import java.util.Random;

public class Attaque implements AttaqueIntf {
	
	protected String nom;
	protected String description;
	protected int degats;
	protected String type;

	protected Classe classe;
	protected Joueur joueur;
	
	protected Random random = new Random();
	
	public Attaque(Classe Classe) 
	{
		classe = Classe;
	}
	
	public String getNom() 
	{
		return nom;
	}
	
	public int valeurAttaque(Joueur joueur)
	{
		return 0;
	}
	
	public int valeurAttaque()
	{
		return 0;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public String getType() 
	{
		return type;
	}
}