package Equipements;

public enum Equipement {
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
	
	private int _degatP;
	private int _degatM;
	private int _armure;
	private int _prix;
	private String _nom;

	Equipement(int degatP, int degatM, int armure, int prix, String nom) {
		_degatP = degatP;
		_degatM = degatM;
		_armure = armure;
		_prix = prix;
		_nom = nom;
	}
	
	public int getDegatP()
	{
		return _degatP;
	}
	
	public int getDegatM()
	{
		return _degatM;
	}
	
	public int getArmure()
	{
		return _armure;
	}
	
	public int getPrix()
	{
		return _prix;
	}
	
	public String getNom()
	{
		return _nom;
	}
}
