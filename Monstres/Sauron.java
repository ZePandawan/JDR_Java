package Monstres;

import java.util.Random;

public class Sauron extends  Monstre{
    public Sauron() {
        Sante = 500;
        _type = "Boss";
        Random random = new Random();
        Exp = 200 + random.nextInt(201);
        Attaques.add("Pouvoir de l'anneau");
        Attaques.add("Magie noire");
    }
}