package Classes;
import Equipements.*;

public class Roublard extends Classe {
	
	public Roublard() {
		physique = 70;
	    social = 50;
	    mental = 50;
		sante = 14;
		mana = 6;

		arme =  Equipement.Dague;
		armure = Equipement.ArmureDeCuir;
		
		description = "Le Roublard est un assassin de l'ombre. Attaquer son ennemi dans le dos et tendre des embuscades est son mode opératoire.";
	}
}