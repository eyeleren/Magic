
package magic.Spells;

import magic.Board;
import magic.Giocatore;

/*
Effetto corrispondente della carta omeophaty per debug
*/

public class OmeophatyEffect implements Spell{

    @Override
    public boolean cast(Giocatore g1, Giocatore g2, Board b) {
        System.out.println("Omeophaty è stata lanciata, ma non succede niente.");
        return false;
    }
    
}
