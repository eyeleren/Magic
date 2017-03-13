
package Creatures;


public interface Creature {
    public void getName();
    public void getDescription();
    public int getAttack();
    public void setAttack(int a);
    public int getDefense();
    public void setDefense(int b);
    public void tap();
    public void untap();
    public void effect();
    
}
