package Joueur;

import java.util.ArrayList;

import Attaque.Attaque;
import Classes.Classe;
import Commandes.Commandes;
import Monstres.Ennemi;
import Races.Race;

public class Personnage implements JoueurIntf {

	protected String name;
	protected int maxHp, hp, mana, maxMana, argent;
	protected Experience exp;
	protected Race race;
	protected Classe classe;
	
	protected ArrayList<String> attaques = new ArrayList<String>();
	protected Inventaire inventaire = new Inventaire();
	
	protected Commandes commande = new Commandes();
	
	public int getManaMax()
	{
		return maxMana;
	}
	
	public void setManaMax(int MaxMana)
	{
		maxMana = MaxMana;
	}
	
	public int getMana()
	{
		return mana;
	}
	
	public void setMana(int Mana)
	{
		mana = Mana;
	}

	public int getMaxHp()
	{
		return maxHp;
	}
	
	public void setMaxHp(int MaxHp)
	{
		maxHp = MaxHp;
	}
	
	public int getHp()
	{
		return hp;
	}
	
	public void setHp(int Hp)
	{
		hp = Hp;
	}
	
	public Experience getXp()
	{
		return exp;
	}
	
	public void setXp(Experience Xp)
	{
		exp = Xp;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Classe getClasse()
	{
		return classe;
	}
	
	public Inventaire getInventaire()
	{
		return inventaire;
	}
	
	public void setInventaire(Inventaire Inventaire)
	{
		inventaire = Inventaire;
	}
	
	public int getArgent()
	{
		return argent;
	}
	
	public void setArgent(int Argent)
	{
		argent = Argent;
	}
	
	public void attaqueEnnemi(Joueur attaquant, Ennemi cible, Attaque attaque){
		
		if(attaque.getType() == "Magique")
		{
			if(cible.getType() == attaque.getType())
			{
				cible.defend(Math.max(0, attaque.valeurAttaque(attaquant) - 2));
			}
			else
			{
				cible.defend(attaque.valeurAttaque(attaquant));
			}
		}
		
		
		if(attaque.getType() == "Physique")
		{
			if(cible.getType() == attaque.getType())
			{
				cible.defend(Math.max(0, attaque.valeurAttaque() - 2));
			}
			else
			{
				cible.defend(attaque.valeurAttaque());
			}
		}
	}

	public void defense(int degats) {
		if(classe.getArmure() - degats < 0 )
		{
			hp = Math.max(0 , hp  - Math.max(0, degats - classe.getArmure()));
			
			commande.afficherEntete(30, 
					  "Vous avez subit :" + (degats - classe.getArmure()) + "dégats.\n"
					+ "Points de vie restants : " + hp);
		}
		else 
		{
			commande.afficherEntete(30, 
					"Vous n'avez subit aucun dégat ! \n"
					+ "Points de vie restants : " + hp);
		}
	}
}