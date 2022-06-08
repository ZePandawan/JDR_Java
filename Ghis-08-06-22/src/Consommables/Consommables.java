package Consommables;


public enum Consommables implements ConsommablesIntf{
	// TODO Auto-generated constructor stub
	PetitePotionMana(2,0,2,"Petite potion de Mana"),
	MoyennePotionMana(5,0,5,"Moyenne potion de Mana"),
	GrandePotionMana(10,0,10,"Grande potion de Mana"),
	PetitePotionSante(0,2,2,"Petite potion de Santé"),
	MoyennePotionSante(0,5,5,"Moyenne potion de Santé"),
	GrandePotionSante(0,10,10,"Grande potion de Santé"),
	PotionMax(10,10,18,"Potion Max"),
	Steak(0,3,3,"Steak"),
	Pomme(0,1,1,"Pomme"),
	Biere(0,2,3,"Bière"),
	Saucisse(0,7,7,"Saucisse"),
	Patate(0,4,4,"Patate"),
	Carotte(2,2,4,"Carotte");
	
	protected int mana;
	protected int vie;
	protected int prix;
	protected String nom;
		
	Consommables(int Mana, int Vie, int Prix, String Nom)
	{
		mana = Mana;
		vie = Vie;
		prix = Prix;
		nom = Nom;
	}
		
	public int getMana() {
		return mana;
	}
	
	public int getVie() {
		return vie;
	}
		
	public int getPrix() {
		return prix;
	}
		
	public String getNom() {
		return nom;
	}	
}