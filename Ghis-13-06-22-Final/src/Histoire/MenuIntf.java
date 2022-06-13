package Histoire;

public interface MenuIntf {

	/**
	 * Menu Principal du jeu, permet de rediriger l'utilisateur vers les différents choix possibles
	 */
	public void menuPrincipal();
	
	/**
	 * Démarre une nouvelle partie
	 */
	public void nouvellePartie();
	
	/**
	 * Affiche les règles du jeu
	 */
	public void afficher_Regle();
	
	/**
	 * Démare le mode Libre
	 */
	public void modeLibre();

}
