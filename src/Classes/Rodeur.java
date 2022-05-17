package Classes;
import Equipements.*;

public class Rodeur extends Classe {
	
	public Rodeur() {
		Physique = 75;
		Social = 45;
		Mental = 50;
		Sante = 16;
		Mana = 4;
		
		Arme = new Epeecourte();
		Armure = new Cottedemaille();
		
		Description = "Le rodeur est un assassin silencieux, pistant son adversaire pour lui tendre un piège redoutable.";
	}
	
	@Override
	public int getClasseDegats() {
		return Math.max(0, (int) (Math.random() * 10) - 4);
	}
}
