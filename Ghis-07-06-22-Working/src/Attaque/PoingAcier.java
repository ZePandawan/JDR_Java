package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class PoingAcier extends Attaque {
	public PoingAcier(Classe classe) {
		super(classe);
		description = "Transformer votre poing en acier et infliger un violent coup à votre adversaire (1 Mana)";
		nom = "Poing d'Acier";
		type = "Magique";
	}
	
	public int valeurAttaque(Joueur joueur) {
		if(joueur.getMana() < 1)
		{
			System.out.println("Vous n'avez pas assez de mana ! ");
			return 0;
		}
		else
		{
			if(classe.getMental() > random.nextInt(1, 101))
			{
				joueur.setMana(joueur.getMana() - 1);
				degats = classe.getClasseDegats() + classe.getArmeDegatsM();
				return degats;
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