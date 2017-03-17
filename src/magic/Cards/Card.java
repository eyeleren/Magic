
package magic.Cards;

import magic.Stack;


public interface Card {
    public String getName();
    public String getType();
    public String getDescription();
    public void activate(Stack s);
    
}
