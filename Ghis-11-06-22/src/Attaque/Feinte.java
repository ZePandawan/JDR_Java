package Attaque;
import Classes.Classe;

public class Feinte extends Attaque{
	public Feinte(Classe classe) {
		super(classe);
		description = "Prétender à l'adversaire de vouloir jouer un morceau de luth et assènez lui un coup violent";
		nom = "Feinte";
		type = "Physique";
	}
	
	public int valeurAttaque() {
		if((classe.getPhysique() - 10) > random.nextInt(1, 101))
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