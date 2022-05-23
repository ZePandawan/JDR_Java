package Monstres;

public class Gobelin extends Monstre {

    public Gobelin() {
        Sante = 30;
        _type = "Magique";
        
        Attaques.add("Tir de Flèche");
        Attaques.add("Coup de poignard");
        
    }
}