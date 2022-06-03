package Attaque;
import Classes.Classe;

public class Combo extends Attaque {
	public Combo(Classe classe) {
		super(classe);
		_description = "Dominer votre ennemi en le frappant sans relache";
		_nom = "Combo";
		_type = "Physique";
	}
	
	public int ValeurAttaque() {
		int coups = random.nextInt(1, 8);
		int degats_coups = 0;
		
		for(int i = 0; i < coups; i++)
		{
			if((_classe.getPhysique() - 10) > random.nextInt(1, 101))
			{
				degats_coups += _classe.getArmeDegatsP() * 4;
			}
			else
			{
				System.out.println("Votre attaque N°" + i+1 + " n'a pas aboutit");
				return 0;
			}
		}
		_degats = _classe.getClasseDegats() + degats_coups;
		return _degats;
	}
}
