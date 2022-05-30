package Attaque;
import Classes.Classe;
import Joueur.Joueur;


public class AnimalTotem extends Attaque {
	public AnimalTotem(Classe classe) {
		super(classe);
		_description = "Appelle votre animal totem qui se infligera des dégâts à l'ennemi (1 Mana)";
		_nom = "Animal Totem";
		_type = "Magique";
	}
	
	public int ValeurAttaque(Joueur joueur) {
		if(joueur.getMana() < 1)
		{
			System.out.println("Vous n'avez pas assez de mana ! ");
			return 0;
		}
		else
		{
			if((_classe.getMental() > (random.nextInt(1, 100))))
			{
				joueur.EnleverMana(1);
				_degats = _classe.getClasseDegats() + _classe.getArmeDegatsM();
				return _degats;
			}
			else
			{
				joueur.EnleverMana(1);
				System.out.println("Votre attaque n'a pas aboutit");
				return 0;
			}
		}
	}
}
