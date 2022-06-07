package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class VolonteDOdin extends Attaque {
	public VolonteDOdin(Classe classe) {
		super(classe);
		description = "Vous recever une puissance surnaturelle et dirigez une éclair foudroyant vers votre ennemi (2 Mana)";
		nom = "Volonté d'Odin";
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