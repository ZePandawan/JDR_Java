package Attaque;
import Classes.Classe;

public class AttaqueSimple extends Attaque {
	public AttaqueSimple(Classe classe) {
		super(classe);
		_description = "Frapper l'ennemi simplement avec votre arme";
		_nom = "Attaque Simple";
		_type = "Physique";
	}
	
	public int ValeurAttaque() {
		if(_classe.getPhysique() > ((int)Math.random() * 100))
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
