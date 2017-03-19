
package magic.Cards;

import magic.Giocatore;
import magic.Stack;

/*
Interfaccia che specifica i metodi in comune di tutte le carte.
*/

public interface Card {
    public String getName();
    public String getType();
    public String getDescription();
    public void activate(Giocatore g1, Giocatore g2, Stack s);
    
}
