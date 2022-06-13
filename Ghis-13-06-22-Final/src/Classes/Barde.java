package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Barde extends Classe {
	
	public Barde() {
		physique = 40;
		social = 70;
		mental = 60;	
		sante = 12;
		mana = 8;
		
		arme =  Equipement.Luth;
		armure = Equipement.ArmureDeSoie;
		
		description = "Le barde utilise principalement ses sorts afin de battre ses ennemis, sans oublier son fameux luth qui le suit partout";
		
		ArrayList<Attaque> listeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> listeAttaquesMagiques = new ArrayList<Attaque>();
		
		listeAttaquesPhysiques.add(new AttaqueSimple(this));
		listeAttaquesPhysiques.add(new 	Feinte(this));
		listeAttaquesMagiques.add(new CriStrident(this));
		listeAttaquesMagiques.add(new OndePercante(this));
		
		attaquesPhysiques = listeAttaquesPhysiques;
		attaquesMagiques = listeAttaquesMagiques;
	}	
}