package Joueur;

import Classes.*;
import Commandes.*;
import Races.*;


public class Joueur extends Personnage {
	
	Interface Commande = new Interface();
	
	private String[] Classes = {"Archer", "Barbare", "Barde", "Guerrier", "Lutteur", "Mage", "Rodeur",};
	private int numeroClasse;
	
	private String[] Races = {"Elfe", "Ent", "Gobelin", "Hobbit", "Humain", "Maiar", "Nain", "Orque"}; 
	private int numeroRace;
	
	boolean classeValide = false;
	boolean raceValide = false;
	
	//Constructeur Joueur
	public Joueur(String name) {
		super(name, 100, 0);
		 
		_name = name;
		
		ChoixRace();
		ChoixClasse();
		Recapitulatif();
		
	}
	
	public void ChoixClasse(){
		Commande.NettoyerConsole();
		Commande.AfficherSeparateur(122);
		System.out.println("\nAragorn : Quel est votre classe de prédilection " + _name + " ?! \n");
		
		for(int i=0; i < Classes.length; i++) {
			System.out.println("[" + (i+1) + "] " + Classes[i]);
		}
		System.out.println();
		
		Commande.AfficherSeparateur(122);
		
		int choix_classe = Commande.LectureInt("->", Classes.length);
		Commande.NettoyerConsole();
		
		switch(choix_classe)
		{
			case 1 :
			{
				classe = new Archer();
				_maxHp = classe.getSante();
				_hp = classe.getSante();
				_mana = classe.getMana();
				numeroClasse = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Classes[0] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixClasse();
						break;
					}
					default :
					{}
				}
				break;
			}
			case 2 :
			{
				classe = new Barbare();
				_maxHp = classe.getSante();
				_hp = classe.getSante();
				_mana = classe.getMana();
				numeroClasse = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Classes[1] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixClasse();
						break;
					}
					default :
					{}
				}
				break;
			}
			case 3 :
			{
				classe = new Barde();
				_maxHp = classe.getSante();
				_hp = classe.getSante();
				_mana = classe.getMana();
				numeroClasse = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Classes[2] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixClasse();
						break;
					}
					default :
					{}
				}
				break;
			}
			case 4 :
			{
				classe = new Guerrier();
				_maxHp = classe.getSante();
				_hp = classe.getSante();
				_mana = classe.getMana();
				numeroClasse = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Classes[3] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixClasse();
						break;
					}
					default :
					{}
				}
				break;
			}
			case 5 :
			{
				classe = new Lutteur();
				_maxHp = classe.getSante();
				_hp = classe.getSante();
				_mana = classe.getMana();
				numeroClasse = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Classes[4] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixClasse();
						break;
					}
					default :
					{}
				}
				break;
			}
			case 6 :
			{
				classe = new Mage();
				_maxHp = classe.getSante();
				_hp = classe.getSante();
				_mana = classe.getMana();
				numeroClasse = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Classes[5] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixClasse();
						break;
					}
					default :
					{}
				}
				break;
			}
			case 7 :
			{
				classe = new Rodeur();
				_maxHp = classe.getSante();
				_hp = classe.getSante();
				_mana = classe.getMana();
				numeroClasse = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Classes[6] + "\n" 
						+ "Aragorn : " + classe.getDescription() + "\n" 
						+ "Aragorn : En es-tu certains ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixClasse();
						break;
					}
					default :
					{}
				}
				break;
			}
		}
	}

	public void ChoixRace()
	{
		Commande.NettoyerConsole();
		Commande.AfficherSeparateur(122);
		System.out.println("\nAragorn : Votre apparence ne m'est pas familière, quel est votre ethnie " + _name + " ?! \n");
		
		for(int i=0; i < Races.length; i++) {
			System.out.println("[" + (i+1) + "] " + Races[i]);
		}
		System.out.println();
		Commande.AfficherSeparateur(122);
		
		int choix_race = Commande.LectureInt("->", Races.length);
		
		Commande.NettoyerConsole();
		
		switch(choix_race)
		{
			case 1 :
			{
				race = new Elfe();
				numeroRace = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Races[0] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixRace();
						break;
					}
					default :
					{}
				}
				break;
			}
			case 2 :
			{
				race = new Ent();
				numeroRace = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Races[1] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixRace();
						break;
					}
					default :
					{}
				}
				break;
			}
			case 3 :
			{
				race = new Gobelin();
				numeroRace = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Races[2] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixRace();
						break;
					}
					default :
					{}
				}
				break;
			}
			case 4 :
			{
				race = new Hobbit();
				numeroRace = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Races[3] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixRace();
						break;
					}
					default :
					{}
				}
				break;
			}
			case 5 :
			{
				race = new Humain();
				numeroRace = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Races[4] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixRace();
						break;
					}
					default :
					{}
				}
				break;
			}
			case 6 :
			{
				race = new Maiar();
				numeroRace = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Races[5] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixRace();
						break;
					}
					default :
					{}
				}
				break;
			}
			case 7 :
			{
				race = new Orque();
				numeroRace = 0;
				
				Commande.NettoyerConsole();
				Commande.AfficherEntete(200,
						  "\nAragorn : Alors comme ça tu es un " +  Races[6] + "\n" 
						+ "Aragorn : De ce que je connais, " + race.getDescription() + "\n" 
						+ "Aragorn : Est-ce bien cela ?\n\n"
						+ "[1] Oui ! \n"
						+ "[2] Non ! \n");
				int choix = Commande.LectureInt("->", 2);

				switch(choix)
				{
					case 1 :
					{break;}
					case 2 :
					{
						ChoixRace();
						break;
					}
					default :
					{}
				}
				break;
			}
		}
	}

	public void Recapitulatif() {
		Commande.NettoyerConsole();
		Commande.AfficherEntete(122,
				  "    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   \n"
				+ "                                                    RECRUE DE GUERRE                                                     \n\n"
				+ "     Nom : " + _name + "\n"																								
				+ "     Vie : " + _hp + "\n"
				+ "     Mana : " + _mana + "\n"
				+ "    \n"
				+ "     Race : " + Races[numeroRace] + "\n"
				+ "     Classe : " + Classes[numeroClasse] + "\n"
				+ "     Compétences : " + classe.getAttaquesPhysiques().get(0).getNom() + " , " + classe.getAttaquesPhysiques().get(1).getNom() + " , " + classe.getAttaquesMagiques().get(0).getNom() + " , " + classe.getAttaquesMagiques().get(1).getNom() + "\n"
				+ "    \n"
				+ "     Physique : " + classe.getPhysique() + "\n"
				+ "     Social : " + classe.getSocial() + "\n"
				+ "     Mental : " + classe.getMental() + "\n"
				+ "    \n"
				+ "    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Commande.StopProgramme();
		
	}
}
