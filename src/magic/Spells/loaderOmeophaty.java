/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.Spells;

import magic.Board;
import magic.Giocatore;

/**
 *
 * @author Roberto
 */
public class loaderOmeophaty implements Spell{

    @Override
    public boolean cast(Giocatore g1, Giocatore g2, Board b) {
        System.out.println("Omeophaty è stata lanciata, ma non succede niente.");
        return false;
    }
    
}
