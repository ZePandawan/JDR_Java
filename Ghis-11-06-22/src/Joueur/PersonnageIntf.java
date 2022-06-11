package Joueur;

import Attaque.Attaque;
import Classes.Classe;
import Monstres.Ennemi;

public interface PersonnageIntf {

	/**
	 * Attaque l'ennemi (appelle la fonction Defense de l'Ennemi)
	 * @param attaquant : Personnage de notre joueur
	 * @param cible : Ennemi contre lequelle notre utilisateur se bat
	 * @param attaque : Attaque sélectionnée par l'utilisateur
	 */
	void attaqueEnnemi(Joueur attaquant, Ennemi cible, Attaque attaque);
	
	/**
	 * Déduit la vie du joueur après les dégats infligés par l'ennemi
	 * @param degats : dégats infligés par l'ennemi
	 */
	void defense(int degats);
	
	int getManaMax();
	
	void setManaMax(int MaxMana);
	
	int getMana();
	
	void setMana(int Mana);
	
	int getMaxHp();
	
	void setMaxHp(int MaxHp);
	
	int getHp();
	
	void setHp(int Hp);
	
	Experience getXp();
	
	void setXp(Experience Xp);
	
	String getName();
	
	Classe getClasse();
	
	Inventaire getInventaire();
	
	void setInventaire(Inventaire Inventaire);
	
	int getArgent();
	
	void setArgent(int Argent);
}
