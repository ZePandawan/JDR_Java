package Equipements;

public enum Equipement implements EquipementIntf{
	
	Arclong(3,3,0,6,"Arc long"),
	ArmureDeCuir(0,0,3,5,"Armure de cuir"),
	ArmureDePlaque(0,0,5,10,"Armure de plaque"),
	ArmureDeSoie(0,0,1,3,"Armure de soie"),
	BatonDeMage(1,5,0,3,"Baton de magicien"),
	CotteDeMaille(0,0,5,7,"Cotte de maille"),
	CoupDePoing(2,5,0,0,"Poing"),
	Dague(3,3,0,6,"Dague"),
	EpeeADeuxMains(5,4,0,9,"Épée à deux mains"),
	EpeeCourte(3,2,0,7,"Épée courte"),
	EpeeLongue(4,3,0,8,"Épée longue"),
	Gourdin(3,1,0,2,"Gourdin"),
	HacheDouble(5,3,0,8,"Hache à deux mains"),
	Lance(4,5,0,6,"Lance"),
	Luth(1,6,0,3,"Luth");

	protected int degatP;
	protected int degatM;
	protected int armure;
	protected int prix;
	protected String nom;
	
	Equipement(int DegatP, int DegatM, int Armure, int Prix, String Nom) {
		degatP = DegatP;
		degatM = DegatM;
		armure = Armure;
		prix = Prix;
		nom = Nom;
	}
	
	public int getDegatP()
	{
		return degatP;
	}
	
	public int getDegatM()
	{
		return degatM;
	}
	
	public int getArmure()
	{
		return armure;
	}
	
	public int getPrix()
	{
		return prix;
	}
	
	public String getNom()
	{
		return nom;
	}
}