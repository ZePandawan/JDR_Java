package Attaque;
import Classes.Classe;

public class AttaqueCharge extends Attaque{
	public AttaqueCharge(Classe classe) {
		super(classe);
		description = "Attaque lourde avec votre arme, attention vous avez plus de chance de rater votre coup";
		nom = "Attaque Chargée";
		type = "Physique";
	}
	
	public int valeurAttaque() {
		if((classe.getPhysique() - 10) > random.nextInt(1, 101))
		{
			degats = classe.getClasseDegats() + classe.getArmeDegatsP() * 2;
			return degats;
		}
		else
		{
			System.out.println("Votre attaque n'a pas aboutit");
			return 0;
		}
	}
}