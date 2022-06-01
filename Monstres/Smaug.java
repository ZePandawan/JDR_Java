package Monstres;

public class Smaug extends  Monstre{
    public Smaug() {
        Sante = 150;
        _type = "Boss";
        Exp = 100 + random.nextInt(101);
        Attaques.add("Souffle du dragon");
        Attaques.add("Roule un dragon");
        Attaques.add("Fume un dragon");
        Attaques.add("Charge un dragon");
    }
}
