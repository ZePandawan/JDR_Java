package Joueur;

import Attaque.*;
import Monstres.Monstre;

public interface JoueurIntf {

	void AttaqueEnnemi(Monstre cible, Attaque attaque);
	void Defense(int degats);
}
