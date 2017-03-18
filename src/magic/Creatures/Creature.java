
package magic.Creatures;


public interface Creature {
    public String getName();
    public void getDescription();
    
    public int getAttack();
    public void setAttack(int a);
    
    public int getDefense();
    public void setDefense(int b);
    
    public int getOriginAttack();
    public int getOriginDefense();
    
    public void regen(); //rigenera DIFESA della creatura
    public void tap();
    public void untap();
    public boolean hasEffect();
    public boolean isTapped();
    public void effect();
    
}
