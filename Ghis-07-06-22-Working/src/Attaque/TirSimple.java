package Attaque;
import Classes.Classe;

public class TirSimple extends Attaque {
	public TirSimple(Classe classe) {
		super(classe);
		description = "Tirer une flèche sur votre adversaire";
		nom = "Tir Simple";
		type = "Physique";
	}
	
	public int valeurAttaque() {
		if((classe.getPhysique())> random.nextInt(1, 101))
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