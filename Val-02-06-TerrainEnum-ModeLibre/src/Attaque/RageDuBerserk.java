package Attaque;
import Classes.Classe;

public class RageDuBerserk extends Attaque {
	public RageDuBerserk(Classe classe) {
		super(classe);
		_description = "Entrer dans une rage sanguinaire et assénez de violents coups à votre ennemi";
		_nom = "Rage du berserk";
		_type = "Physique";
	}
	
	public int ValeurAttaque() {
		int coups = random.nextInt(1, 5);
		int degats_fin = 0;
		
		for(int i = 0; i < coups; i++)
		{
			if((_classe.getPhysique() - 10) > random.nextInt(1, 100))
			{
				degats_fin += _classe.getClasseDegats() + _classe.getArmeDegatsP() * 2;
			}
			else
			{
				System.out.println("Votre attaque N°" + i+1 + " n'a pas aboutit");
				return 0;
			}
		}
		_degats = degats_fin;
		return _degats;
	}
}
