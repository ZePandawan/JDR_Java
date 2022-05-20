package Attaque;
import Classes.Classe;

public class AnimalTotem extends Attaque {
	public AnimalTotem(Classe classe) {
		super(classe);
		_description = "Appelle votre animal totem qui se infligera des dégâts à l'ennemi (1 Mana)";
		_nom = "Animal Totem";
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
