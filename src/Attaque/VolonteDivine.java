package Attaque;

import Classes.Classe;

public class VolonteDivine extends Attaque {

	public VolonteDivine(Classe classe) {
		super(classe);
		_description = "Utiliser une grande partie de votre mana vous libérer un éclair foudroyant sur votre adversaire (2 Mana)";
		_degats = 8 + (int)(classe.getMental() /10);
		_nom = "Volonté Divine";
	}
	
	public int ValeurAttaque() {
		if((_classe.getMental() + 10)> ((int)Math.random() * 100))
		{
			_classe.EnleverMana(2);
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
