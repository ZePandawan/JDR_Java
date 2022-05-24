package Monstres;

import java.util.Random;

public class Orque extends Monstre {

    public Orque() {

        Sante = 40;
        _type = "Physique";
        Random random = new Random();
        Exp = 20 + random.nextInt(31);
        Attaques.add("Coup d'épée");
        Attaques.add("Tir de flèches");
    }
}