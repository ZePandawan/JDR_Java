package Attaque;
import Classes.Classe;
import Joueur.Joueur;


public class AnimalTotem extends Attaque {
	public AnimalTotem(Classe classe) {
		super(classe);
		description = "Appelle votre animal totem qui se infligera des dégâts à l'ennemi (1 Mana)";
		nom = "Animal Totem";
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
			if((classe.getMental() > (random.nextInt(1, 101))))
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