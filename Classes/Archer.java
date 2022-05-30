package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Archer extends Classe{
	
	public Archer() {
		Physique = 65;
		Social = 50;
		Mental = 55;
		Sante = 14;
		Mana = 6;
		
		Arme = new Arclong();
		Armure = new Armuredecuir();
		
		Description = "L'archer utilise principalement le tir à distance, il est souvent équipé d'un arc ou d'une arbalète, lui permettant d'effectuer de lourds dégâts perforants" ;		
		
		ArrayList<Attaque> ListeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> ListeAttaquesMagiques = new ArrayList<Attaque>();
		
		ListeAttaquesPhysiques.add(new TirSimple(this));
		ListeAttaquesPhysiques.add(new TirTriple(this));
		ListeAttaquesMagiques.add(new TirGuide(this));
		ListeAttaquesMagiques.add(new TirDuDragon(this));
		
		AttaquesPhysiques = ListeAttaquesPhysiques;
		AttaquesMagiques = ListeAttaquesMagiques;
		
		
	}

	@Override
	public int getClasseDegats() {
		return random.nextInt(1, 6);
	}
}
