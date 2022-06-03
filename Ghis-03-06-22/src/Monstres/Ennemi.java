package Monstres;
import Joueur.Personnage;


public enum Ennemi implements EnnemiIntf {
	
	Aragorn("Aragorn",1,0,10,"Physique", "Pas besoin de description pour ce personnage."),
	Araignee("Araignee",10,1,10 + random.nextInt(1,11), "Physique", "Créature de taille moyenne possédant une forte carapace et huits pattes."),
	Balrog("Balrog",30,4,100 + random.nextInt(1,101), "Boss", "Le Balrog est une puissante créature démoniaque, un esprit du feu appartenant à la race des Maiar mais corrompu par le mal."),
	Brute("Brute",15,2,15 + random.nextInt(1,21), "Physique", "Brute rencontrée dans les bars des différentes villes."),
	Chenille("Chenille",1,200,1000 + random.nextInt(1,1001), "Neutre", "Personne ne sait d'où vient cette créature ancestrale... Peut être est-elle une création de Dieu en personne ?"),
	Gobelin("Gobelin",15,2,15 + random.nextInt(1,21), "Magique", "Le gobelin est une créature légendaire magique, anthropomorphe et de petite taille."),
	Gollum("Gollum",25,3,20 + random.nextInt(1,31), "Physique", "Créature à l'apparence étrange, on raconte qu'autrefois il était un hobbit. Pour autant aucune trace d'humanité n'est présente dans cette créature."),
	Orque("Orque",15,2,15 + random.nextInt(1,21), "Physique", "Les orques sont des créatures puissantes et massives, servant Sauron avec leur vie." ),
	RoiSorcier("Roi Sorcier",30,4,100 + random.nextInt(1,101), "Boss", "Chef des Nazgûl, ancien roi et grand sorcier, il est le plus puissant et le plus terrible des Spectres de l'Anneau servant Sauron."),
	Sauron("Sauron",40,5,200 + random.nextInt(1,151), "Boss", "Sauron était à l'origine un Maiar et un suivant d'Aulë dieu de la terre. Mais il fut très vite corrompu par Melkor et devint le plus fidèle et le plus puissant de ses lieutenants."),
	Smaug("Smaug",30,4,100 + random.nextInt(1,101), "Boss", "Smaug dit \"le Doré\" est un dragon de la progéniture des dragons de Morgoth, faites attention à son souffle ardent."),
	Troll("Troll",25,3, 20 + random.nextInt(1,31), "Physique", "Les Trolls sont une très grande et monstrueuse race humanoïde habitant la Terre du Milieu. Ils sont très forts et d'une solide constitution."),
	Warg("Warg",15,2,15 + random.nextInt(1,21), "Physique", "Les Wargs sont des créatures féroces, musclées, rapide et agiles... Ressemblant en quelque sorte a un loup.");

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
	
	public void setSante(int sante)
	{
		Sante = sante;
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
	     		  "L'ennemi a subit : " + degats + " dégats. \n"
				+ "Points de vie restants : " + Math.max(0,Sante) );
	}
    
    public void SoinMonstre(Ennemi ennemi)
    {
    	switch(ennemi.getNom())
    	{
    		case "Aragorn":
    		{
    			Ennemi.Aragorn.setSante(1);
    			break;
    		}
    		case "Araignee":
    		{
    			Ennemi.Araignee.setSante(10);
    			break;
    		}
    		case "Balrog":
    		{
    			Ennemi.Balrog.setSante(30);
    			break;
    		}
    		case "Brute":
    		{
    			Ennemi.Brute.setSante(15);
    			break;
    		}
    		case "Chenille":
    		{
    			Ennemi.Chenille.setSante(1);
    			break;
    		}
    		case "Gobelin":
    		{
    			Ennemi.Gobelin.setSante(15);
    			break;
    		}
    		case "Gollum":
    		{
    			Ennemi.Gollum.setSante(25);
    			break;
    		}
    		case "Orque":
    		{
    			Ennemi.Orque.setSante(15);
    			break;
    		}
    		case "Roi Sorcier":
    		{
    			Ennemi.RoiSorcier.setSante(30);
    			break;
    		}
    		case "Sauron":
    		{
    			Ennemi.Sauron.setSante(40);
    			break;
    		}
    		case "Smaug":
    		{
    			Ennemi.Smaug.setSante(30);
    			break;
    		}
    		case "Troll":
    		{
    			Ennemi.Troll.setSante(25);
    			break;
    		}
    		case "Warg":
    		{
    			Ennemi.Warg.setSante(15);
    			break;
    		}
    	}
    	
    }
    
}
