package Monstres;

public class Sauron extends  Monstre{
    public Sauron() {
        Sante = 500;
        Degats = 4;
        Description = "Sauron �tait � l'origine un Maiar et un suivant d'Aul� dieu de la terre. Mais il fut tr�s vite corrompu par Melkor et devint le plus fid�le et le plus puissant de ses lieutenants.";
        Type = "Boss";
        Exp = 200 + random.nextInt(201);
    }
}
