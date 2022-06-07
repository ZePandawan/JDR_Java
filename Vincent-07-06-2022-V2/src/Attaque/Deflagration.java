package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class Deflagration extends Attaque{
	public Deflagration(Classe classe) {
		super(classe);
		description = "Innonder votre adversaire d'un jet de flamme continu (2 Mana)";
		nom = "Deflagration";
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