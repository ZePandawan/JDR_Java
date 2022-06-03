package Commandes;

public interface CommandesIntf {
	
	/**
	 * Permet de r�cup�rer un entier saisit par entr�e clavier par l'utilisateur.
	 * @param choix : String qui s'affichera avant la saisie de l'utilisateur.
	 * @param choixUtilisateur : Nombre de possibilit�s que poss�de l'utilisateur.
	 * @return un INT correspondant � la valeur rentr�e par l'utilisateur.
	 */
	public int LectureInt(String choix, int choixUtilisateur);
	
	/*
	 *Permet de nettoyer l'affichage de la console afin de rentre l'interface plus visible et ordonn�.
	 */
	public  void NettoyerConsole();
	
	/**
	 * Permet d'afficher dans la console un nombre entier "n" de charact�re - permettant de s�parer des diff�rents affichages.
	 * @param n : un INT repr�sentant le nombre de charact�re � afficher.
	 */
	public void AfficherSeparateur(int n);
	
	/**
	 * Permet d'afficher un texte entre s�parateur. 
	 * @param nombre : Un entier repr�sentant le nombre de s�parateur que l'on veut afficher.
	 * @param texte : Un String repr�sentant le texte que l'on veut afficher � l'utilisateur.
	 */
	public void AfficherEntete(int nombre, String texte);
	
	/**
	 * Permet d'effectuer une pause dans le programme. (Attend que l'utilisateur entre un charact�re).
	 */
	public void StopProgramme();
	
	/**
	 * Permet de debugger l'arr�t du programme (certains "StopProgramme" ne sont pas lu dans le programme).
	 */
	public void DebugScanner();
}
