package Monstres;
import Joueur.Personnage;


public enum Ennemi implements EnnemiIntf {
	
	Aragorn("Aragorn",1,0,10,"Physique", "Pas besoin de description pour ce personnage."),
	Araignee("Araignee",10,1,10 + random.nextInt(1,11), "Physique", "Cr�ature de taille moyenne poss�dant une forte carapace et huits pattes."),
	Balrog("Balrog",30,4,100 + random.nextInt(1,101), "Boss", "Le Balrog est une puissante cr�ature d�moniaque, un esprit du feu appartenant � la race des Maiar mais corrompu par le mal."),
	Brute("Brute",15,2,15 + random.nextInt(1,21), "Physique", "Brute rencontr�e dans les bars des diff�rentes villes."),
	Chenille("Chenille",1,200,1000 + random.nextInt(1,1001), "Neutre", "Personne ne sait d'o� vient cette cr�ature ancestrale... Peut �tre est-elle une cr�ation de Dieu en personne ?"),
	Gobelin("Gobelin",15,2,15 + random.nextInt(1,21), "Magique", "Le gobelin est une cr�ature l�gendaire magique, anthropomorphe et de petite taille."),
	Gollum("Gollum",25,3,20 + random.nextInt(1,31), "Physique", "Cr�ature � l'apparence �trange, on raconte qu'autrefois il �tait un hobbit. Pour autant aucune trace d'humanit� n'est pr�sente dans cette cr�ature."),
	Orque("Orque",15,2,15 + random.nextInt(1,21), "Physique", "Les orques sont des cr�atures puissantes et massives, servant Sauron avec leur vie." ),
	RoiSorcier("Roi Sorcier",30,4,100 + random.nextInt(1,101), "Boss", "Chef des Nazg�l, ancien roi et grand sorcier, il est le plus puissant et le plus terrible des Spectres de l'Anneau servant Sauron."),
	Sauron("Sauron",40,5,200 + random.nextInt(1,151), "Boss", "Sauron �tait � l'origine un Maiar et un suivant d'Aul� dieu de la terre. Mais il fut tr�s vite corrompu par Melkor et devint le plus fid�le et le plus puissant de ses lieutenants."),
	Smaug("Smaug",30,4,100 + random.nextInt(1,101), "Boss", "Smaug dit \"le Dor�\" est un dragon de la prog�niture des dragons de Morgoth, faites attention � son souffle ardent."),
	Troll("Troll",25,3, 20 + random.nextInt(1,31), "Physique", "Les Trolls sont une tr�s grande et monstrueuse race humano�de habitant la Terre du Milieu. Ils sont tr�s forts et d'une solide constitution."),
	Warg("Warg",15,2,15 + random.nextInt(1,21), "Physique", "Les Wargs sont des cr�atures f�roces, muscl�es, rapide et agiles... Ressemblant en quelque sorte a un loup.");

	protected String Nom;
	protected int Sante;
	protected int Degats;
	protected int Exp;
    protected String Type;
    protected String Description;
    
	Ennemi(String nom, int sante, int degats, int exp, String type, String description) {
		
		Nom = nom;
		Sante = sante;
		Degats = degats;
		Exp = exp;
		Type = type;
		Description = description;
	}
	
	public String getNom()
	{
		return Nom;
	}
	
	public int getSante() 
	{
		return Sante;
	}
	
	public int getDegats() 
	{
		return Degats;
	}
	
	public int getExp()
	{ 
    	return Exp;
    }

	public String getType()
	{
		return Type;
	}
	 
	public String getDescription() 
    {
        return this.Description;
    }   
	    
    public void Attaque(Personnage cible) 
    {
    	cible.Defense(getDegats());
    }
	    
    public void Defend(int degats) 
    {
		Sante -= degats;
				
		Commande.AfficherEntete(30, 
	     		  "L'ennemi a subit : " + degats + " d�gats. \n"
				+ "Points de vie restants : " + Math.max(0,Sante) );
	}
    
}
