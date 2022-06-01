package Attaque;
import Classes.Classe;

public class CoupBas extends Attaque{
	public CoupBas(Classe classe) {
		super(classe);
		_description = "Feintez votre adversaire pour lui assener un coup bas";
		_nom = "Coup Bas";
		_type = "Physique";
	}
	
	public int ValeurAttaque() {
		if((_classe.getPhysique() - 10)> ((int)Math.random() * 100))
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
