package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class Teleportation extends Attaque {
	public Teleportation(Classe classe) {
		super(classe);
		description = "Téléportez vous derrière votre ennemi pour lui asséner un coup perforant avec votre arme (1 Mana)";
		nom = "Téléportation";
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