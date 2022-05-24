package Monstres;

import java.util.Random;

public class Loup extends Monstre {

    public Loup() {
        Sante =15;
        _type = "Physique";
        Random random = new Random();
        Exp = 10 + random.nextInt(11);
    Attaques.add("Coup de crocs");
    Attaques.add("Hurlement");
    }
}
