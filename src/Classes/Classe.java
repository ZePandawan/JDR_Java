package Classes;
import Equipements.*;

import java.util.ArrayList;

public class Classe{
	protected int Physique;
    protected int Social;
    protected int Mental;
	protected int Sante;
	protected int Mana;
	
	protected Equipement Arme;
	protected Equipement Armure;
	
	protected String Description;
	
	protected ArrayList<String> Attaques = new ArrayList<String>();
	
	public String getDescription() {
		return Description;
	}
	
	public int getPhysique() {
		return Physique;
	}
	
	public int getSocial() {
		return Social;
	}
	
	public int getMental() {
		return Mental;
	}
	
	public int getSante() {
		return Sante;
	}
	
	public int getMana() {
		return Mana;
	}	
	
	public int getArmeDegats() {
		return Arme.getDegat();
	}
	
	public int getArmure() {
		return Armure.getArmure();
	}

	public int getClasseDegats() {
		return 0;
	}

}
