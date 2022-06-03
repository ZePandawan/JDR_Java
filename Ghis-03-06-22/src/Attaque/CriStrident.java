package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class CriStrident extends Attaque {
	public CriStrident(Classe classe) {
		super(classe);
		_description = "Concentrer votre magie sur votre voix afin de produire un cri strident (1 Mana)";
		_nom = "Cri Strident";
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
				_degats = _classe.getClasseDegats() + _classe.getArmeDegatsM();
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
