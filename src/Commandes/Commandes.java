package Commandes;

public interface Commandes {

	//Commandes de la partie "Interface"
	
	/*
	 *Permet de récupérer le choix fais par l'utilisateur
	 * Comme argument on informera la chaine de caractère correspondante au choix, ainsi qu'une valeur entière du nombre de choix possible.
	 */
	public int LectureInt(String choix, int choixUtilisateur);
	
	
	/*
	 *Permet de nettoyer l'affichage de la console afin de rentre l'interface plus visible et ordonné.
	 */
	public  void NettoyerConsole();
	
	
	/*
	 *Permet d'afficher des séparateurs permettant de donner un rendu comme celui ci dessous :
	 * --------------------     <--- Utilisation de la méthode AfficherSéparateur() avec n = 20
	 * RPG TLOTR
	 * --------------------
	 */
	public void AfficherSeparateur(int n);
	
	/*
	 * Permet d'afficher un entête, avec un titre
	 */
	public void AfficherEntete(String titre);
	
	/*
	 * Permet au programme de faire une pause dans l'histoire, laissant à l'utilisateur le temps de réfléchir ou autre.
	 */
	public void StopProgramme();
}
