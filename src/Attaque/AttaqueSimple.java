package Attaque;
import Classes.Classe;

public class AttaqueSimple extends Attaque {
	public AttaqueSimple(Classe classe) {
		super(classe);
		_description = "Frapper l'ennemi simplement avec votre arme";
		_degats = classe.getClasseDegats() + classe.getArmeDegats();
		_nom = "Atttaque Simple";
	}
	
	public int ValeurAttaque() {
		if(_classe.getPhysique() > ((int)Math.random() * 100))
		{
			return _degats;
		}
		else
		{
			System.out.println("Votre attaque n'a pas aboutit");
			return 0;
		}
	}	
}
