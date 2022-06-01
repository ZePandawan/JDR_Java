package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Barde extends Classe {
	
	public Barde() {
		Physique = 40;
		Social = 70;
		Mental = 60;	
		Sante = 12;
		Mana = 8;
		
		Arme =  Equipement.Luth;
		Armure = Equipement.ArmureDeSoie;
		
		Description = "Le barde utilise principalement ses sorts afin de battre ses ennemis, sans oublier son fameux luth qui le suit partout";
		
		ArrayList<Attaque> ListeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> ListeAttaquesMagiques = new ArrayList<Attaque>();
		
		ListeAttaquesPhysiques.add(new AttaqueSimple(this));
		ListeAttaquesPhysiques.add(new 	Feinte(this));
		ListeAttaquesMagiques.add(new CriStrident(this));
		ListeAttaquesMagiques.add(new OndePercante(this));
		
		AttaquesPhysiques = ListeAttaquesPhysiques;
		AttaquesMagiques = ListeAttaquesMagiques;
	}	
	
	@Override
	public int getClasseDegats() {
		return random.nextInt(1, 5);
	}
}