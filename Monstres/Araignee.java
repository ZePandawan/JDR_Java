package Monstres;

public class Araignee extends Monstre {
    public Araignee() {
        Sante = 15;
        Degats = 1;
        Description = "Une araignée, il iti koum ça dans la sal dé bain sal dé bain";
        Exp = 10 + random.nextInt(11);
        Type = "Physique";
    }
}
