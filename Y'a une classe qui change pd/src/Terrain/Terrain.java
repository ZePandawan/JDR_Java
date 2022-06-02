package Terrain;

import java.util.ArrayList;

import Commandes.Jeu;
import Joueur.Joueur;
import Monstres.Ennemi;

public class Terrain {
	
	protected String Description;
	protected ArrayList<Ennemi> ListeMonstres;
	protected Jeu jeu = new Jeu();
	
	public void CombatTerrain(Joueur joueur)
	{
		int ChoixMonstre = (int)Math.random() * (ListeMonstres.size());
		
		switch(ChoixMonstre)
		{
			case 1:
			{
				jeu.MenuCombat(joueur, ListeMonstres.get(ChoixMonstre-1));
			}
				
		}
	}
}
