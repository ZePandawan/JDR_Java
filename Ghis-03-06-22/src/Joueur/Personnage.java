package Joueur;

import java.util.ArrayList;

import Attaque.Attaque;
import Classes.Classe;
import Commandes.Commandes;
import Inventaire.Inventaire;
import Monstres.Ennemi;
import Races.Race;

public class Personnage implements JoueurIntf {

	protected String _name;
	protected int _maxHp, _hp, _mana, _maxMana, _argent;
	protected Experience _exp;
	protected Race race;
	protected Classe classe;
	
	protected ArrayList<String> Attaques = new ArrayList<String>();
	protected Inventaire Inventaire = new Inventaire();
	
	protected Commandes Commande = new Commandes();
	
	public int getManaMax()
	{
		return _maxMana;
	}
	
	public void setManaMax(int maxMana)
	{
		_maxMana = maxMana;
	}
	
	public int getMana()
	{
		return _mana;
	}
	
	public void setMana(int mana)
	{
		_mana = mana;
	}

	public int getMaxHp()
	{
		return _maxHp;
	}
	
	public void setMaxHp(int maxHp)
	{
		_maxHp = maxHp;
	}
	
	public int getHp()
	{
		return _hp;
	}
	
	public void setHp(int hp)
	{
		_hp = hp;
	}
	
	public Experience getXp()
	{
		return _exp;
	}
	
	public void setXp(Experience Xp)
	{
		_exp = Xp;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public Classe getClasse()
	{
		return classe;
	}
	
	public Inventaire getInventaire()
	{
		return Inventaire;
	}
	
	public void setInventaire(Inventaire inventaire)
	{
		Inventaire = inventaire;
	}
	
	public int getArgent()
	{
		return _argent;
	}
	
	public void setArgent(int argent)
	{
		_argent = argent;
	}
	
	public void AttaqueEnnemi(Joueur attaquant, Ennemi cible, Attaque attaque){
		
		if(attaque.getType() == "Magique")
		{
			if(cible.getType() == attaque.getType())
			{
				cible.Defend(Math.max(0, attaque.ValeurAttaque(attaquant) - 2));
			}
			else
			{
				cible.Defend(attaque.ValeurAttaque(attaquant));
			}
		}
		
		
		if(attaque.getType() == "Physique")
		{
			if(cible.getType() == attaque.getType())
			{
				cible.Defend(Math.max(0, attaque.ValeurAttaque() - 2));
			}
			else
			{
				cible.Defend(attaque.ValeurAttaque());
			}
		}
		
		
		
		
		
	}

	public void Defense(int degats) {
		if(classe.getArmure() - degats < 0 )
		{
			_hp = Math.max(0 , _hp  - Math.max(0, degats - classe.getArmure()));
			
			Commande.AfficherEntete(30, 
					  "Vous avez subit :" + (degats - classe.getArmure()) + "dégats.\n"
					+ "Points de vie restants : " + _hp);
		}
		else 
		{
			Commande.AfficherEntete(30, 
					"Vous n'avez subit aucun dégat ! \n"
					+ "Points de vie restants : " + _hp);
		}
	}


}
