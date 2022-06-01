package Monstres;

public class Chenille extends Monstre {
    public Chenille() {
        Sante = 1000;
        _type = "Dieu";
        Exp = 1000 + random.nextInt(1001);
        Attaques.add("Oh regardez");
        Attaques.add("C'est une magnifique");
        Attaques.add("CHENIIIIIIILE");
    }
}