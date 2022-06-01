package Attaque;
import Classes.Classe;

public class VolonteDivine extends Attaque {
	public VolonteDivine(Classe classe) {
		super(classe);
		_description = "Une épée de lumière apparait devant vous et est projetée vers l'ennemi. (2 Mana)";
		_nom = "Volonté Divine";
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
