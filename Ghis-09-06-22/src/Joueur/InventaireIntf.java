package Joueur;

import java.util.ArrayList;

import Commandes.Jeu;
import Consommables.Consommables;
import Monstres.Ennemi;

public interface InventaireIntf {
	
	/**
	 * Ajoute l'objet à l'inventaire du joueur
	 * @param item : L'objet à ajouter de type Consommables (Enum)
	 * @param joueur : Personnage de l'utilisateur de type Joueur
	 */
	void ajouter_inventaire(Consommables item, Joueur joueur);
	
	/**
	 * Vérifie si l'inventaire du joueur dépasse 10 objets
	 * @param joueur Personnage de l'utilisateur de type Joueur
	 * @return : true si l'inventaire est plein, false sinon
	 */
	Boolean verif_inventaire_plein(Joueur joueur);
	
	/**
	 * Retire un objet de l'inventaire du joueur
	 * @param item : L'objet à ajouter de type Consommables (Enum)
	 * @param joueur : Personnage de l'utilisateur de type Joueur
	 */
	void supprimer_inventaire(Consommables item, Joueur joueur);
	
	/**
	 * Permet d'utiliser un objet présent dans l'inventaire (utilisable uniquement en combat)
	 * @param joueur : Personnage du joueur 
	 * @param ennemi : Ennemi contre lequel se bat le joueur
	 * @param jeu : Commande de jeu 
	 */
	void utiliser_objet(Joueur joueur, Ennemi ennemi, Jeu jeu);
	
	/**
	 * Affiche la liste des objets présents dans l'inventaire du joueur
	 * @param joueur : Personnage du joueur 
	 */
	void afficher_inventaire(Joueur joueur);
	
	/**
	 * Vide l'entièreté de l'inventaire du joueur
	 * @param joueur : Personnage du joueur
	 */
	void vider_inventaire(Joueur joueur);
	
	/**
	 * Permet d'utiliser un objet = ajouter Vie / Mana au statistiques du joueur
	 * @param joueur : Personnage du joueur
	 * @param item : Objet à utiliser
	 */
	void utiliser_consommable(Joueur joueur, Consommables item);
	
	ArrayList<Consommables> getObjets();
	
	void setObjets(ArrayList<Consommables> objets);
}
