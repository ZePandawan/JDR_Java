package Classes;

import Equipements.*;
import java.util.Random;
import java.util.ArrayList;
import Attaque.*;

public class Classe implements ClasseIntf{
	
	protected int physique;
    protected int social;
    protected int mental;
    
	protected int sante;
	protected int mana;
	
	protected int argent;
	
	protected Equipement arme;
	protected Equipement armure;
	
	protected String description;
	
	protected ArrayList<Attaque> attaquesPhysiques;
	protected ArrayList<Attaque> attaquesMagiques;
	
	protected Random random = new Random();
	
	
	public int getPhysique() {
		return physique;
	}
	
	public int getSocial() {
		return social;
	}
	
	public int getMental() {
		return mental;
	}
	
	public int getSante() {
		return sante;
	}
	
	public int getMana() {
		return mana;
	}	
	
	public String getDescription() {
		return description;
	}
	
	public int getArmeDegatsP() {
		return arme.getDegatP();
	}
	
	public int getArmeDegatsM() {
		return arme.getDegatM();
	}
	
	public int getArmure() {
		return armure.getArmure();
	}

	public Equipement getArme()
	{
		return arme;
	}
	
	public int getClasseDegats() {
		return random.nextInt(1, 11);
	}
	
	public ArrayList<Attaque> getAttaquesPhysiques()
	{
		return attaquesPhysiques;
	}
	
	public ArrayList<Attaque> getAttaquesMagiques()
	{
		return attaquesMagiques;
	}
}