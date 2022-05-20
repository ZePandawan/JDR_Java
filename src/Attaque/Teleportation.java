package Attaque;
import Classes.Classe;

public class Teleportation extends Attaque {
	public Teleportation(Classe classe) {
		super(classe);
		_description = "Téléportez vous derrière votre ennemi pour lui asséner un coup perforant avec votre arme (1 Mana)";
		_nom = "Téléportation";
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
			_degats = _classe.getClasseDegats() + _classe.getArmeDegatsM() ;
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
