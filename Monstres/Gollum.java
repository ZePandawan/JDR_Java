package Monstres;

public class Gollum extends Monstre {

    public Gollum() {
        Sante = 35;
        Degats = 3;
        Description = "Créature à l'apparence étrange, on raconte qu'autrefois il était un hobbit. Pour autant aucune trace d'humanité n'est présente dans cette créature";
        Type = "Physique()";
        Exp = 15 + random.nextInt(26);
    }
}
