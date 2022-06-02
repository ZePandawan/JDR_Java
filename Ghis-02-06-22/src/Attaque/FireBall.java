package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class FireBall extends Attaque {
	public FireBall(Classe classe) {
		super(classe);
		_description = "Lancer une boule de feu sur votre adversaire (1 Mana)";
		_nom = "Boule de feu";
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
				joueur.setMana("-",1);
				_degats = _classe.getClasseDegats() + _classe.getArmeDegatsM() ;
				return _degats;
			}
			else
			{
				joueur.setMana("-",1);
				System.out.println("Votre attaque n'a pas aboutit");
				return 0;
			}
		}
	}

}

