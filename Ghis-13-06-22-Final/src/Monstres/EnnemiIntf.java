package Monstres;
import java.util.Random;

import Commandes.Commandes;
import Joueur.Personnage;

public interface EnnemiIntf {
	
	static Random random = new Random();
	static Commandes Commande = new Commandes();
	
	 /**
	  * Attaquer le Joueur
	  * @param cible : Personnage de notre joueur
	  */
	 void attaque(Personnage cible);
	 
	 /**
	  * Permet de mettre à jour la vie du monstre suite à une attaque du Joueur
	  * @param Degats : dégats subis par l'ennemi 
	  */
	 void defend(int Degats);
	 
	 /**
	  * Permet de mettre à jour la vie du monstre au maximum
	  * @param ennemi : Ennemi contre lequel le joueur s'est battu
	  */
	 void soinMonstre(Ennemi ennemi);
	 
	 String getNom();
	 
	 int getSante();
	 
	 void setSante(int Sante);
	 
	 int getDegats() ;
	 
	 int getExp();
	 
	 int getRecompense();
	 
	 String getType();
	 
	 String getDescription();
}