package Monstres;

import java.util.Random;

public class Aragorn extends Monstre {

	private String type = "Physique";
	
	public Aragorn() {
		super();
		Sante = 1;
		Degats = 0;
		Exp = 10;
	}
	
	public String getType()
	{
		return type;
	}

}
