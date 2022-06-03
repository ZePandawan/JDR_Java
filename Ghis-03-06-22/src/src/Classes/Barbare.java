package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Barbare extends Classe {
	
	public Barbare() {
		Physique = 85;
		Social = 30;
		Mental = 55;
		Sante = 16;
		Mana = 4;
		
		Arme = Equipement.HacheDouble;
		Armure = Equipement.ArmureDeCuir;
		
		Description = "Le barbare est un guerrier sanguinaire utilisant principalement une hache à deux mains.";
		
		ArrayList<Attaque> ListeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> ListeAttaquesMagiques = new ArrayList<Attaque>();
		
		ListeAttaquesPhysiques.add(new AttaqueSimple(this));
		ListeAttaquesPhysiques.add(new 	RageDuBerserk(this));
		ListeAttaquesMagiques.add(new AnimalTotem(this));
		ListeAttaquesMagiques.add(new VolonteDOdin(this));
		
		AttaquesPhysiques = ListeAttaquesPhysiques;
		AttaquesMagiques = ListeAttaquesMagiques;
	}
}
