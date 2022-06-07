package Monstres;
import java.util.Random;

import Commandes.Commandes;
import Joueur.Personnage;

public interface EnnemiIntf {

	 static Random random = new Random();
	 static Commandes Commande = new Commandes();
	
	 void attaque(Personnage cible);
	 void defend(int Degats);
}