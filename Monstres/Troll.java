package Monstres;

public class Troll extends Monstre{
    public Troll() {
        Sante = 50;
        _type = "Physique";
        Exp = 20 + random.nextInt(31);
        Attaques.add("Frappe de massue");
    }
}
