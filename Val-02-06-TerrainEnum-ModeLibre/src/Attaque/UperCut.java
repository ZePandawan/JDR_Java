package Attaque;
import Classes.Classe;

public class UperCut extends Attaque {
	public UperCut(Classe classe) {
		super(classe);
		_description = "Infliger un violen upercut à votre adversaire";
		_nom = "Upercut";
		_type = "Physique";
	}
	
	public int ValeurAttaque() {
		if(_classe.getPhysique() > random.nextInt(1, 100))
		{
			_degats = _classe.getClasseDegats() + _classe.getArmeDegatsP();
			return _degats;
		}
		else
		{
			System.out.println("Votre attaque n'a pas aboutit");
			return 0;
		}
	}	
}
