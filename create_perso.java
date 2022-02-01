import java.util.Scanner;

public class create_perso {
	String name_aventurier;
	int age;
	String race;
	String [] tab_classe = {} ;
	String [] tab_race = {"Hobbit","Humain","Elfe","Nain","Ent","Malar","Orque","Uruk-hai","Nazgul","Gobelin","Troll"} ;
	
	public create_perso() {
		// TODO Auto-generated constructor stub
		System.out.println("Bonjour Cher Joueur ! \n ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print( "Veuillez entrer votre nom cher aventurier : " );
		this.name_aventurier = scanner.nextLine();
		System.out.print("-------------------- \n");
		System.out.print("| 1 |    Hobbit    | \n");
		System.out.print("| 2 |    Humain    | \n");
		System.out.print("| 3 |     Elfe     | \n");
		System.out.print("| 4 |     Nain     | \n");
		System.out.print("| 5 |     Ent      | \n");
		System.out.print("| 6 |    Malar     | \n");
		System.out.print("| 7 |    Orque     | \n");
		System.out.print("| 8 |    Uruk-ai   | \n");
		System.out.print("| 9 |    Nazgul    | \n");
		System.out.print("|10 |    Gobelin   | \n");
		System.out.print("|11 |     Troll    | \n");
		System.out.print("-------------------- \n");
		System.out.println("Quel est votre race "+ this.name_aventurier + " ? ");
		int race_choisie = scanner.nextInt();
		this.race = this.tab_race[race_choisie-1];
		System.out.println("Quel est votre age "+ this.name_aventurier + " ? ");
		this.age = scanner.nextInt();
		
	}
	
	
	public String toString() {
		return this.name_aventurier + " " + this.age + " " + this.race;
	}

}
