package Monstres;

import java.util.ArrayList;

public class Monstre {
    protected int Sante = 0;

    protected String Description = "";

    protected ArrayList<String> Attaques = new ArrayList<String>();


    public int getSante() {
        return this.Sante;
    }

    public ArrayList<String> getAttaques(){
        return this.Attaques;
    }

    public String getDescription() {
        return this.Description;
    }
}
