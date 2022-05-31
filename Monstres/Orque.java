package Monstres;

public class Orque extends Monstre {

    public Orque() {
        Sante = 40;
        Degats = 3;
        Description = "Les orques sont des créatures puissantes et massives, servant Sauron avec leur vie.";
        Type = "Physique";
        Exp = 20 + random.nextInt(31);
    }
}