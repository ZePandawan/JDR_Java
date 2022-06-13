package Attaque;
import Classes.Classe;

public class AttaqueSimple extends Attaque {
	public AttaqueSimple(Classe classe) {
		super(classe);
		description = "Frapper l'ennemi simplement avec votre arme";
		nom = "Attaque Simple";
		type = "Physique";
	}
	
	public int valeurAttaque() {
		if(classe.getPhysique() > random.nextInt(1, 101))
		{
			degats = classe.getClasseDegats() + classe.getArmeDegatsP();
			return degats;
		}
		else
		{
			System.out.println("Votre attaque n'a pas aboutit");
			return 0;
		}
	}	
}