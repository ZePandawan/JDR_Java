package Classes;
import Equipements.*;

public class Barbare extends Classe {
	
	public Barbare() {
		Physique = 85;
		Social = 30;
		Mental = 55;
		Sante = 16;
		Mana = 4;
		
		Arme = new Hachedouble();
		Armure = new Armuredecuir();
		
		Description = "Le barbare est un guerrier sanguinaire utilisant principalement une hache � deux mains.";
	}
	
	@Override
	public int getClasseDegats() {
		return Math.max(0, (int) (Math.random() * 10) - 2);
	}
}
