package Histoire;

import Attaque.Attaque;
import Joueur.Joueur;
import Monstres.Ennemi;

public interface IntroIntf {
	
	/**
	 * Introduction du mode Histoire, affichange des dialogues et interractions
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 */
	void introduction(Joueur joueur);
	
	/**
	 * Débute le combat d'introduction entre le joueur et le premier ennemi
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 */
	void combatIntro(Joueur joueur);
	
	/**
	 * Affiche le menu principal du combat, demandant à l'utilisateur quel type d'attaque il veut sélectionner
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 * @param ennemi : Ennemi qu'affronte le joueur, de type Ennemi (Enum)
	 */
	void tutorielMenuCombat(Joueur joueur, Ennemi ennemi);
	
	/**
	 * Affiche la liste des attaques magiques qui lui sont possible d'utiliser
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 * @param ennemi : L'ennemi de notre héros de type Ennemi (Enum)
	 */
	void tutorielMenuAttaquesMagiques(Joueur joueur, Ennemi ennemi);
	
	/*
	 * Affiche la description de l'attaque Magique sélectionnée par l'utilisateur
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 * @param ennemi : L'ennemi de notre héros de type Ennemi (Enum)
	 * @param choix : 1 ou 2, permet de définir si l'attaques sélectionnée est la N°1 ou la N°2
	 */
	public void tutorielDescriptionAttaqueMagiques(Joueur joueur, Ennemi ennemi, int choix);
	
	/**
	 * Fonction permettant de gérer le système de tour par tour du combat. + Gestion de la vérification de la vie du joueur et de l'ennemi. + Redirection vers d'autre méthodes afin d'effectuer les dégats
	 * @param joueur : Personnage de notre utilisateur de type Joueur
	 * @param ennemi : L'ennemi de notre héros de type Ennemi (Enum)
	 * @param attaque : L'attaque sélectionnée par l'utilisateur de type Attaque
	 */
	void tutorielCombat(Joueur joueur, Ennemi ennemi, Attaque attaque);
}
