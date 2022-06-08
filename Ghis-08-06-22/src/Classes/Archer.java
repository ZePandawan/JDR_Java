package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Archer extends Classe{
	
	public Archer() {
		physique = 65;
		social = 50;
		mental = 55;
		sante = 14;
		mana = 6;
		
		arme = Equipement.Arclong;
		armure = Equipement.ArmureDeCuir;
		
		description = "L'archer utilise principalement le tir à distance, il est souvent équipé d'un arc ou d'une arbalète, lui permettant d'effectuer de lourds dégâts perforants" ;		
		
		ArrayList<Attaque> listeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> listeAttaquesMagiques = new ArrayList<Attaque>();
		
		listeAttaquesPhysiques.add(new TirSimple(this));
		listeAttaquesPhysiques.add(new TirTriple(this));
		listeAttaquesMagiques.add(new TirGuide(this));
		listeAttaquesMagiques.add(new TirDuDragon(this));
		
		attaquesPhysiques = listeAttaquesPhysiques;
		attaquesMagiques = listeAttaquesMagiques;
	}
}