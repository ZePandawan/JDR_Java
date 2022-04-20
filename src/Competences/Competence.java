package Competences;

public class Competence {
    protected String Nom = "";
    protected String Description = "";
    protected int Degat = 0;

    public String getDescription() {
        return this.Description;
    }
    public String getNom() {
        return this.Nom;
    }
    public int getDegat() {
        return this.Degat;
    }
}
