package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Lutteur extends Classe {
	
	public Lutteur() {
		physique = 80;
		social = 35;
		mental = 50;
		sante = 17;
		mana = 3;
		
		arme = Equipement.CoupDePoing;
		armure = Equipement.ArmureDeCuir;
		
		description = "Le lutteur est une classe légère se servant de ses poings pour porter de lègéres et lourdes attaques sur ses adversaires.";
		
		ArrayList<Attaque> listeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> listeAttaquesMagiques = new ArrayList<Attaque>();
		
		listeAttaquesPhysiques.add(new UperCut(this));
		listeAttaquesPhysiques.add(new Combo(this));
		listeAttaquesMagiques.add(new PoingAcier(this));
		listeAttaquesMagiques.add(new TremblementTerre(this));
		
		attaquesPhysiques = listeAttaquesPhysiques;
		attaquesMagiques = listeAttaquesMagiques;
	}
}