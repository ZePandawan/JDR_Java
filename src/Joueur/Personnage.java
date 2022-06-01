package Joueur;

import java.util.ArrayList;

import Attaque.Attaque;
import Classes.Classe;
import Commandes.Commandes;
import Monstres.Ennemi;
import Races.Race;

public class Personnage implements JoueurIntf {

	protected String _name;
	protected int _maxHp, _hp, _exp, _mana, _maxMana;
	protected Race race;
	protected Classe classe;
	
	protected ArrayList<String> Attaques = new ArrayList<String>();
	protected ArrayList<String> Inventaire = new ArrayList<String>();
	
	protected Commandes Commande = new Commandes();
	
	public Personnage(String name, int maxHp, int exp) {
		_name = name;
		_maxHp = maxHp;
		_exp = exp;
		_hp = maxHp;
	}
	
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
	
	public int getMana() {
		return _mana;
	}	
	
	public void EnleverMana(int value)
	{
		_mana -= value;
	}
	
	public void AttaqueEnnemi(Joueur attaquant, Ennemi cible, Attaque attaque){
		
		if(cible.getType() == attaque.getType())
		{
			cible.Defend(attaque.ValeurAttaque(attaquant) - 2 );
		}
		else
		{
			cible.Defend(attaque.ValeurAttaque(attaquant));
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
