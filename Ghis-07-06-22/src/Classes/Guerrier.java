package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Guerrier extends Classe {
	
	public Guerrier() {
		physique = 75;
		social = 55;
		mental = 40;
		sante = 18;
		mana = 2;
		
		arme = Equipement.EpeeLongue;
		armure = Equipement.ArmureDePlaque;
		
		description = "Le guerrier est la classe la plus basique, utiliser votre épée longue et votre armure afin de mettre vos ennemis en déroute.";
		
		ArrayList<Attaque> listeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> listeAttaquesMagiques = new ArrayList<Attaque>();
		
		listeAttaquesPhysiques.add(new AttaqueSimple(this));
		listeAttaquesPhysiques.add(new AttaqueCharge(this));
		listeAttaquesMagiques.add(new PassageEnForce(this));
		listeAttaquesMagiques.add(new VolonteDivine(this));
		
		attaquesPhysiques = listeAttaquesPhysiques;
		attaquesMagiques = listeAttaquesMagiques;
		
	}
}