package Classes;
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
		
		Description = "L'archer utilise principalement le tir à distance, il est souvent équipé d'un arc, ou d'une arbalète, lui permettant d'effectuer de lourds dégâts perfforants" ;		
		
		
		
	}

	@Override
	public int getClasseDegats() {
		return Math.max(0, (int) (Math.random() * 10) - 4);
	}
}
