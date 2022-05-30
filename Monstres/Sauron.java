package Monstres;

public class Sauron extends  Monstre{
    public Sauron() {
        Sante = 500;
        _type = "Boss";
        Exp = 200 + random.nextInt(201);
        Attaques.add("Pouvoir de l'anneau");
        Attaques.add("Magie noire");
    }
}
