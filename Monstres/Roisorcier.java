package Monstres;

public class Roisorcier extends Monstre {

    public Roisorcier() {
        Sante = 150;
        Degats = 4;
        Description = "Chef des Nazgûl, ancien roi et grand sorcier, il est le plus puissant et le plus terrible des Spectres de l'Anneau servant Sauron.";
        Type = "Boss";
        Exp =  100 + random.nextInt(101);
    }
}
