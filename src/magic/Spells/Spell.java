
package magic.Spells;

import magic.Board;
import magic.Giocatore;

/*
Interfaccia che specifica i metodi in comune tra tutte le magie, sono considerati spell tutti gli elementi caricabili nello stack
dunque anche effetti di creature e caricatori di elementi sul campo
*/

public interface Spell {
    public boolean cast(Giocatore g1, Giocatore g2, Board b);

}
