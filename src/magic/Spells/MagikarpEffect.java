
package magic.Spells;

import magic.Board;
import magic.Giocatore;

/*
Effetto corrispondente della carta magikarp per debug
*/

public class MagikarpEffect implements Spell{

    @Override
    public boolean cast(Giocatore g1, Giocatore g2, Board b) {
        System.out.println("Magikarp usa splash, ma non succede niente...");
        return false;
    }
    
}
