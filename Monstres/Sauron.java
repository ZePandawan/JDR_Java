package Monstres;

public class Sauron extends  Monstre{
    public Sauron() {
        Sante = 500;
        Degats = 4;
        Description = "Sauron était à l'origine un Maiar et un suivant d'Aulë dieu de la terre. Mais il fut très vite corrompu par Melkor et devint le plus fidèle et le plus puissant de ses lieutenants.";
        Type = "Boss";
        Exp = 200 + random.nextInt(201);
    }
}
