package Attaque;
import Classes.Classe;

public class TirTriple extends Attaque{
	public TirTriple(Classe classe) {
		super(classe);
		_description = "Tir trois fl�ches � la suite (1 Mana)";
		_nom = "Triple Tir";
		_type = "Physique";
	}
	
	public int ValeurAttaque() {
		
		int degats_fleche = 0;
		int degats_totaux = 0;
		
		for(int i = 0; i<3; i++)
		{
			if((_classe.getPhysique())> ((int)Math.random() * 100))
			{
				_degats = _classe.getClasseDegats() + _classe.getArmeDegatsM() ;
				degats_fleche =+ _classe.getArmeDegatsM();
				degats_totaux = _degats + degats_fleche;
			}
			else
			{}
		}
		return degats_totaux;
	}
}
