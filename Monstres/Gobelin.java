package Monstres;

public class Gobelin extends Monstre {

    public Gobelin() {
        Sante = 30;
        Degats = 2;
        Description = "Le gobelin est une cr�ature l�gendaire magique, anthropomorphe et de petite taille";
        Type = "Magique";
        Exp = 15 + random.nextInt(21);
        
    }
}