package Terrain;

import Monstres.Ennemi;

public enum TerrainEnum {
    Foret(Ennemi.Araignee,Ennemi.Warg,Ennemi.Gobelin),
    Forteresse(Ennemi.Orque,Ennemi.Gobelin,Ennemi.Troll),
    Marais(Ennemi.Gollum,Ennemi.Orque,Ennemi.Araignee),
    Montagne(Ennemi.Balrog,Ennemi.Troll,Ennemi.Smaug),
    Montagne_du_destin(Ennemi.Gollum,Ennemi.RoiSorcier,Ennemi.Orque),
    Plaine(Ennemi.Chenille,Ennemi.Warg,Ennemi.Gobelin),
    Plaine_desolees(Ennemi.Araignee,Ennemi.Warg,Ennemi.Orque),
    Tour_de_Sauron(Ennemi.RoiSorcier,Ennemi.Sauron,Ennemi.Orque);

    TerrainEnum(Ennemi e1, Ennemi e2, Ennemi e3)
}
