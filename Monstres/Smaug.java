package Monstres;

public class Smaug extends  Monstre{
    public Smaug() {
        Sante = 150;
        Degats = 4;
        Description = "Smaug dit \"le Dor�\" est un dragon de la prog�niture des dragons de Morgoth, faites attention � son souffle ardent";
        Type = "Boss";
        Exp = 100 + random.nextInt(101);
    }
}
