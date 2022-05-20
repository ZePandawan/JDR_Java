package Monstres;

public class Araignee extends Monstre {
    public Araignee() {
        Sante = 15;
        Degats = 2;
        Description = "Une araignée, il iti koum ça dans la sal dé bain sal dé bain";
        _type = "Physique";
        Attaques.add("Morsure");
        Attaques.add("Poison");
    }
}
