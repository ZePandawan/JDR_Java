package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class Teleportation extends Attaque {
	public Teleportation(Classe classe) {
		super(classe);
		_description = "Téléportez vous derrière votre ennemi pour lui asséner un coup perforant avec votre arme (1 Mana)";
		_nom = "Téléportation";
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
			if(_classe.getMental() > random.nextInt(1, 101))
			{
				joueur.setMana(joueur.getMana() - 1);
				_degats = _classe.getClasseDegats() + _classe.getArmeDegatsM() ;
				return _degats;
			}
			else
			{
				joueur.setMana(joueur.getMana() - 1);
				System.out.println("Votre attaque n'a pas aboutit");
				return 0;
			}
		}
	}

}
