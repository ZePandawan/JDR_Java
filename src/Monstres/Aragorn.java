package Monstres;

public class Aragorn extends Monstre {

	private String type = "Physique";
	
	public Aragorn() {
		super();
		Sante = 1;
		Degats = 0;
	}
	
	public String getType()
	{
		return type;
	}

}
