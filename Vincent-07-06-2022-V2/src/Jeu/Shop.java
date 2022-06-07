package Jeu;

import java.util.ArrayList;

import Commandes.Jeu;
import Consommables.Consommables;
import Joueur.Joueur;


public class Shop {
	//private int _ArgentJoueur;
	ArrayList<Consommables> _ConsoShop = new ArrayList<Consommables>();
	protected Jeu Commande = new Jeu();

	public Shop(/*Joueur joueur*/) {
		//Ajouter le getMoney pour pouvoir recup l'argent du pélo
		// TODO Auto-generated constructor stub
		_ConsoShop.add(Consommables.Biere);
		_ConsoShop.add(Consommables.Carotte);
		_ConsoShop.add(Consommables.Steak);
		_ConsoShop.add(Consommables.Pomme);
		_ConsoShop.add(Consommables.Patate);
		_ConsoShop.add(Consommables.Saucisse);
		_ConsoShop.add(Consommables.PetitePotionMana);
		_ConsoShop.add(Consommables.MoyennePotionMana);
		_ConsoShop.add(Consommables.GrandePotionMana);
		_ConsoShop.add(Consommables.PetitePotionSante);
		_ConsoShop.add(Consommables.MoyennePotionSante);
		_ConsoShop.add(Consommables.GrandePotionSante);
		_ConsoShop.add(Consommables.PotionMax);
		
	}
	
	/*
	public void getArgent(int ArgentJoueur)
	{
		_ArgentJoueur = ArgentJoueur;
	}
	*/
	
	public void afficherShop(Joueur joueur)
	{
		Commande.afficherSeparateur(60);
		System.out.println("Blabla du marchand pour te demander ce que tu veux acheter\n");
		for (Consommables element: _ConsoShop){
			System.out.println("[" + (_ConsoShop.indexOf(element)+ 1) + "] : " + element.getNom() + " | Mana : +" + element.getMana() + " | Vie : +" + element.getVie() + " | Prix : " + element.getPrix());
		}
		System.out.println("\n[14] : Afficher votre inventaire");
		System.out.println("\n[15] : Quitter le shop");
		Commande.afficherSeparateur(60);
		System.out.println("\nQue voulez-vous acheter ? :\n");
		int choix = Commande.lectureInt("->", 15);
			
		switch(choix) {
		case 14:{
			joueur.getInventaire().afficher_inventaire(joueur);
			System.out.println("Voulez-vous continuer vos achats ? (1 : oui) (2 : non)");
			int result = Commande.lectureInt("->", 2);
			if(result == 1)
			{
				afficherShop(joueur);
			}
			else
			{
				System.out.println("D'accord au revoir mon brave !");
			}
			break;
		}
		case 15:{
			System.out.println("Au revoir mon brâve !");
			break;
		}
		default:{
			Consommables itemtest = _ConsoShop.get(choix-1);
			acheterItem(itemtest,joueur);
			Commande.afficherSeparateur(60);
			
			joueur.getInventaire().afficher_inventaire(joueur);
			System.out.println("Voulez-vous continuer vos achats ? (1 : oui) (2 : non)");
			int result = Commande.lectureInt("->", 2);
			if(result == 1)
			{
				afficherShop(joueur);
			}
			else
			{
				System.out.println("D'accord au revoir mon brave !");
			}
			break;
		}
			
		}
		
		//Commande.AfficherSeparateur(60);
	}
	
	public void acheterItem(Consommables Item, Joueur joueur)
	{
		int argentJoueur = joueur.getArgent();
		int argentItem = Item.getPrix();
		
		if(argentJoueur - argentItem >= 0) {
			//if(Inventory.verif_inventaire_plein(joueur) == false)
			//{
				joueur.getInventaire().ajouter_inventaire(Item, joueur);
				joueur.setArgent(joueur.getArgent() - argentItem);
			//}
			//else
			//{
			//	System.out.println("Désolé mais votre inventaire est plein !");
			//}
			//System.out.println(Item.getNom());
		}else {
			System.out.println("Vous n'avez pas assez d'argent pour acheter cet objet !");
		}
		
		
	}

}