package Classes;

import java.util.ArrayList;

import Attaque.Attaque;
import Equipements.Equipement;

public interface ClasseIntf {
	
	/**
	 * Permet de récupérer les dégats physique de notre arme
	 * @return dégats physique en int
	 */
	int getArmeDegatsP();
	
	/**
	 * Permet de récupérer les dégats magiques de notre arme
	 * @return dégats magiques en int
	 */
	int getArmeDegatsM();
	
	int getPhysique();
	
	int getSocial();
	
	int getMental();
	
	int getSante();
	
	int getMana();
	
	String getDescription();
	
	int getArmure();
	
	Equipement getArme();
	
	int getClasseDegats();
	
	ArrayList<Attaque> getAttaquesPhysiques();
	
	ArrayList<Attaque> getAttaquesMagiques();
}