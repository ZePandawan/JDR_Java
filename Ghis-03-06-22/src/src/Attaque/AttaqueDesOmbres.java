package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class AttaqueDesOmbres extends Attaque {
	public AttaqueDesOmbres(Classe classe) {
		super(classe);
		_description = "Créez un clone de vous qui se chargera d'attaquer votre ennemi (2 Mana)";
		_nom = "Attaque des ombres";
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
			if((_classe.getMental() - 10) > random.nextInt(1, 101))
			{
				joueur.setMana(joueur.getMana() - 2);
				_degats = _classe.getClasseDegats() + _classe.getArmeDegatsM() * 2;
				return _degats;
			}
			else
			{
				joueur.setMana(joueur.getMana() - 2);
				System.out.println("Votre attaque n'a pas aboutit");
				return 0;
			}
		}
	}
}
