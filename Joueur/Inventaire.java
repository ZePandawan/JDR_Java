package Joueur;

import java.util.ArrayList;

public class Inventaire {

	ArrayList<String> Inventory;
	
	public Inventaire(ArrayList<String> Inventaire) {
		// TODO Auto-generated constructor stub
		this.Inventory = Inventaire;
	}
	
	public void ajouter_inventaire(String item) {
		int InventorySize = this.Inventory.size();
		System.out.println(InventorySize);
		Boolean isFull = verif_inventaire_plein();
		if(isFull == false) {
			this.Inventory.add(item);			
		}
		else
		{
			System.out.println("Votre Inventaire est déjà plein !");
		}
	}
	
	public Boolean verif_inventaire_plein() {
		if(this.Inventory.size() == 4) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void supprimer_inventaire(String item) {
		int index = 0;
		for(String element:Inventory) {
			if(element == item) {
				this.Inventory.remove(index);
				break;
			}
			index += 1;
		}
	}

	public void afficher_inventaire() {
		System.out.println("Inventaire :");
		for(String element:Inventory) {
			System.out.println(element);
		}
	}
	
	public void vider_inventaire() {
		this.Inventory.clear();
		System.out.println(this.Inventory);
	}
	
	public String toString() {
		for(String element:Inventory) {
			System.out.println(element);
		}
		return "True";

	}
}
