package Monstres;

public class Brute extends Monstre {
	public Brute()
	{
		Sante = 10;
        Degats = 2;
        Description = "Brute rencontrée dans les bars des différentes villes";
        Exp = 10 + random.nextInt(11);
        Type = "Physique";
	}
}
