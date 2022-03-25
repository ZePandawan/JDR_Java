package Equipements;

public class Dague extends Equipement {
    public Dague() {
        degat = 1 + (int) (Math.random() * 5);
        armure = 0;
    }
}