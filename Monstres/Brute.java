package Monstres;

public class Brute extends Monstre {
	public Brute()
	{
		Sante = 10;
        Degats = 2;
        Description = "Brute rencontr�e dans les bars des diff�rentes villes";
        Exp = 10 + random.nextInt(11);
        Type = "Physique";
	}
}
