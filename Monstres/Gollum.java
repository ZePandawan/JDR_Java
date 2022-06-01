package Monstres;

import java.util.Random;

public class Gollum extends Monstre {

    public Gollum() {
        Sante = 35;
        _type = "Physique()";
        Random random = new Random();
        Exp = 15 + random.nextInt(26);
        Attaques.add("Etranglement");
        Attaques.add("Griffure");
    }
}
