
package magic.Creatures;

import magic.Spells.MagikarpEffect;
import magic.Spells.Spell;
import magic.Stack;

public class CreatureMagikarp implements Creature{

    private final int originAttack;
    private final int originDefense;
    private int attack;
    private int defense;
    private boolean tapped;
    public int damage;
    
    
    public CreatureMagikarp(){
        originAttack = 0;
        originDefense = 0;
        attack = 0;
        defense = 0;
        tapped = true;
    }
    
    @Override
    public String getName() {
        return "Magikarp";
    }

    @Override
    public String getDescription() {
        return "This card does nothing: Splash...";
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public void setAttack(int a) {
        attack = a;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public void setDefense(int b) {
        defense = b;
    }

    @Override
    public int getOriginAttack() {
        return originAttack;
    }

    @Override
    public int getOriginDefense() {
        return originDefense;
    }

    @Override
    public void regen() {
        defense = originDefense;
        damage = 0;
    }

    @Override
    public void tap() {
        tapped = true;
    }

    @Override
    public void untap() {
        tapped = false;
    }

    @Override
    public boolean hasEffect() {
        return true;
    }

    @Override
    public boolean isTapped() {
        return tapped;
    }

    @Override
    public void effect(Stack s) {
        this.tap();
        Spell e = new MagikarpEffect();
        s.addSpell(e);
    }
    
}
