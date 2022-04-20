package Competences;

public class TestCompetence {
    public static void main(String[] args) {
        Competence competence = new Morsure();
        System.out.println(competence.getDegat());
        System.out.println(competence.getDescription());
        System.out.println(competence.getNom());
    }
}
