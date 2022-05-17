package Classes;
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
		
		Description = "Le lutteur est une classe légère se servant de ses poing pour porter de lègéres et lourdes attaques sur ses adversaires.";
	}
	
	@Override
	public int getClasseDegats() {
		return Math.max(0, (int) (Math.random() * 10) - 1);
	}
}
