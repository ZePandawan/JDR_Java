package Attaque;
import Classes.Classe;

public class CriStrident extends Attaque {
	public CriStrident(Classe classe) {
		super(classe);
		_description = "Concentrer votre magie sur votre voix afin de produire un cri strident (1 Mana)";
		_nom = "Cri Strident";
		_type = "Magique";
	}
	
	public int ValeurAttaque() {
		if(_classe.getMana() < 1)
		{
			System.out.println("Vous n'avez pas assez de mana ! ");
			return 0;
		}
		if((_classe.getMental() > ((int)Math.random() * 100)))
		{
			_classe.EnleverMana(1);
			_degats = _classe.getClasseDegats() + _classe.getArmeDegatsM();
			return _degats;
		}
		else
		{
			_classe.EnleverMana(1);
			System.out.println("Votre attaque n'a pas aboutit");
			return 0;
		}
	}

}
