package Inventaire;

import java.util.ArrayList;
import Consommables.Consommables;
import Joueur.Joueur;

public class Inventaire {

	protected ArrayList<Consommables> _Inventory = new ArrayList<Consommables>();
	
	public Inventaire() {
		_Inventory.add(Consommables.MoyennePotionMana);
		_Inventory.add(Consommables.MoyennePotionSante);
	}
	
	public ArrayList<Consommables> ajouter_inventaire(Consommables item, Joueur joueur) {
		int InventorySize = joueur.getInventaire().getObjets().size();
		ArrayList<Consommables> Inventaire_Temp = new ArrayList<Consommables>(); 
		System.out.println(InventorySize);
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
		return _Inventory;
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

	public void afficher_inventaire(Joueur joueur) {
		System.out.println("Inventaire :");
		for(Consommables objets : joueur.getInventaire().getObjets()) {
			System.out.println(objets);
		}
	}
	
	public void vider_inventaire(Joueur joueur) {
		ArrayList<Consommables> Inventaire_Temp = new ArrayList<Consommables>(); 
		
		joueur.getInventaire().setObjets(Inventaire_Temp);
		joueur.setInventaire(this);
		System.out.println(joueur.getInventaire().getObjets());
	}
	
	public String toString(Joueur joueur) {
		for(Consommables objets : joueur.getInventaire().getObjets()) {
			System.out.println(objets);
		}
		return "True";
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