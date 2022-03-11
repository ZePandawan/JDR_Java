package src.Personnage;

public class Test_Personnage {
	public static void main(String[] args)
	{
		Personnage perso = new Personnage(4);
		System.out.println(perso.getPhysique());
		System.out.println(perso.getSocial());
		System.out.println(perso.getMental());
		System.out.println(perso.getSante());
		System.out.println(perso.getMana());
		
	}
}
