
package magic.Spells;

import magic.Board;
import magic.Giocatore;

public interface Spell {
    public boolean cast(Giocatore g1, Giocatore g2, Board b);

}
