package Terrain;
import java.util.ArrayList;
import Monstres.*;

public class Foret extends Terrain{
	
	protected ArrayList<Ennemi> ListeMonstreForet = new ArrayList<Ennemi>();
	
	
	public Foret()
	{
		
		ListeMonstreForet.add(Ennemi.Araignee);
		ListeMonstreForet.add(Ennemi.Warg);
		ListeMonstreForet.add(Ennemi.Gobelin);
		
		ListeMonstres = ListeMonstreForet;
	}
}
