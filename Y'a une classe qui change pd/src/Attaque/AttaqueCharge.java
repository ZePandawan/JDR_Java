package Attaque;
import Classes.Classe;

public class AttaqueCharge extends Attaque{
	public AttaqueCharge(Classe classe) {
		super(classe);
		_description = "Attaque lourde avec votre arme, attention vous avez plus de chance de rater votre coup";
		_nom = "Attaque Chargée";
		_type = "Physique";
	}
	
	public int ValeurAttaque() {
		if((_classe.getPhysique() - 10) > random.nextInt(1, 100))
		{
			_degats = _classe.getClasseDegats() + _classe.getArmeDegatsP() * 2;
			return _degats;
		}
		else
		{
			System.out.println("Votre attaque n'a pas aboutit");
			return 0;
		}
	}
}
