package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Mage extends Classe{
	
	public Mage() {
		physique = 30;
		social = 65;
		mental = 75;
		sante = 8;
		mana = 12;
		
		arme = Equipement.BatonDeMage;
		armure = Equipement.ArmureDeSoie;
		
		description = "Le mage utilise ses sorts afin de mettre en déroute ses ennemis";
		
		ArrayList<Attaque> listeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> listeAttaquesMagiques = new ArrayList<Attaque>();
		
		listeAttaquesPhysiques.add(new AttaqueSimple(this));
		listeAttaquesPhysiques.add(new CoupBas(this));
		listeAttaquesMagiques.add(new FireBall(this));
		listeAttaquesMagiques.add(new Deflagration(this));
		
		attaquesPhysiques = listeAttaquesPhysiques;
		attaquesMagiques = listeAttaquesMagiques;
		
	}
}