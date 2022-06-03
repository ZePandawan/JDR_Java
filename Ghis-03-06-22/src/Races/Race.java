package Races;

public enum Race {
	Elfe("les Elfes sont des cr�atures immortelles. D'apparence mince et �lanc�e, ces cr�atures poss�dent une agilit� et une discr�tion non n�gligeable."),
	Ent("les Ents sont des cr�atures de la nature. On pourrait facilement les confondre avec un arbre quelconque, mais sous cette �corce se cache un �tre intelligent et sensible."),
	Gobelin("les Gobelins sont des cr�atures � peine plus grandes qu'un enfant. Mais leur nature vorace et destructice peut faire d'eux des ennemis redoutables."),
	Hobbit("les Hobbits sont des cr�atures de petite taille, pr�f�rant le confort de leur maison, cependant certaines histoires racontent les aventures d'un groupe de Hobbits."),
	Humain("les humains sont la race la plus pr�sente sur ce nouveau continent. Les humains sont polyvalent dans tous les domaines connus � ce jour."),
	Maiar("les Maiar sont des esprits primordiaux. Ils ne poss�dent pas de forme fixe. Il n'en n'existe pas plus que 5 connus dans la terre du millieu... N�anmoins, serrez-vous le 6�me ?!"),
	Nain("les nains sont des individus de petites tailles mais pouvant �tre tr�s robuste ! Leur fort caract�re et leur franc parler font d'eux une communaut� particuli�re."),
	Orque("les orques sont des cr�atures mal�fiques, con�us uniquement pour partir en guerre et d�truire les autres races. Leur forte carrure et leur rage font d'eux des ennemis redoutables");

	protected String _description;
	
	Race(String description) {
		_description = description;
	}
	
	public String getDescription()
	{
		return _description;
	}
}
