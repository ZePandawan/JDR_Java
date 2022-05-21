package Joueur;

import java.util.ArrayList;

import Attaque.Attaque;
import Classes.Classe;
import Monstres.Monstre;
import Races.Race;

public class Personnage implements JoueurIntf {

	protected String _name;
	protected int _maxHp, _hp, _exp, _mana;
	protected Race race;
	protected Classe classe;
	
	protected ArrayList<String> Attaques = new ArrayList<String>();
	protected ArrayList<String> Inventaire = new ArrayList<String>();
	
	public Personnage(String name, int maxHp, int exp) {
		_name = name;
		_maxHp = maxHp;
		_exp = exp;
		_hp = maxHp;
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
	
	public void AttaqueEnnemi(Monstre cible, Attaque attaque){
		
		if(cible.getType() == attaque.getType())
		{
			cible.Defend(attaque.ValeurAttaque() / 2);
		}
		else
		{
			cible.Defend(attaque.ValeurAttaque());
		}
		
	}

	@Override
	public void Defense(int degats) {
		if(classe.getArmure() - degats < 0 )
		{
			_hp += classe.getArmure() - degats;
			System.out.println("Vous avez subit :" + (degats - classe.getArmure()) + "dégats." );
			System.out.println("Points de vie restants : " + _hp);
		}
		else 
		{
			System.out.println("Vous n'avez subit aucun dégat !");
			System.out.println("Points de vie restants : " + _hp);
		}
	}
}
