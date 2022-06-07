package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class TirGuide extends Attaque {
	public TirGuide(Classe classe) {
		super(classe);
		description = "Utiliser votre magie pour guider votre flèche directement sur l'ennemi, vous donnant plus de chance de le toucher (1 Mana)";
		nom = "Tir Guidé";
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
				degats = classe.getClasseDegats() + classe.getArmeDegatsM() ;
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