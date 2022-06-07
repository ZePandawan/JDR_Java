package Attaque;
import Classes.Classe;

public class CoupBas extends Attaque{
	public CoupBas(Classe classe) {
		super(classe);
		description = "Feintez votre adversaire pour lui assener un coup bas";
		nom = "Coup Bas";
		type = "Physique";
	}
	
	public int valeurAttaque() {
		if((classe.getPhysique() - 10) > random.nextInt(0, 101))
		{
			degats = classe.getClasseDegats() + classe.getArmeDegatsP() * 2;
			return degats;
		}
		else
		{
			System.out.println("Votre attaque n'a pas aboutit");
			return 0;
		}
	}
}