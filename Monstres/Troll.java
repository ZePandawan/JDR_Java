package Monstres;

import java.util.Random;

public class Troll extends Monstre{
    public Troll() {
        Sante = 50;
        _type = "Physique";
        Random random = new Random();
        Exp = 20 + random.nextInt(31);
        Attaques.add("Frappe de massue");
    }
}
