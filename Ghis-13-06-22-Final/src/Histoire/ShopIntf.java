package Histoire;

import Consommables.Consommables;
import Joueur.Joueur;

public interface ShopIntf {

	/**
	 * Affiche les différents objets achetables par l'utilisateur, appelle les fonctions nécessaire à la gestion de l'argent et l'ajout à l'inventaire du joueur
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 */
	public void afficherShop(Joueur joueur);
	
	/**
	 * Ajoute l'objet à l'inventaire du joueur et retire le prix de l'objet à la bourse du joueur
	 * @param Item : Objets que le joueur achète de type Consommable (Enum)
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 */
	public void acheterItem(Consommables Item, Joueur joueur);
}
