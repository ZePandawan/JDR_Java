package Races;

public enum Race implements RaceIntf {
	Elfe("les Elfes sont des créatures immortelles. D'apparence mince et élancée, ces créatures possèdent une agilité et une discrétion non négligeable."),
	Ent("les Ents sont des créatures de la nature. On pourrait facilement les confondre avec un arbre quelconque, mais sous cette écorce se cache un être intelligent et sensible."),
	Gobelin("les Gobelins sont des créatures à peine plus grandes qu'un enfant. Mais leur nature vorace et destructice peut faire d'eux des ennemis redoutables."),
	Hobbit("les Hobbits sont des créatures de petite taille, préférant le confort de leur maison, cependant certaines histoires racontent les aventures d'un groupe de Hobbits."),
	Humain("les humains sont la race la plus présente sur ce nouveau continent. Les humains sont polyvalent dans tous les domaines connus à ce jour."),
	Maiar("les Maiar sont des esprits primordiaux. Ils ne possèdent pas de forme fixe. Il n'en n'existe pas plus que 5 connus dans la terre du millieu... Néanmoins, serrez-vous le 6ème ?!"),
	Nain("les nains sont des individus de petites tailles mais pouvant être très robuste ! Leur fort caractère et leur franc parler font d'eux une communauté particulière."),
	Orque("les orques sont des créatures maléfiques, conçus uniquement pour partir en guerre et détruire les autres races. Leur forte carrure et leur rage font d'eux des ennemis redoutables");
	
	protected String description;
	
	Race(String Description) {
		description = Description;
	}
	
	public String getDescription()
	{
		return description;
	}
}