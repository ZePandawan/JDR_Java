package Attaque;
import Classes.Classe;
import Joueur.Joueur;

public class TremblementTerre extends Attaque {
	public TremblementTerre(Classe classe) {
		super(classe);
		description = "Concentrer votre mana dans votre poing et frapper le sol pour produire une immence onde de choc. (2 Mana)";
		nom = "Tremblement de terre";
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