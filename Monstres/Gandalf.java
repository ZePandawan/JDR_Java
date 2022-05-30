package Monstres;

public class Gandalf extends Monstre {

	private String type = "Magique";
	
	public Gandalf() {
		super();
		Sante = 1;
		Exp = 10;
	}
	
	public String getType()
	{
		return type;
	}

}
