package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Mage extends Classe{
	
	public Mage() {
		Physique = 30;
		Social = 65;
		Mental = 75;
		Sante = 8;
		Mana = 12;
		
		Arme = new Baton();
		Armure = new Armuredesoie();
		
		Description = "Le mage utilise ses sorts afin de mettre en déroute ses ennemis";
		
		ArrayList<Attaque> ListeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> ListeAttaquesMagiques = new ArrayList<Attaque>();
		
		ListeAttaquesPhysiques.add(new AttaqueSimple(this));
		ListeAttaquesPhysiques.add(new CoupBas(this));
		ListeAttaquesMagiques.add(new FireBall(this));
		ListeAttaquesMagiques.add(new Deflagration(this));
		
		AttaquesPhysiques = ListeAttaquesPhysiques;
		AttaquesMagiques = ListeAttaquesMagiques;
		
	} 
	
	@Override
	public int getClasseDegats() {
		return Math.max(1, (int) (Math.random() * 10) - 7);
	}
}
