package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class PassageEnForce extends Attaque {
	public PassageEnForce(Classe classe) {
		super(classe);
		_description = "Utiliser votre magie pour effectuer une charge vers l'ennemi, lui infligeant de lourds dégâts (1 Mana)";
		_nom = "Passage en force";
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
			if(_classe.getMental() > random.nextInt(1, 100))
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
