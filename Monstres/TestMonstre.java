package Monstres;
public class TestMonstre {
    public static void main(String[] args) {
        Monstre monstre = new Araignee();
        //Monstre boss = new Balrog();
        System.out.println(monstre.getSante());
        System.out.println(monstre.getDescription());
        System.out.println(monstre.getExp());
    }
}
