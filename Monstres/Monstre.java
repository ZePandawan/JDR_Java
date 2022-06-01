package Monstres;
import java.util.ArrayList;
import Joueur.Personnage;

public class Monstre {
	
	protected String Nom;
    protected int Sante;
    protected int Degats;
    protected String _type;
    protected String Description;
    protected int Exp;

    protected ArrayList<String> Attaques = new ArrayList<String>();

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
			
			System.out.println("------------------------------");
			System.out.println("L'ennemi a subit : " + degats + " d�gats." );
			System.out.println("Points de vie restants : " + Math.max(0,Sante));
			System.out.println("------------------------------");
    }
    
    public String getType()
    {
    	return _type;
    }
    
    
}
