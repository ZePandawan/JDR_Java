package Attaque;
import Classes.Classe;

public class Ruee extends Attaque {
	public Ruee(Classe classe) {
		super(classe);
		_description = "Lancer une ruée sur votre adversaire afin de lui porter un coup au ventre";
		_nom = "Ruee";
		_type = "Physique";
	}
	
	public int ValeurAttaque() {
		if((_classe.getPhysique() - 10) > random.nextInt(1, 101))
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
