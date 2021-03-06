package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class TirDuDragon extends Attaque{
	public TirDuDragon(Classe classe) {
		super(classe);
		_description = "RYUU GA WAGA TEKI WO KURAU (2 Mana)";
		_nom = "Tir du dragon";
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
