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
	protected int _maxHp, _hp, _exp, _mana, _maxMana, _argent;
	protected Race race;
	protected Classe classe;
	
	protected ArrayList<String> Attaques = new ArrayList<String>();
	protected Inventaire Inventaire = new Inventaire();
	
	protected Commandes Commande = new Commandes();
	
	public int getManaMax()
	{
		return _maxMana;
	}
	
	public void SetMana(int mana)
	{
		_mana = mana;
	}
	
	public int getHp()
	{
		return _hp;
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
	
	
	public int getMana() {
		return _mana;
	}	
	
	public int getArgent()
	{
		return _argent;
	}
	
	public void setArgent(String operateur, int argent)
	{
		if(operateur == "+")
		{
			_argent += argent;
		}
		if(operateur == "-")
		{
			_argent -= argent;
		}
		else {}
	}
	
	public void setMana(String operateur, int mana)
	{
		if(operateur == "+")
		{
			if(_mana + mana < _maxMana)
			{
				_mana += mana;
			}
			else
			{
				_mana = _maxMana;
			}
		}
		if(operateur == "-")
		{
			_mana -= mana;
		}
		else{}
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
			_hp += classe.getArmure() - degats;
			
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
