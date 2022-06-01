package Monstres;

public class Roisorcier extends Monstre {

    public Roisorcier() {
        Sante = 150;
        _type = "Boss";
        Exp =  100 + random.nextInt(101);
        Attaques.add("Lame de morgul");

    }
}
