package Attaque;
import Classes.Classe;

public class Combo extends Attaque {
	public Combo(Classe classe) {
		super(classe);
		description = "Dominer votre ennemi en le frappant sans relache";
		nom = "Combo";
		type = "Physique";
	}
	
	public int valeurAttaque() {
		int coups = random.nextInt(1, 8);
		int degatscoups = 0;
		
		for(int i = 0; i < coups; i++)
		{
			if((classe.getPhysique() - 10) > random.nextInt(1, 101))
			{
				degatscoups += classe.getArmeDegatsP() * 4;
			}
			else
			{
				System.out.println("Votre attaque N°" + i+1 + " n'a pas aboutit");
				return 0;
			}
		}
		degats = classe.getClasseDegats() + degatscoups;
		return degats;
	}
}