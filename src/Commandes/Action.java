package Commandes;

import java.util.Random;

public class Action extends Interface {
	
	public int LanceDe() {
		int des = new Random().nextInt(100);
		return des;		
	} 
}
