package Classes;
import Equipements.*;
import java.util.Random;
import java.util.ArrayList;

import Attaque.*;

public class Classe{
	protected int Physique;
    protected int Social;
    protected int Mental;
	protected int Sante;
	protected int Mana;
	
	protected Equipement Arme;
	protected Equipement Armure;
	
	protected String Description;
	
	protected ArrayList<Attaque> AttaquesPhysiques;
	protected ArrayList<Attaque> AttaquesMagiques;
	
	protected Random random = new Random();
	
	public String getDescription() {
		return Description;
	}
	
	public int getPhysique() {
		return Physique;
	}
	
	public void setPhysique(int valeur) {
		Physique = valeur;
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
	

	public int getArmeDegatsP() {
		return Arme.getDegatP();
	}
	
	public int getArmeDegatsM() {
		return Arme.getDegatM();
	}
	
	public int getArmure() {
		return Armure.getArmure();
	}

	public Equipement getArme()
	{
		return Arme;
	}
	
	public int getClasseDegats() {
		return 0;
	}
	
	public ArrayList<Attaque> getAttaquesPhysiques()
	{
		return AttaquesPhysiques;
	}
	
	public ArrayList<Attaque> getAttaquesMagiques()
	{
		return AttaquesMagiques;
	}
}
