package Histoire;

public class Regles extends Histoire {
	
	public void Afficher_Regles()
	{
		Commande.AfficherEntete(122,
				  "                                                     LISTE DES REGLES                                                     \n\n"
				+ "Bienvenue dans le Seigneur des Anneaux : La qu�te de l'anneau. Ce jeu est bas� sur le principe d'un jeu de r�le / RPG.    \n"
				+ "C'est � dire que chacune de vos actions (Attaque, Intimidation etc...) se verront accompagn�e d'un jet de d� � 100 faces. \n"
				+ "Si le r�sultat du d� est inf�rieur ou �gale � la comp�tence sur laquelle se base l'action, celle-ci est r�ussi.           \n"
				+ "A l'inverse, si le r�sultat du d� est sup�rieur � votre stat, votre action se verra �tre un �chec.                        \n\n"
				+ "Vous disposez de 2 mode de jeu. Mode Histoire, qui vous plongera dans la qu�te de l'anneau.                               \n"
				+ "L'autre, Mode Libre, vous permettra de voyager sur la carte et d'affronter divers ennemis.                                  \n\n"
				+ "Le mode Histoire est recommand� pour tout nouveau joueur afin de bien comprendre le syst�me qu'itilise ce jeu.            \n");
		
		Commande.StopProgramme();
	}
}
