package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class PassageEnForce extends Attaque {
	public PassageEnForce(Classe classe) {
		super(classe);
		description = "Utiliser votre magie pour effectuer une charge vers l'ennemi, lui infligeant de lourds dégâts (1 Mana)";
		nom = "Passage en force";
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
				joueur.setMana(-1);
				degats = classe.getClasseDegats() + classe.getArmeDegatsM() ;
				return degats;
			}
			else
			{
				joueur.setMana(-1);
				System.out.println("Votre attaque n'a pas aboutit");
				return 0;
			}
		}
	}
}