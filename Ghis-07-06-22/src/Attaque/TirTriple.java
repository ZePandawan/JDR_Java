package Attaque;
import Classes.Classe;

public class TirTriple extends Attaque{
	public TirTriple(Classe classe) {
		super(classe);
		description = "Tir trois flèches à la suite";
		nom = "Triple Tir";
		type = "Physique";
	}
	
	public int valeurAttaque() {
		
		int degatsfleche = 0;
		int degatstotaux = 0;
		
		for(int i = 0; i<3; i++)
		{
			if((classe.getPhysique()) > random.nextInt(1, 101))
			{
				;
				degatsfleche = classe.getArmeDegatsP();
				degatstotaux += degatstotaux + degatsfleche;
			}
			else
			{}
		}
		return degatstotaux + classe.getClasseDegats();
	}
}