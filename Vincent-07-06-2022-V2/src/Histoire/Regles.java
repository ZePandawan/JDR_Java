package Histoire;

public class Regles extends Histoire {
	
	public void afficher_Regles()
	{
		commande.afficherEntete(122,
				  "                                                     LISTE DES REGLES                                                     \n\n"
				+ "Bienvenue dans le Seigneur des Anneaux : La quête de l'anneau. Ce jeu est basé sur le principe d'un jeu de rôle / RPG.    \n"
				+ "C'est à dire que chacune de vos actions (Attaque, Intimidation etc...) se verront accompagnée d'un jet de dé à 100 faces. \n"
				+ "Si le résultat du dé est inférieur ou égale à la compétence sur laquelle se base l'action, celle-ci est réussi.           \n"
				+ "A l'inverse, si le résultat du dé est supérieur à votre stat, votre action se verra être un échec.                        \n\n"
				+ "Vous disposez de 2 mode de jeu. Mode Histoire, qui vous plongera dans la quête de l'anneau.                               \n"
				+ "L'autre, Mode Libre, vous permettra de voyager sur la carte et d'affronter divers ennemis.                                  \n\n"
				+ "Le mode Histoire est recommandé pour tout nouveau joueur afin de bien comprendre le système qu'itilise ce jeu.            \n");
		
		commande.stopProgramme();
	}
}