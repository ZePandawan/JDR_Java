package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class OndePercante extends Attaque {
	public OndePercante(Classe classe) {
		super(classe);
		_description = "Libérer une forte onde qui se propage jusqu'à votre ennemi (2 Mana)";
		_nom = "Onde Perçante";
		_type = "Magique";
	}
	
	public int ValeurAttaque(Joueur joueur) {
		if(joueur.getMana() < 2)
		{
			System.out.println("Vous n'avez pas assez de mana ! ");
			return 0;
		}
		else
		{
			if((_classe.getMental() - 10) > random.nextInt(1, 100))
			{
				joueur.EnleverMana(2);
				_degats = _classe.getClasseDegats() + _classe.getArmeDegatsM() * 2 ;
				return _degats;
			}
			else
			{
				joueur.EnleverMana(2);
				System.out.println("Votre attaque n'a pas aboutit");
				return 0;
			}
		}
	}

}
