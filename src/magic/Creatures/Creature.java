
package magic.Creatures;


public interface Creature {
    public void getName();
    public void getDescription();
    public int getAttack();
    public void setAttack(int a);
    
    public int getMaxAttack();
    public int setMaxAttack(int a);
    
    public int getMaxDefense();
    public int setMaxDefense(int b);
    
    public int getOriginAttack();
    public int getOriginDefense();
    
    public void regen();
    //rigenera DIFESA della creatura
    
    public int getDefense();
    public void setDefense(int b);
    public void tap();
    public void untap();
    public void effect();
    
}
