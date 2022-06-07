package Joueur;

import Attaque.*;
import Monstres.Ennemi;

public interface JoueurIntf {

   /**
   * 
    * 	 * @param attaquant
    * 	 * @param cible
    * 	 * @param attaque */	
	void attaqueEnnemi(Joueur attaquant, Ennemi cible, Attaque attaque);
	
	void defense(int degats);
}