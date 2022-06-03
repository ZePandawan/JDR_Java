package Joueur;

import Classes.*;
import Races.*;


public class Joueur extends Personnage {
	
	private String[] Classes = {"Archer", "Barbare", "Barde", "Guerrier", "Lutteur", "Mage", "Rodeur",};
	private int numeroClasse;
	
	private String[] Races = {"Elfe", "Ent", "Gobelin", "Hobbit", "Humain", "Maiar", "Nain", "Orque"}; 
	private int numeroRace;
	
	boolean classeValide = false;
	boolean raceValide = false;
	
	//Constructeur Joueur
	public Joueur(String name) {	 
		_name = name;
		_exp = new Experience();
		
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
				_hp = classe.getSante();
				_maxHp = classe.getSante();
				_mana = classe.getMana();
				_maxMana = classe.getMana();
				_argent = 20;
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
					{break;}
				}
				break;
			}
			case 2 :
			{
				classe = new Barbare();
				_hp = classe.getSante();
				_maxHp = classe.getSante();
				_mana = classe.getMana();
				_maxMana = classe.getMana();
				_argent = 20;
				numeroClasse = 1;
				
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
					{break;}
				}
				break;
			}
			case 3 :
			{
				classe = new Barde();
				_hp = classe.getSante();
				_maxHp = classe.getSante();
				_mana = classe.getMana();
				_maxMana = classe.getMana();
				_argent = 20;
				numeroClasse = 2;
				
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
					{break;}
				}
				break;
			}
			case 4 :
			{
				classe = new Guerrier();
				_hp = classe.getSante();
				_maxHp = classe.getSante();
				_mana = classe.getMana();
				_maxMana = classe.getMana();
				_argent = 20;
				numeroClasse = 3;
				
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
					{break;}
				}
				break;
			}
			case 5 :
			{
				classe = new Lutteur();
				_hp = classe.getSante();
				_maxHp = classe.getSante();
				_mana = classe.getMana();
				_maxMana = classe.getMana();
				_argent = 20;
				numeroClasse = 4;
				
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
					{break;}
				}
				break;
			}
			case 6 :
			{
				classe = new Mage();
				_hp = classe.getSante();
				_maxHp = classe.getSante();
				_mana = classe.getMana();
				_maxMana = classe.getMana();
				_argent = 20;
				numeroClasse = 5;
				
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
					{break;}
				}
				break;
			}
			case 7 :
			{
				classe = new Rodeur();
				_hp = classe.getSante();
				_maxHp = classe.getSante();
				_mana = classe.getMana();
				_maxMana = classe.getMana();
				_argent = 20;
				numeroClasse = 6;
				
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
					{break;}
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
				race = Race.Elfe;
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
					{break;}
				}
				break;
			}
			case 2 :
			{
				race = Race.Ent;
				numeroRace = 1;
				
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
					{break;}
				}
				break;
			}
			case 3 :
			{
				race = Race.Gobelin;
				numeroRace = 2;
				
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
					{break;}
				}
				break;
			}
			case 4 :
			{
				race = Race.Hobbit;
				numeroRace = 3;
				
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
					{break;}
				}
				break;
			}
			case 5 :
			{
				race = Race.Humain;
				numeroRace = 4;
				
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
					{break;}
				}
				break;
			}
			case 6 :
			{
				race = Race.Maiar;
				numeroRace = 5;
				
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
					{break;}
				}
				break;
			}
			case 7 :
			{
				race = Race.Orque;
				numeroRace = 6;
				
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
					{break;}
				}
				break;
			}
		}
	}

	public void Recapitulatif() {
		Commande.StopProgramme();
		Commande.NettoyerConsole();
		Commande.AfficherEntete(122,
				  "    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~   \n"
				+ "                                                    RECRUE DE GUERRE                                                     \n\n"
				+ "     Nom : " + _name + "\n"																								
				+ "     Vie : " + _hp + " / " + _maxHp + "\n"
				+ "     Mana : " + _mana + " / " + _maxMana + "\n\n"
				+ "     Experience : " + _exp.getXp() + "\n"
				+ "     Level : " + _exp.getLevel() + "\n"
				+ "     Argent : " + _argent + " PO \n"
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
	}
}
