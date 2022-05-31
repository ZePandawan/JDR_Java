package Attaque;
import Joueur.Joueur;

public interface AttaqueIntf {
	
	/**
	 *Fonction utilis� dans le cas des attaques physiques. Permet d'effectuer un lanc� de d�s al�atoire afin de d�terminer si l'action est r�ussie ou non.
	 * @return d�gats de l'attaque
	 */
	int ValeurAttaque();
	
	/**
	 * Fonction utilis� dans le cas des attaques magiques. Compl�te la fonction pr�c�dente en enlevant le Mana requis au joueur.
	 * @param joueur 
	 * @return d�gats de l'attaque
	 */
	int ValeurAttaque(Joueur joueur);
}
