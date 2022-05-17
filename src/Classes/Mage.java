package Classes;
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
		
		Description = "Le mage utilise ses sorts afin de carboniser ses ennemis";
		
	} 
	
	@Override
	public int getClasseDegats() {
		return Math.max(0, (int) (Math.random() * 10) - 7);
	}
}
