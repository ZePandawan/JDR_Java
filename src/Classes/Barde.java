package Classes;
import Equipements.*;

public class Barde extends Classe {
	
	public Barde() {
		Physique = 40;
		Social = 70;
		Mental = 60;	
		Sante = 12;
		Mana = 8;
		
		Arme = new Luth();
		Armure = new Armuredesoie();
		
		Description = "Le barde utilise principalement ses sorts afin de battre ses ennemis, sans oublier son fameux luth qui le suit partout";
	}	
	
	@Override
	public int getClasseDegats() {
		return Math.max(0, (int) (Math.random() * 10) - 5);
	}
}