package Monstres;

public class Troll extends Monstre{
    public Troll() {
        Sante = 50;
        Degats = 3;
        Description = "Les Trolls sont une tr�s grande et monstrueuse race humano�de habitant la Terre du Milieu. Ils sont tr�s forts et d'une solide constitution.";
        Type = "Physique";
        Exp = 20 + random.nextInt(31);
    }
}
