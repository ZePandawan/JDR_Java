package Monstres;

public class Balrog extends Monstre {
    public Balrog() {
        Sante = 100;
        Degats = 4;
        Description = "Le Balrog est une puissante créature démoniaque, un esprit du feu appartenant à la race des Maiar mais corrompu par le mal";
        Type = "Magique";
        Exp = 100 + random.nextInt(101);
    }
}