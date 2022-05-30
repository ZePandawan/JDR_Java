package Commandes;

public interface CommandesIntf {
	
	/**
	 * Permet de récupérer un entier saisit par entrée clavier par l'utilisateur.
	 * @param choix : String qui s'affichera avant la saisie de l'utilisateur.
	 * @param choixUtilisateur : Nombre de possibilités que possède l'utilisateur.
	 * @return un INT correspondant à la valeur rentrée par l'utilisateur.
	 */
	public int LectureInt(String choix, int choixUtilisateur);
	
	/*
	 *Permet de nettoyer l'affichage de la console afin de rentre l'interface plus visible et ordonné.
	 */
	public  void NettoyerConsole();
	
	/**
	 * Permet d'afficher dans la console un nombre entier "n" de charactère - permettant de séparer des différents affichages.
	 * @param n : un INT représentant le nombre de charactère à afficher.
	 */
	public void AfficherSeparateur(int n);
	
	/**
	 * Permet d'afficher un texte entre séparateur. 
	 * @param nombre : Un entier représentant le nombre de séparateur que l'on veut afficher.
	 * @param texte : Un String représentant le texte que l'on veut afficher à l'utilisateur.
	 */
	public void AfficherEntete(int nombre, String texte);
	
	/**
	 * Permet d'effectuer une pause dans le programme. (Attend que l'utilisateur entre un charactère).
	 */
	public void StopProgramme();
	
	/**
	 * Permet de debugger l'arrêt du programme (certains "StopProgramme" ne sont pas lu dans le programme).
	 */
	public void DebugScanner();
}
