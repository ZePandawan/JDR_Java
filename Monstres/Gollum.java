package Monstres;

public class Gollum extends Monstre {

    public Gollum() {
        Sante = 35;
        Degats = 3;
        Description = "Cr�ature � l'apparence �trange, on raconte qu'autrefois il �tait un hobbit. Pour autant aucune trace d'humanit� n'est pr�sente dans cette cr�ature";
        Type = "Physique()";
        Exp = 15 + random.nextInt(26);
    }
}
