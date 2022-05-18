package Attaque;
import Classes.*;

public class AttaqueCharge extends Attaque{
	public AttaqueCharge(Classe classe) {
		super(classe);
		_description = "Attaque lourde avec votre arme, attention vous avez plus de chance de rater votre coup";
		_degats = classe.getClasseDegats() + classe.getArmeDegats() * 2;
		_nom = "Attaque Chargé";
		
	}
	
	public int ValeurAttaque() {
		if((_classe.getPhysique() - 10)> ((int)Math.random() * 100))
		{
			return _degats;
		}
		else
		{
			System.out.println("Votre attaque n'a pas aboutit");
			return 0;
		}
	}

}
