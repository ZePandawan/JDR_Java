package Joueur;
import Monstres.Ennemi;

public class Experience {
    protected int xp;
    protected int level;
    
    public Experience()
    {
    	xp = 0;
    	level = 0;
    }

    public void xp(Joueur joueur, Ennemi ennemi) {
    	
    	joueur.getXp().setXp(joueur.getXp().getXp() + ennemi.getExp());
    	
        if(joueur.getXp().getXp() >= level*100+100) {
        	while(joueur.getXp().getXp() >= level*100+100)
        	{
        		 joueur.getXp().setLevel(joueur.getXp().getLevel() + 1);
                 joueur.getXp().setXp(joueur.getXp().getXp() - 100);
                 joueur.setMaxHp(joueur.getMaxHp()+2);
                 joueur.setHp(joueur.getMaxHp());
                 joueur.setManaMax(joueur.getManaMax()+2);
                 joueur.setMana(joueur.getManaMax());
                 System.out.println("passage de niveau");
                 System.out.println("gain de "+ ennemi.getExp() +"xp");
        	}
        }
        else
        {
        	System.out.println("gain de "+ ennemi.getExp() +"xp");
        }
        joueur.setXp(this);
    }

    public int getLevel() {
        return level;
    }
    
    public void setLevel(int Level) {
    	level = Level;
    }

    public int getXp() {
        return xp;
    }
    
    public void setXp(int Xp)
    {
    	xp = Xp;
    }


}
