package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Guerrier extends Classe {
	
	public Guerrier() {
		Physique = 75;
		Social = 55;
		Mental = 40;
		Sante = 18;
		Mana = 2;
		
		Arme = new Epeelongue();
		Armure = new Armuredeplaque();
		
		Description = "Le guerrier est la classe la plus basique, utiliser votre épée longue et votre armure afin de mettre vos ennemis en déroute.";
		
		ArrayList<Attaque> ListeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> ListeAttaquesMagiques = new ArrayList<Attaque>();
		
		ListeAttaquesPhysiques.add(new AttaqueSimple(this));
		ListeAttaquesPhysiques.add(new AttaqueCharge(this));
		ListeAttaquesMagiques.add(new PassageEnForce(this));
		ListeAttaquesMagiques.add(new VolonteDivine(this));
		
		AttaquesPhysiques = ListeAttaquesPhysiques;
		AttaquesMagiques = ListeAttaquesMagiques;
		
	}
	
	@Override
	public int getClasseDegats() {
		return random.nextInt(1, 7);
	}
}
