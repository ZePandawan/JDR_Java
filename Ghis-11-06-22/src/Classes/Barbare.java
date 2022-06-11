package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Barbare extends Classe {
	
	public Barbare() {
		physique = 85;
		social = 30;
		mental = 55;
		sante = 16;
		mana = 4;
		
		arme = Equipement.HacheDouble;
		armure = Equipement.ArmureDeCuir;
		
		description = "Le barbare est un guerrier sanguinaire utilisant principalement une hache à deux mains.";
		
		ArrayList<Attaque> listeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> listeAttaquesMagiques = new ArrayList<Attaque>();
		
		listeAttaquesPhysiques.add(new AttaqueSimple(this));
		listeAttaquesPhysiques.add(new 	RageDuBerserk(this));
		listeAttaquesMagiques.add(new AnimalTotem(this));
		listeAttaquesMagiques.add(new VolonteDOdin(this));
		
		attaquesPhysiques = listeAttaquesPhysiques;
		attaquesMagiques = listeAttaquesMagiques;
	}
}