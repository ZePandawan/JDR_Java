package Classes;
import Equipements.*;

public class Roublard extends Classe {
	
	public Roublard() {
		Physique = 70;
	    Social = 50;
	    Mental = 50;
		Sante = 14;
		Mana = 6;

		Arme =  Equipement.Dague;
		Armure = Equipement.ArmureDeCuir;
		
		Description = "Le Roublard est un assassin de l'ombre. Attaquer son ennemi dans le dos et tendre des embuscades est son mode opératoire.";
	}
}