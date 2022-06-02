package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class VolonteDOdin extends Attaque {
	public VolonteDOdin(Classe classe) {
		super(classe);
		_description = "Vous recever une puissance surnaturelle et dirigez une éclair foudroyant vers votre ennemi (2 Mana)";
		_nom = "Volonté d'Odin";
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
				joueur.setMana("-",2);
				_degats = _classe.getClasseDegats() + _classe.getArmeDegatsM() * 2;
				return _degats;
			}
			else
			{
				joueur.setMana("-",2);
				System.out.println("Votre attaque n'a pas aboutit");
				return 0;
			}
		}
	}
}
