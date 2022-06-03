package Terrain;

import Monstres.Ennemi;
import java.util.ArrayList;

import Commandes.Jeu;
import Joueur.Joueur;


import static Monstres.EnnemiIntf.random;

public enum Terrain {
    Foret(Ennemi.Araignee, Ennemi.Gobelin, Ennemi.Warg),
    Forteresse(Ennemi.Orque, Ennemi.Gobelin, Ennemi.Troll),
    Marais(Ennemi.Araignee, Ennemi.Orque, Ennemi.Gollum),
    Montagne(Ennemi.Troll, Ennemi.Balrog, Ennemi.Smaug),
    Montagne_du_destin(Ennemi.Orque, Ennemi.Gollum, Ennemi.RoiSorcier),
    Plaine(Ennemi.Chenille, Ennemi.Gobelin, Ennemi.Warg),
    Plaine_desolees(Ennemi.Araignee, Ennemi.Orque, Ennemi.Warg),
    Tour_de_Sauron(Ennemi.Orque, Ennemi.RoiSorcier, Ennemi.Sauron);

    protected ArrayList<Ennemi> ListeMonstres = new ArrayList<Ennemi>();
    protected Jeu jeu = new Jeu();
    Terrain(Ennemi e1, Ennemi e2, Ennemi e3) {
        ListeMonstres.add(e1);
        ListeMonstres.add(e2);
        ListeMonstres.add(e3);
    }


    public void CombatTerrain(Joueur joueur) {
        int SpawnRate = (random.nextInt(1, 101));
        System.out.println(SpawnRate);
        if (SpawnRate<65) {
            System.out.println(ListeMonstres.get(0));
            
            jeu.MenuCombat(joueur, ListeMonstres.get(0));
            ListeMonstres.get(0).SoinMonstre(ListeMonstres.get(0));
            
        }
        else if (SpawnRate>65 && SpawnRate<95) {
            System.out.println(ListeMonstres.get(1));
            jeu.MenuCombat(joueur, ListeMonstres.get(1));
            ListeMonstres.get(1).SoinMonstre(ListeMonstres.get(1));
        }
        else {
            System.out.println(ListeMonstres.get(2));
            jeu.MenuCombat(joueur, ListeMonstres.get(2));
            ListeMonstres.get(2).SoinMonstre(ListeMonstres.get(2));
        }
    }
}