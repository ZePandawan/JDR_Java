import java.util.Scanner;

public class create_perso {
	String name_aventurier;
	int age;
	public create_perso() {
		// TODO Auto-generated constructor stub
		System.out.println("Bonjour Cher Joueur ! \n ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print( "Veuillez entrer votre nom cher aventurier : " );
		this.name_aventurier = scanner.nextLine();
		System.out.print("-------------------- \n");
		System.out.print("| 1 |    test      | \n");
		System.out.print("| 2 |   je teste   | \n");
		System.out.print("| 3 |  Ptn je suis | \n");
		System.out.print("| 4 |   chauuuud   | \n");
		System.out.print("| 5 |     bite     | \n");
		System.out.print("| 6 |     suce     | \n");
		System.out.print("-------------------- \n");
		System.out.println("Quel est votre age "+ this.name_aventurier + " ? ");
		this.age = scanner.nextInt();
		
	}
	
	
	public String toString() {
		return this.name_aventurier + this.age ;
	}

}
