package Joueur;
import Monstres.Monstre;
import Joueur.Joueur;

public class Experience {
    int xp = 0;
    int level = 1;

    public void xp() {
        if(xp >= level*100+100) {
            level += 1;
            xp += -100;
            System.out.println("passage de niveau");
        }
        else {
            xp += 10;
            System.out.println("gain de "+xp+"xp");
        }
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }
}