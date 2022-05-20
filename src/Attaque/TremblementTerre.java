package Attaque;
import Classes.Classe;

public class TremblementTerre extends Attaque {
	public TremblementTerre(Classe classe) {
		super(classe);
		_description = "Concentrer votre mana dans votre poing et frapper le sol pour produire une immence onde de choc. (2 Mana)";
		_nom = "Tremblement de terre";
		_type = "Magique";
	}
	
	public int ValeurAttaque() {
		if(_classe.getMana() < 2)
		{
			System.out.println("Vous n'avez pas assez de mana ! ");
			return 0;
		}
		if((_classe.getMental() - 10)> ((int)Math.random() * 100))
		{
			_classe.EnleverMana(2);
			_degats = _classe.getClasseDegats() + _classe.getArmeDegatsM() * 2;
			return _degats;
		}
		else
		{
			_classe.EnleverMana(2);
			System.out.println("Votre attaque n'a pas aboutit");
			return 0;
		}
	}

}
