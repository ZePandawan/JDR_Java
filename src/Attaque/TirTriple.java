package Attaque;
import Classes.Classe;

public class TirTriple extends Attaque{
	public TirTriple(Classe classe) {
		super(classe);
		_description = "Tir trois flèches à la suite";
		_nom = "Triple Tir";
		_type = "Physique";
	}
	
	public int ValeurAttaque() {
		
		int degats_fleche = 0;
		int degats_totaux = 0;
		
		for(int i = 0; i<3; i++)
		{
			if((_classe.getPhysique()) > random.nextInt(1, 100))
			{
				_degats = _classe.getClasseDegats();
				degats_fleche = _classe.getArmeDegatsP();
				degats_totaux += degats_totaux + _degats + degats_fleche;
			}
			else
			{}
		}
		return degats_totaux;
	}
}
