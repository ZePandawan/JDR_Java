package Joueur;

import Classes.*;
import Races.*;


public class Joueur extends Personnage {
	
	private String[] classes = {"Archer", "Barbare", "Barde", "Guerrier", "Lutteur", "Mage", "Rodeur",};
	private int numeroClasse;
	
	private String[] races = {"Elfe", "Ent", "Gobelin", "Hobbit", "Humain", "Maiar", "Nain", "Orque"}; 
	private int numeroRace;
	
	protected boolean classeValide = false;
	protected boolean raceValide = false;
	
	//Constructeur Joueur
	public Joueur(String Name) {	 
		name = Name;
		exp = new Experience();
		
		choixrace();
		choixClasse();
		recapitulatif();
		
	}
	
	public void choixClasse(){
		commande.nettoyerConsole();
		
		commande.afficherSeparateur(122);
		System.out.println("\nAragorn : Quel est votre classe de prédilection " + name + " ?! \n");
		for(int i=0; i < classes.length; i++) {
			System.out.println("[" + (i+1) + "] " + classes[i]);
		}
		System.out.println();
		commande.afficherSeparateur(122);
		
		int choixclasse = commande.lectureInt("->", classes.length);
		commande.nettoyerConsole();
		
		switch(choixclasse)
		{
			case 1 :
			{
				classe = new Archer();
				hp = classe.getSante();
				maxHp = classe.getSante();
				mana = classe.getMana();
				maxMana = classe.getMana();
				argent = 20;
				numeroClasse = 0;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  classes[0] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixClasse();
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 2 :
			{
				classe = new Barbare();
				hp = classe.getSante();
				maxHp = classe.getSante();
				mana = classe.getMana();
				maxMana = classe.getMana();
				argent = 20;
				numeroClasse = 1;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  classes[1] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixClasse();
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 3 :
			{
				classe = new Barde();
				hp = classe.getSante();
				maxHp = classe.getSante();
				mana = classe.getMana();
				maxMana = classe.getMana();
				argent = 20;
				numeroClasse = 2;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  classes[2] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixClasse();
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 4 :
			{
				classe = new Guerrier();
				hp = classe.getSante();
				maxHp = classe.getSante();
				mana = classe.getMana();
				maxMana = classe.getMana();
				argent = 20;
				numeroClasse = 3;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  classes[3] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixClasse();
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 5 :
			{
				classe = new Lutteur();
				hp = classe.getSante();
				maxHp = classe.getSante();
				mana = classe.getMana();
				maxMana = classe.getMana();
				argent = 20;
				numeroClasse = 4;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  classes[4] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixClasse();
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 6 :
			{
				classe = new Mage();
				hp = classe.getSante();
				maxHp = classe.getSante();
				mana = classe.getMana();
				maxMana = classe.getMana();
				argent = 20;
				numeroClasse = 5;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  classes[5] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixClasse();
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 7 :
			{
				classe = new Rodeur();
				hp = classe.getSante();
				maxHp = classe.getSante();
				mana = classe.getMana();
				maxMana = classe.getMana();
				argent = 20;
				numeroClasse = 6;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  classes[6] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixClasse();
						break;
					}
					default :
					{break;}
				}
				break;
			}
		}
	}

	public void choixrace()
	{
		commande.nettoyerConsole();
		commande.afficherSeparateur(122);
		System.out.println("\nAragorn : Votre apparence ne m'est pas familière, quel est votre ethnie " + name + " ?! \n");
		
		for(int i=0; i < races.length; i++) {
			System.out.println("[" + (i+1) + "] " + races[i]);
		}
		System.out.println();
		commande.afficherSeparateur(122);
		
		int choixrace = commande.lectureInt("->", races.length);
		
		commande.nettoyerConsole();
		
		switch(choixrace)
		{
			case 1 :
			{
				race = Race.Elfe;
				numeroRace = 0;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  races[0] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixrace();
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 2 :
			{
				race = Race.Ent;
				numeroRace = 1;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  races[1] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixrace();
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 3 :
			{
				race = Race.Gobelin;
				numeroRace = 2;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  races[2] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixrace();
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 4 :
			{
				race = Race.Hobbit;
				numeroRace = 3;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  races[3] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixrace();
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 5 :
			{
				race = Race.Humain;
				numeroRace = 4;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  races[4] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixrace();
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 6 :
			{
				race = Race.Maiar;
				numeroRace = 5;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  races[5] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixrace();
						break;
					}
					default :
					{break;}
				}
				break;
			}
			case 7 :
			{
				race = Race.Orque;
				numeroRace = 6;
				
				commande.nettoyerConsole();
				commande.afficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  races[6] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = commande.lectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						choixrace();
						break;
					}
					default :
					{break;}
				}
				break;
			}
		}
	}

	public void recapitulatif() {
		commande.stopProgramme();
		commande.nettoyerConsole();
		commande.afficherEntete(122,
				  "    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   \n"
				+ "                                                    RECRUE DE GUERRE                                                     \n\n"
				+ "     Nom : " + name + "\n"																								
				+ "     Vie : " + hp + " / " + maxHp + "\n"
				+ "     Mana : " + mana + " / " + maxMana + "\n\n"
				+ "     Experience : " + exp.getXp() + "\n"
				+ "     Level : " + exp.getLevel() + "\n"
				+ "     Argent : " + argent + " PO \n"
				+ "    \n"
				+ "     race : " + races[numeroRace] + "\n"
				+ "     Classe : " + classes[numeroClasse] + "\n"
				+ "     Compétences : " + classe.getAttaquesPhysiques().get(0).getNom() + " , " + classe.getAttaquesPhysiques().get(1).getNom() + " , " + classe.getAttaquesMagiques().get(0).getNom() + " , " + classe.getAttaquesMagiques().get(1).getNom() + "\n"
				+ "    \n"
				+ "     Physique : " + classe.getPhysique() + "\n"
				+ "     Social : " + classe.getSocial() + "\n"
				+ "     Mental : " + classe.getMental() + "\n"
				+ "    \n"
				+ "    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}