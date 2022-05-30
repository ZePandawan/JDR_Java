package Monstres;

public class Orque extends Monstre {

    public Orque() {

        Sante = 40;
        _type = "Physique";
        Exp = 20 + random.nextInt(31);
        Attaques.add("Coup d'épée");
        Attaques.add("Tir de flèches");
    }
}