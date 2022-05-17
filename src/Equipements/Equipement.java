package Equipements;

public class Equipement implements EquipementIntf {

    protected int degat;
    protected int armure;
    protected int prix;
    
    public int getPrix() {
    	return prix;
    }

    public int getDegat() {
        return degat;
    }
    public int getArmure() {
        return armure;
    }
    public void setDegat(int degat) {
        this.degat=degat;
    }
    public void setArmure(int armure) {
        this.armure=armure;
    }
}
