package Classes;
import Equipements.*;

public class Guerrier extends Classe {
	
	public Guerrier() {
		Physique = 75;
		Social = 55;
		Mental = 40;
		Sante = 18;
		Mana = 2;

		Arme = new Epeelongue();
		Armure = new Armuredeplaque();
		
		Description = "Le guerrier est la classe la plus basique, utiliser votre épée longue et votre armure afin de mettre vos ennemis en déroute.";
		
	}
	
	@Override
	public int getClasseDegats() {
		return Math.max(0, (int) (Math.random() * 10) - 3);
	}
}
