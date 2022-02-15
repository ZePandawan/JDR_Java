import java.util.Scanner;

public class create_perso {
	String name_aventurier;
	int age;
	String race;
	String classe;
	String [] tab_classe = {"Guerrier", "Barde", "Lutteur", "Roublard","Rodeur","Mage","Archer","Barbare"} ;
	String [] tab_race = {"Hobbit","Humain","Elfe","Nain","Ent","Malar","Orque","Uruk-hai","Nazgul","Gobelin","Troll"} ;
	
	public create_perso() {
		// TODO Auto-generated constructor stub
		System.out.println("Bonjour Cher Joueur ! \n ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		// Nom aventurier
		System.out.print( "Veuillez entrer votre nom cher aventurier : " );
		this.name_aventurier = scanner.nextLine();

		// Race aventurier
		System.out.println("--------------------");
		System.out.println("| 1 |   Hobbit     |");
		System.out.println("| 2 |   Humain     |");
		System.out.println("| 3 |   Elfe       |");
		System.out.println("| 4 |   Nain       |");
		System.out.println("| 5 |   Ent        |");
		System.out.println("| 6 |   Malar      |");
		System.out.println("| 7 |   Orque      |");
		System.out.println("| 8 |   Uruk-ai    |");
		System.out.println("| 9 |   Nazgul     |");
		System.out.println("|10 |   Gobelin    |");
		System.out.println("|11 |   Troll      |");
		System.out.println("--------------------");
		System.out.println("Quel est votre race "+ this.name_aventurier + " ? ");
		System.out.println("(Si vous voulez plus d'informations sur les races tapez 0)");
		int race_choisie = scanner.nextInt();
		if (race_choisie == 0){
			System.out.println("Veuillez entrer le numéro de la race dont vous voulez plus d'information :");
			int race_info = scanner.nextInt();
			String race = tab_race[race_info-1];
			System.out.println(race);
		}
		this.race = this.tab_race[race_choisie-1];

		// Classe aventurier
		System.out.println("--------------------");
		System.out.println("| 1 |   Guerrier   |");
		System.out.println("| 2 |   Barde      |");
		System.out.println("| 3 |   Lutteur    |");
		System.out.println("| 4 |   Roublard   |");
		System.out.println("| 5 |   Rodeur     |");
		System.out.println("| 6 |   Mage       |");
		System.out.println("| 7 |   Archer     |");
		System.out.println("| 8 |   Barbare    |");
		System.out.println("--------------------");
		System.out.println("Quel est votre classe "+ this.name_aventurier + " ? ");
		System.out.println("(Si vous voulez plus d'informations sur les classes tapez 0)");
		int classe_choisie = scanner.nextInt();
		if (classe_choisie == 0){
			System.out.println("Veuillez entrer le numéro de la classe dont vous voulez plus d'information :");
			int classe_info = scanner.nextInt();
			String classe = tab_classe[classe_info-1];
			System.out.println(classe);
		}
		this.classe = this.tab_classe[classe_choisie-1];
		
		// Age aventurier
		System.out.println("Quel est votre age "+ this.name_aventurier + " ? ");
		this.age = scanner.nextInt();
		
	}
	
	
	public String toString() {
		return this.name_aventurier + " " + this.age + " " + this.race;
	}

}
