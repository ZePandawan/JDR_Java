package Terrain;

import java.util.ArrayList;

import Commandes.Jeu;
import Joueur.Joueur;
import Monstres.Ennemi;

public interface TerrainIntf {

	ArrayList<Ennemi> listeMonstres = new ArrayList<Ennemi>();
    Jeu jeu = new Jeu();
    
    
    /**
     * Permet de lancer un combat entre le joueur et un monstre présent dans ce terrain.
     * @param joueur
     */
    void combatTerrain(Joueur joueur);
}
