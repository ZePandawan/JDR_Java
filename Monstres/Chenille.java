package Monstres;

public class Chenille extends Monstre {
    public Chenille() {
        Sante = 1000;
        Degats = 200;
        Description = "Personne ne sait d'o� vient cette cr�ature ancestrale... Peut �tre est-elle une cr�ation de Dieu en personne ?";
        Type = "Dieu";
        Exp = 1000 + random.nextInt(1001);
    }
}