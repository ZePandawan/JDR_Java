package Joueur;

import java.util.ArrayList;

import Classes.Classe;
import Monstres.Monstre;
import Races.Race;

public class Personnage implements JoueurIntf {

	protected String name;
	protected int maxHp, hp, exp, mana;
	protected Race race;
	protected Classe classe;
	
	protected ArrayList<String> Attaques = new ArrayList<String>();
	protected ArrayList<String> Inventaire = new ArrayList<String>();
	
	public Personnage(String name, int maxHp, int exp) {
		this.name = name;
		this.maxHp = maxHp;
		this.exp = exp;
		this.hp = maxHp;
	}	
	
	public int getHp()
	{
		return hp;
	}
	
	public void Attaque(Monstre cible){
		if(classe.getPhysique() >= (int) Math.random()*100) {
			cible.Defend(classe.getArmeDegats() + classe.getClasseDegats());
		}
		else {
			System.out.println("Votre attaque n'a pas aboutit");
		}
		
	}

	@Override
	public void Defense(int degats) {
		if(classe.getArmure() - degats < 0 )
		{
			hp += classe.getArmure() - degats;
			System.out.println("Vous avez subit :" + (degats - classe.getArmure()) + "dégats." );
			System.out.println("Points de vie restants : " + hp);
		}
		else 
		{
			System.out.println("Vous n'avez subit aucun dégat !");
			System.out.println("Points de vie restants : " + hp);
		}
	}
}
