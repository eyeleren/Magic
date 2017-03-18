/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.Spells;

import magic.Board;
import magic.Creatures.Creature;
import magic.Creatures.creatureMagikarp;
import magic.Giocatore;

/**
 *
 * @author Roberto
 */
public class loaderMagikarp implements Spell{
    
    private Giocatore g;
    
    public loaderMagikarp(Giocatore g){
        this.g = g;
    }
    
    @Override
    public boolean cast(Giocatore g1, Giocatore g2, Board b) {
        System.out.println("Magikarp è stata posizionata sul campo.");
        Creature m = new creatureMagikarp();
        if(g.getId() == 1)
            b.boardp1.add(m);
        else
            b.boardp2.add(m);
        return false;
    }
    
}
