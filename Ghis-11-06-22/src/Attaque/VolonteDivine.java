package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class VolonteDivine extends Attaque {
	public VolonteDivine(Classe classe) {
		super(classe);
		description = "Une épée de lumière apparait devant vous et est projetée vers l'ennemi. (2 Mana)";
		nom = "Volonté Divine";
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
				joueur.setMana(-2);
				degats = classe.getClasseDegats() + classe.getArmeDegatsM() * 2;
				return degats;
			}
			else
			{
				joueur.setMana(-2);
				System.out.println("Votre attaque n'a pas aboutit");
				return 0;
			}
		}
	}
}