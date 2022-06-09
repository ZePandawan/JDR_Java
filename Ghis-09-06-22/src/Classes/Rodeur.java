package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Rodeur extends Classe {
	
	public Rodeur() {
		physique = 75;
		social = 45;
		mental = 50;
		sante = 16;
		mana = 4;
		
		arme = Equipement.EpeeCourte;
		armure = Equipement.CotteDeMaille;
		
		description = "Le rodeur est un assassin silencieux, pistant son adversaire pour lui tendre un piège redoutable.";
		
		ArrayList<Attaque> listeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> listeAttaquesMagiques = new ArrayList<Attaque>();
		
		listeAttaquesPhysiques.add(new AttaqueSimple(this));
		listeAttaquesPhysiques.add(new Ruee(this));
		listeAttaquesMagiques.add(new Teleportation(this));
		listeAttaquesMagiques.add(new AttaqueDesOmbres(this));
		
		attaquesPhysiques = listeAttaquesPhysiques;
		attaquesMagiques = listeAttaquesMagiques;
	}
}