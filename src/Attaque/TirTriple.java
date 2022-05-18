package Attaque;

import Classes.Classe;

public class TirTriple extends Attaque{

	public TirTriple(Classe classe) {
		super(classe);
		_description = "Tir trois flèches à la suite";
		_degats = classe.getClasseDegats() + classe.getArmeDegats() ;
		_nom = "Triple Tir";
	}
	
	public int ValeurAttaque() {
		
		int degat_fleche = 0;
		
		for(int i = 0; i<3; i++)
		{
			if((_classe.getPhysique() - 15)> ((int)Math.random() * 100))
			{
				degat_fleche =+ 2;
			}
			else
			{}
		}
		return _degats + degat_fleche;
	}

}
