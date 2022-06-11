package Commandes;

import Attaque.Attaque;
import Joueur.Joueur;
import Monstres.Ennemi;

public interface JeuIntf {

	/**
	 * Interface regroupant les fonctions liées à la gestion du combat
	 */
	
	/**
	 * Affiche le menu principal du combat, demandant à l'utilisateur quel type d'attaque il veut sélectionner ou si celui-ci veut afficher son inventaire
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 * @param ennemi : L'ennemi de notre héros de type Ennemi (Enum)
	 */
	void menuCombat(Joueur joueur, Ennemi ennemi);
	
	/**
	 * Affiche la liste des attaques physique qui lui sont possible d'utiliser
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 * @param ennemi : L'ennemi de notre héros de type Ennemi (Enum)
	 */
	void menuAttaquesPhysiques(Joueur joueur, Ennemi ennemi);
	
	/**
	 * Affiche la description de l'attaque Physique sélectionnée par l'utilisateur
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 * @param ennemi : L'ennemi de notre héros de type Ennemi (Enum)
	 * @param choix : 1 ou 2, permet de définir si l'attaques sélectionnée est la N°1 ou la N°2
	 */
	void descriptionAttaquesPhysiques(Joueur joueur, Ennemi ennemi, int choix);
	
	/**
	 *  Affiche la liste des attaques magiques qui lui sont possible d'utiliser
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 * @param ennemi : L'ennemi de notre héros de type Ennemi (Enum)
	 */
	void menuAttaquesMagiques(Joueur joueur, Ennemi ennemi);
	
	/**
	 * 
	 * Affiche la description de l'attaque Magique sélectionnée par l'utilisateur
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 * @param ennemi : L'ennemi de notre héros de type Ennemi (Enum)
	 * @param choix : 1 ou 2, permet de définir si l'attaques sélectionnée est la N°1 ou la N°2
	 */
	void descriptionAttaquesMagiques(Joueur joueur, Ennemi ennemi, int choix);
	
	/**
	 * Fonction permettant de gérer le système de tour par tour du combat. + Gestion de la vérification de la vie du joueur et de l'ennemi. + Redirection vers d'autre méthodes afin d'effectuer les dégats
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 * @param ennemi : L'ennemi de notre héros de type Ennemi (Enum)
	 * @param attaque : L'attaque sélectionnée par l'utilisateur de type Attaque
	 */
	void combat(Joueur joueur, Ennemi ennemi, Attaque attaque);
	
}
