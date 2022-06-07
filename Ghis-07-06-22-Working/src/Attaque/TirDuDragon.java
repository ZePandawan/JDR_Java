package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class TirDuDragon extends Attaque{
	public TirDuDragon(Classe classe) {
		super(classe);
		description = "RYUU GA WAGA TEKI WO KURAU (2 Mana)";
		nom = "Tir du dragon";
		type = "Magique";
	}
	
	public int valeurAttaque(Joueur joueur) {
		if(joueur.getMana() < 2)
		{
			System.out.println("Vous n'avez pas assez de mana ! ");
			return 0;
		}
		else
		{
			if((classe.getMental() - 10) > random.nextInt(1, 101))
			{
				joueur.setMana(joueur.getMana() - 2);
				degats = classe.getClasseDegats() + classe.getArmeDegatsM() * 2;
				return degats;
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