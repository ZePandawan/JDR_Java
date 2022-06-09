package Terrain;

import Monstres.Ennemi;
import Joueur.Joueur;


import static Monstres.EnnemiIntf.random;

import java.util.ArrayList;

import Commandes.Jeu;

public enum Terrain implements TerrainIntf {
    Foret(Ennemi.Araignee, Ennemi.Gobelin, Ennemi.Warg),
    Forteresse(Ennemi.Orque, Ennemi.Gobelin, Ennemi.Troll),
    Marais(Ennemi.Araignee, Ennemi.Orque, Ennemi.Gollum),
    Montagne(Ennemi.Troll, Ennemi.Balrog, Ennemi.Smaug),
    Montagne_du_destin(Ennemi.Orque, Ennemi.Gollum, Ennemi.RoiSorcier),
    Plaine(Ennemi.Chenille, Ennemi.Gobelin, Ennemi.Warg),
    Plaine_desolees(Ennemi.Araignee, Ennemi.Orque, Ennemi.Warg),
    Tour_de_Sauron(Ennemi.Orque, Ennemi.RoiSorcier, Ennemi.Sauron);
	
	protected ArrayList<Ennemi> listeMonstres = new ArrayList<Ennemi>();
    protected Jeu jeu = new Jeu();
    
    Terrain(Ennemi e1, Ennemi e2, Ennemi e3) {
        listeMonstres.add(e1);
        listeMonstres.add(e2);
        listeMonstres.add(e3);
    }


    public void combatTerrain(Joueur joueur) {
        int SpawnRate = (random.nextInt(1, 101));
        System.out.println(SpawnRate);
        if (SpawnRate<65) {
            System.out.println(listeMonstres.get(0));
            
            jeu.menuCombat(joueur, listeMonstres.get(0));
            listeMonstres.get(0).soinMonstre(listeMonstres.get(0));
            
        }
        else if (SpawnRate>65 && SpawnRate<95) {
            System.out.println(listeMonstres.get(1));
            jeu.menuCombat(joueur, listeMonstres.get(1));
            listeMonstres.get(1).soinMonstre(listeMonstres.get(1));
        }
        else {
            System.out.println(listeMonstres.get(2));
            jeu.menuCombat(joueur, listeMonstres.get(2));
            listeMonstres.get(2).soinMonstre(listeMonstres.get(2));
        }
    }
}