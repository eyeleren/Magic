/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.Creatures;

import magic.Stack;

/**
 *
 * @author Roberto
 */
public class creatureMagikarp implements Creature{

    private final int originAttack;
    private final int originDefense;
    private int attack;
    private int defense;
    private boolean tapped;
    public int damage;
    
    
    public creatureMagikarp(){
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
        return false;
    }

    @Override
    public void effect(Stack s) {
        System.out.println("Non succede niente");
    }
    
}
