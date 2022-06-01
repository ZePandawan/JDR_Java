package Monstres;
import java.util.ArrayList;
import java.util.Random;

import Commandes.Interface;
import Joueur.Personnage;

public class Monstre {
	
	protected String Nom;
    protected int Sante;
    protected int Degats;
    protected String _type;
    protected String Description;
    protected int Exp;
    protected Random random = new Random();

    protected ArrayList<String> Attaques = new ArrayList<String>();
    
    protected Interface Commande = new Interface();

    public int getExp() { return this.Exp;}

    public int getSante() {
        return this.Sante;
    }
    
    public int getDegats() {
    	return Degats;
    }

    public ArrayList<String> getAttaques(){
        return this.Attaques;
    }

    public String getDescription() {
        return this.Description;
    }
    
    
    public void Attaque(Personnage cible) {
    	cible.Defense(getDegats());
    }
    
    public void Defend(int degats) {
			Sante -= degats;
			
			Commande.AfficherEntete(30, 
					  "L'ennemi a subit : " + degats + " dégats. \n"
					+ "Points de vie restants : " + Math.max(0,Sante) );
    }
    
    public String getType()
    {
    	return _type;
    }
    
    
}
