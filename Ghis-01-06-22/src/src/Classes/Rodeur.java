package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Rodeur extends Classe {
	
	public Rodeur() {
		Physique = 75;
		Social = 45;
		Mental = 50;
		Sante = 16;
		Mana = 4;
		
		Arme = Equipement.EpeeCourte;
		Armure = Equipement.CotteDeMaille;
		
		Description = "Le rodeur est un assassin silencieux, pistant son adversaire pour lui tendre un pi?ge redoutable.";
		
		ArrayList<Attaque> ListeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> ListeAttaquesMagiques = new ArrayList<Attaque>();
		
		ListeAttaquesPhysiques.add(new AttaqueSimple(this));
		ListeAttaquesPhysiques.add(new Ruee(this));
		ListeAttaquesMagiques.add(new Teleportation(this));
		ListeAttaquesMagiques.add(new AttaqueDesOmbres(this));
		
		AttaquesPhysiques = ListeAttaquesPhysiques;
		AttaquesMagiques = ListeAttaquesMagiques;
	}
}
