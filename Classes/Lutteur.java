package Classes;
import java.util.ArrayList;

import Attaque.*;
import Equipements.*;

public class Lutteur extends Classe {
	
	public Lutteur() {
		Physique = 80;
		Social = 35;
		Mental = 50;
		Sante = 17;
		Mana = 3;
		
		Arme = new Coupdepoing();
		Armure = new Armuredecuir();
		
		Description = "Le lutteur est une classe légère se servant de ses poings pour porter de lègéres et lourdes attaques sur ses adversaires.";
		
		ArrayList<Attaque> ListeAttaquesPhysiques = new ArrayList<Attaque>();
		ArrayList<Attaque> ListeAttaquesMagiques = new ArrayList<Attaque>();
		
		ListeAttaquesPhysiques.add(new UperCut(this));
		ListeAttaquesPhysiques.add(new Combo(this));
		ListeAttaquesMagiques.add(new PoingAcier(this));
		ListeAttaquesMagiques.add(new TremblementTerre(this));
		
		AttaquesPhysiques = ListeAttaquesPhysiques;
		AttaquesMagiques = ListeAttaquesMagiques;
	}
	
	@Override
	public int getClasseDegats() {
		return Math.max(1, (int) (Math.random() * 10) - 1);
	}
}
