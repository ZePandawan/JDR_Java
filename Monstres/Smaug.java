package Monstres;

public class Smaug extends  Monstre{
    public Smaug() {
        Sante = 150;
        Degats = 4;
        Description = "Smaug dit \"le Doré\" est un dragon de la progéniture des dragons de Morgoth, faites attention à son souffle ardent";
        Type = "Boss";
        Exp = 100 + random.nextInt(101);
    }
}
