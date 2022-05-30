package Monstres;

public class Chenille extends Monstre {
    public Chenille() {
        Sante = 1000;
        Degats = 200;
        Description = "Personne ne sait d'où vient cette créature ancestrale... Peut être est-elle une création de Dieu en personne ?";
        Type = "Dieu";
        Exp = 1000 + random.nextInt(1001);
    }
}