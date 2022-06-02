package Terrain;

import java.util.ArrayList;
import Monstres.Ennemi;

public enum EnumTerrain {
	
	
	Foret(Ennemi.Araignee, Ennemi.Warg, Ennemi.Sauron);

	ArrayList<Ennemi> ListeMonstre = new ArrayList<Ennemi>();
	
	EnumTerrain(Ennemi e1, Ennemi e2, Ennemi e3){
		ListeMonstre.add(e1);
		ListeMonstre.add(e2);
		ListeMonstre.add(e3);
	}
}
