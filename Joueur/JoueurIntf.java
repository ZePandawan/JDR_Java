package Joueur;

import Attaque.*;
import Monstres.Monstre;

public interface JoueurIntf {

	void AttaqueEnnemi(Joueur attaquant, Monstre cible, Attaque attaque);
	void Defense(int degats);
}
