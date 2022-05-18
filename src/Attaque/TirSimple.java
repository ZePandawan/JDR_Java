package Attaque;

import Classes.Classe;

public class TirSimple extends Attaque {

	public TirSimple(Classe classe) {
		super(classe);
		_description = "Tirer une flèche sur votre adversaire";
		_degats = classe.getClasseDegats() + classe.getArmeDegats();
		_nom = "Tir Simple";
	}
	
	public int ValeurAttaque() {
		if((_classe.getPhysique())> ((int)Math.random() * 100))
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
