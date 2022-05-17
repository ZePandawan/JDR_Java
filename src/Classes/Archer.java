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
		
		Description = "L'archer utilise principalement le tir � distance, il est souvent �quip� d'un arc, ou d'une arbal�te, lui permettant d'effectuer de lourds d�g�ts perfforants" ;		
		
		
		
	}

	@Override
	public int getClasseDegats() {
		return Math.max(0, (int) (Math.random() * 10) - 4);
	}
}
