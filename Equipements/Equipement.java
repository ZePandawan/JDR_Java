package Equipements;

public class Equipement implements EquipementIntf {

    protected int degatP;
    protected int degatM;
    protected int armure;
    protected int prix;
    protected String nom;
    
    public int getPrix() {
    	return prix;
    }
    
    public int getDegatP() {
        return degatP;
    }
    
    public int getDegatM() {
        return degatM;
    }
    
    public int getArmure() {
        return armure;
    }
    
    public String getNom()
    {
    	return nom;
    }
    
    public void setDegatP(int degat) {
        this.degatP=degat;
    }
    
    public void setDegatM(int degat) {
        this.degatP=degat;
    }
    
    public void setArmure(int armure) {
        this.armure=armure;
    }
}
