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
		
		Description = "L'archer utilise principalement le tir � distance, il est souvent �quip� d'un arc ou d'une arbal�te, lui permettant d'effectuer de lourds d�g�ts perforants" ;		
		
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
