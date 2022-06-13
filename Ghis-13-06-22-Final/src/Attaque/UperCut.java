package Attaque;
import Classes.Classe;

public class UperCut extends Attaque {
	public UperCut(Classe classe) {
		super(classe);
		description = "Infliger un violen upercut à votre adversaire";
		nom = "Upercut";
		type = "Physique";
	}
	
	public int valeurAttaque() {
		if(classe.getPhysique() > random.nextInt(1, 101))
		{
			degats = classe.getClasseDegats() + classe.getArmeDegatsP();
			return degats;
		}
		else
		{
			System.out.println("Votre attaque n'a pas aboutit");
			return 0;
		}
	}	
}