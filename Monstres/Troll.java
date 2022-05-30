package Monstres;

public class Troll extends Monstre{
    public Troll() {
        Sante = 50;
        Degats = 3;
        Description = "Les Trolls sont une très grande et monstrueuse race humanoïde habitant la Terre du Milieu. Ils sont très forts et d'une solide constitution.";
        Type = "Physique";
        Exp = 20 + random.nextInt(31);
    }
}
