package Joueur;

import Monstres.Ennemi;

public interface ExperienceIntf {
	/**
     * Met à jour l'expérience et le niveau du joueur à la fin d'un combat
     * @param joueur : Personnage de notre utilisateur de type Joueur
	 * @param ennemi : L'ennemi de notre héros de type Ennemi (Enum)
     */
    void xp(Joueur joueur, Ennemi ennemi);
    
    int getLevel();
    
    void setLevel(int Level);
    
    int getXp();
    
    void setXp(int Xp);
}
