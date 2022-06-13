package Attaque;
import Classes.Classe;

public class Ruee extends Attaque {
	public Ruee(Classe classe) {
		super(classe);
		description = "Lancer une ruée sur votre adversaire afin de lui porter un coup au ventre";
		nom = "Ruee";
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