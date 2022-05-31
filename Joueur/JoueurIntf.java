package Joueur;

import Attaque.*;
import Monstres.Monstre;

public interface JoueurIntf {

	/**
	 * 
	 * @param attaquant
	 * @param cible
	 * @param attaque
	 */
	void AttaqueEnnemi(Joueur attaquant, Monstre cible, Attaque attaque);
	
	
	void Defense(int degats);
	
	
	public void EnleverMana(int value);
}
