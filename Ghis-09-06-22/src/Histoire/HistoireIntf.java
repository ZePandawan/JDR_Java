package Histoire;

import Joueur.Joueur;

public interface HistoireIntf {

	/**
	 * Enregistre le nom du personne du joueur et créér l'objet "Joueur"
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 * @return le personnage du héros une fois créér
	 */
	Joueur defPersonnage(Joueur joueur);
}
