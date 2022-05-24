package Monstres;

import java.util.Random;

public class Balrog extends Monstre {
    public Balrog() {
        Sante = 100;
        _type = "Magique";
        Random random = new Random();
        Exp = 100 + random.nextInt(101);
        Attaques.add("Coup de fouet enflamée");
        Attaques.add("Brulure");
    }
}