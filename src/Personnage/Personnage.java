package Personnage;

import Classes.*;

public class Personnage {
	
	private int Physique = 0;
	private int Social = 0;
	private int Mental = 0;
	
	private int Sante = 0;
	private int Mana = 0;
	
	public Personnage(int race_choisie) {
			
		switch(race_choisie)
		{
		case 1:
			this.Physique = new Guerrier().getPhysique();
			this.Social = new Guerrier().getSocial();
			this.Mental = new Guerrier().getMental();
			this.Sante = new Guerrier().getSante();
			this.Mana = new Guerrier().getMana();
			break;
			
		case 2:
			this.Physique = new Barde().getPhysique();
			this.Social = new Barde().getSocial();
			this.Mental = new Barde().getMental();
			this.Sante = new Barde().getSante();
			this.Mana = new Barde().getMana();
			break;
			
		case 3:
			this.Physique = new Lutteur().getPhysique();
			this.Social = new Lutteur().getSocial();
			this.Mental = new Lutteur().getMental();
			this.Sante = new Lutteur().getSante();
			this.Mana = new Lutteur().getMana();
			break;
			
		case 4:
			this.Physique = new Roublard().getPhysique();
			this.Social = new Roublard().getSocial();
			this.Mental = new Roublard().getMental();
			this.Sante = new Roublard().getSante();
			this.Mana = new Roublard().getMana();
			break;
			
		case 5:
			this.Physique = new Rodeur().getPhysique();
			this.Social = new Rodeur().getSocial();
			this.Mental = new Rodeur().getMental();
			this.Sante = new Rodeur().getSante();
			this.Mana = new Rodeur().getMana();
			break;
			
		case 6:
			this.Physique = new Mage().getPhysique();
			this.Social = new Mage().getSocial();
			this.Mental = new Mage().getMental();
			this.Sante = new Mage().getSante();
			this.Mana = new Mage().getMana();
			break;
		
		case 7:
			this.Physique = new Archer().getPhysique();
			this.Social = new Archer().getSocial();
			this.Mental = new Archer().getMental();
			this.Sante = new Archer().getSante();
			this.Mana = new Archer().getMana();
			break;
			
		case 8:
			this.Physique = new Barbare().getPhysique();
			this.Social = new Barbare().getSocial();
			this.Mental = new Barbare().getMental();
			this.Sante = new Barbare().getSante();
			this.Mana = new Barbare().getMana();
			break;
			
		
		}
	}
	
	public int getPhysique()
	{
		return Physique;
	}
	
	public int getSocial(){
		return Social;
	}
	
	public int getMental(){
		return Mental;
	}
	
	public int getSante() {
		return Sante;
	}
	
	public int getMana() {
		return Mana;
	}
}
