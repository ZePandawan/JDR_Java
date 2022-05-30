package Monstres;

public class Warg extends Monstre {

    public Warg() {
        Sante = 15;
        Degats = 2;
        Description = "Les Wargs sont des créatures féroces, musclées, rapide et agiles... Ressemblant en quelque sorte a un loup";
        Type = "Physique";
        Exp = 10 + random.nextInt(11);
    }
}
