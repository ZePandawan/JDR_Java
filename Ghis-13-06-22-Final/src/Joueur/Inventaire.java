package Joueur;

import java.util.ArrayList;

import Commandes.Commandes;
import Commandes.Jeu;
import Consommables.Consommables;
import Monstres.Ennemi;

public class Inventaire implements InventaireIntf{
	
	protected Commandes commande = new Commandes();
	protected ArrayList<Consommables> _Inventory = new ArrayList<Consommables>();
	
	public Inventaire() {
		_Inventory.add(Consommables.MoyennePotionMana);
		_Inventory.add(Consommables.MoyennePotionSante);
	}
	
	public void ajouter_inventaire(Consommables item, Joueur joueur) {
		ArrayList<Consommables> Inventaire_Temp = new ArrayList<Consommables>(); 
		Boolean isFull = verif_inventaire_plein(joueur);
		if(isFull == false) {
			for(Consommables objet : joueur.getInventaire().getObjets())
			{
				Inventaire_Temp.add(objet);
			}
			Inventaire_Temp.add(item);
			
			joueur.getInventaire().setObjets(Inventaire_Temp);
			joueur.setInventaire(this);
		}
		else
		{
			System.out.println("Votre Inventaire est déjà plein !");
		}
	}
	
	public Boolean verif_inventaire_plein(Joueur joueur) {
		if(joueur.getInventaire().getObjets().size() == 10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void supprimer_inventaire(Consommables item, Joueur joueur) {
		int index = 0;
		ArrayList<Consommables> Inventaire_Temp = new ArrayList<Consommables>(); 
		
		Inventaire_Temp = joueur.getInventaire().getObjets();
		
		for(Consommables objets : joueur.getInventaire().getObjets()) {
			if(objets == item) {
				Inventaire_Temp.remove(index);
				break;
			}
			index += 1;
		}
		joueur.getInventaire().setObjets(Inventaire_Temp);
		joueur.setInventaire(this);
	}
	
	public void utiliser_objet(Joueur joueur, Ennemi ennemi, Jeu jeu)
	{
		int index = 1;
		
		commande.afficherSeparateur(60);
		System.out.println("Inventaire : ");
		for(Consommables objets : joueur.getInventaire().getObjets()) {
			System.out.println("[" + index + "] : " + objets.getNom());
			index ++;
		}
		System.out.println("[" + (index) + "] : Sortir");
		commande.afficherSeparateur(60);
		int choix = commande.lectureInt("->", (index));
		
		if(choix == (index))
		{
			jeu.menuCombat(joueur, ennemi);
		}
		else if(choix == (index-1))
		{
			utiliser_consommable(joueur, joueur.getInventaire().getObjets().get(index-2));
		}
		else if(choix == (index-2))
		{
			utiliser_consommable(joueur, joueur.getInventaire().getObjets().get(index-3));
		}
		else if(choix == (index-3))
		{
			utiliser_consommable(joueur, joueur.getInventaire().getObjets().get(index-4));
		}
		else if(choix == (index-4))
		{
			utiliser_consommable(joueur, joueur.getInventaire().getObjets().get(index-5));
		}
		else if(choix == (index-5))
		{
			utiliser_consommable(joueur, joueur.getInventaire().getObjets().get(index-6));
		}
		else if(choix == (index-6))
		{
			utiliser_consommable(joueur, joueur.getInventaire().getObjets().get(index-7));
		}
		else if(choix == (index-7))
		{
			utiliser_consommable(joueur, joueur.getInventaire().getObjets().get(index-8));
		}
		else if(choix == (index-8))
		{
			utiliser_consommable(joueur, joueur.getInventaire().getObjets().get(index-9));
		}
		else if(choix == (index-9))
		{
			utiliser_consommable(joueur, joueur.getInventaire().getObjets().get(index-10));
		}
		else if(choix == (index-10))
		{
			utiliser_consommable(joueur, joueur.getInventaire().getObjets().get(index-11));
		}
	}

	public void afficher_inventaire(Joueur joueur) {
		commande.afficherSeparateur(60);
		System.out.println("Inventaire :");
		for(Consommables objets : joueur.getInventaire().getObjets()) {
			System.out.println("   "  + objets.getNom());
		}
		commande.afficherSeparateur(60);
	}
	
	public void vider_inventaire(Joueur joueur) {
		ArrayList<Consommables> Inventaire_Temp = new ArrayList<Consommables>(); 
		
		joueur.getInventaire().setObjets(Inventaire_Temp);
		joueur.setInventaire(this);
		System.out.println(joueur.getInventaire().getObjets());
	}
	
	public void utiliser_consommable(Joueur joueur, Consommables item)
	{
		joueur.setHp(joueur.getHp()+item.getVie());
		joueur.setMana(item.getMana());
		joueur.getInventaire().supprimer_inventaire(item, joueur);
	}
	
	public ArrayList<Consommables> getObjets()
	{
		return _Inventory;
	}
	
	public void setObjets(ArrayList<Consommables> objets)
	{
		_Inventory = objets;
	}
}