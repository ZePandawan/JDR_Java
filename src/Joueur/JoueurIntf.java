package Joueur;

import Attaque.*;
import Monstres.Ennemi;

public interface JoueurIntf {

	/**
	 * 
	 * @param attaquant
	 * @param cible
	 * @param attaque
	 */
	void AttaqueEnnemi(Joueur attaquant, Ennemi cible, Attaque attaque);
	
	
	void Defense(int degats);
	
	
	public void EnleverMana(int value);
}
