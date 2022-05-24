package Monstres;

import java.util.Random;

public class Roisorcier extends Monstre {

    public Roisorcier() {
        Sante = 150;
        _type = "Boss";
        Random random = new Random();
        Exp =  100 + random.nextInt(101);
        Attaques.add("Lame de morgul");

    }
}
