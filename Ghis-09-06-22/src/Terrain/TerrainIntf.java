package Terrain;

import Joueur.Joueur;

public interface TerrainIntf {
    
    /**
     * Permet de lancer un combat entre le joueur et un monstre présent dans ce terrain.
     * @param joueur
     */
    void combatTerrain(Joueur joueur);
}
