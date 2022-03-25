package Classes;

import java.util.ArrayList;

public class Classe {
	protected int Physique = 0;
    protected int Social = 0;
    protected int Mental = 0;
	protected int Sante = 0;
	protected int Mana = 0;
	
	protected String Description = "";
	
	protected ArrayList<String> Attaques = new ArrayList<String>();
	
	public int getPhysique() {
		return this.Physique;
	}
	
	public int getSocial() {
		return this.Social;
	}
	
	public int getMental() {
		return this.Mental;
	}
	
	public int getSante() {
		return this.Sante;
	}
	
	public int getMana() {
		return this.Mana;
	}
	
	public ArrayList<String> getAttaques(){
		return this.Attaques;
	}
	
	public String getDescription() {
		return this.Description;
	}
}
