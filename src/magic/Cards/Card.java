
package magic.Cards;

import magic.Giocatore;
import magic.Stack;


public interface Card {
    public String getName();
    public String getType();
    public String getDescription();
    public void activate(Giocatore g1, Giocatore g2, Stack s);
    
}
