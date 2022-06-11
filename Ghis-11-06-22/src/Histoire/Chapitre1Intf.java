package Histoire;

import Joueur.Joueur;

public interface Chapitre1Intf {
	
	/**
	 * Déroulement du chapitre 1
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 */
	void chapitre1(Joueur joueur);
	
	/**
	 * Redirige le joueur selon sont choix 
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 */
	void choix_Edoras(Joueur joueur);
	
	/**
	 * Choix où le joueur à décider d'aller visiter le Bar de la ville
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 */
	void edorasBar(Joueur joueur);
	
	/**
	 * Interraction Bonus/Malus avec le gérant du Bar 
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 */
	void choixBoisson(Joueur joueur);

}
