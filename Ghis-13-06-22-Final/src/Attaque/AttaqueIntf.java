package Attaque;

import Joueur.Joueur;

public interface AttaqueIntf {
	
	/**
	 *Fonction utilisée dans le cas des attaques physiques. Permet d'effectuer un lancé de dés aléatoire afin de déterminer si l'action est réussie ou non.
	 * @return dégats de l'attaque
	 */
	int valeurAttaque();
	
	/**
	 * Fonction utilisée dans le cas des attaques magiques. Complète la fonction précédente en enlevant le Mana requis au joueur.
	 * @param joueur 
	 * @return dégats de l'attaque
	 */
	int valeurAttaque(Joueur joueur);
	
	String getNom();
	
	String getDescription();
	
	String getType();
}