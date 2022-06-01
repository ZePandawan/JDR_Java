package Attaque;
import Classes.Classe;

public class Feinte extends Attaque{
	public Feinte(Classe classe) {
		super(classe);
		_description = "Prétender à l'adversaire de vouloir jouer un morceau de luth et assènez lui un coup violent";
		_nom = "Feinte";
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
