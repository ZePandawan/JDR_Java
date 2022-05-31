package Terrain;
import java.util.ArrayList;
import Monstres.*;

public class Foret extends Terrain{
	
	protected ArrayList<Monstre> ListeMonstreForet = new ArrayList<Monstre>();
	
	
	public Foret()
	{
		
		ListeMonstreForet.add(new Araignee());
		ListeMonstreForet.add(new Warg());
		ListeMonstreForet.add(new Gobelin());
		
		ListeMonstres = ListeMonstreForet;
	}
}
