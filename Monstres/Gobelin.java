package Monstres;

public class Gobelin extends Monstre {

    public Gobelin() {
        Sante = 30;
        _type = "Magique";
        Exp = 15 + random.nextInt(21);
        Attaques.add("Tir de Flèche");
        Attaques.add("Coup de poignard");
        
    }
}