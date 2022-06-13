package Attaque;
import Classes.Classe;

public class RageDuBerserk extends Attaque {
	public RageDuBerserk(Classe classe) {
		super(classe);
		description = "Entrer dans une rage sanguinaire et assénez de violents coups à votre ennemi";
		nom = "Rage du berserk";
		type = "Physique";
	}
	
	public int valeurAttaque() {
		int coups = random.nextInt(1, 5);
		int degatsfin = 0;
		
		for(int i = 0; i < coups; i++)
		{
			if((classe.getPhysique() - 10) > random.nextInt(1, 101))
			{
				degatsfin += classe.getClasseDegats() + classe.getArmeDegatsP() * 2;
			}
			else
			{
				System.out.println("Votre attaque N°" + i+1 + " n'a pas aboutit");
				return 0;
			}
		}
		degats = degatsfin;
		return degats;
	}
}