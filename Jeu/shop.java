package Jeu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class shop {
	int ArgentJoueur;
	ArrayList<String> ItemAVendre = new ArrayList<String>(Arrays.asList("Test","Hihi","UwU"));

	public shop(int ArgentJoueur) {
		this.ArgentJoueur = ArgentJoueur;
		// TODO Auto-generated constructor stub
	}
	
	public void getArgent(int ArgentJoueur)
	{
		this.ArgentJoueur = ArgentJoueur;
	}
	
	public void acheterItem()
	{
		System.out.println("Blabla du marchand pour te demander ce que tu veux acheter");
		for (String element:this.ItemAVendre){
			System.out.println(ItemAVendre.indexOf(element) + " : " + element);
		}
		Scanner myscan = new Scanner(System.in);
		System.out.println("\nQue voulez-vous acheter ? :\n");
		String itemtest = ItemAVendre.get(myscan.nextInt());
		System.out.println("Vous avez acheté : " + itemtest);
		myscan.close();
	}

}
