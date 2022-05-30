package Commandes;

public interface Commandes {

	//Commandes de la partie "Interface"
	
	/*
	 *Permet de r�cup�rer le choix fais par l'utilisateur
	 * Comme argument on informera la chaine de caract�re correspondante au choix, ainsi qu'une valeur enti�re du nombre de choix possible.
	 */
	public int LectureInt(String choix, int choixUtilisateur);
	
	
	/*
	 *Permet de nettoyer l'affichage de la console afin de rentre l'interface plus visible et ordonn�.
	 */
	public  void NettoyerConsole();
	
	
	/*
	 *Permet d'afficher des s�parateurs permettant de donner un rendu comme celui ci dessous :
	 * --------------------     <--- Utilisation de la m�thode AfficherS�parateur() avec n = 20
	 * RPG TLOTR
	 * --------------------
	 */
	public void AfficherSeparateur(int n);
	
	/*
	 * Permet d'afficher un ent�te, avec un titre
	 */
	public void AfficherEntete(String titre);
	
	/*
	 * Permet au programme de faire une pause dans l'histoire, laissant � l'utilisateur le temps de r�fl�chir ou autre.
	 */
	public void StopProgramme();
}
