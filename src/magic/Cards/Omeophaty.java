
package magic.Cards;

import magic.Giocatore;
import magic.Spells.Spell;
import magic.Spells.loaderOmeophaty;
import magic.Stack;

public class Omeophaty implements Card{

    String name;
    String type;
    String description;

    public Omeophaty() {
        this.name = "Omeophaty";
        this.type = "Instant";
        this.description = "This card does nothing: Magikarp uses Splash, but nothing happens";
    }
    
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void activate(Giocatore g1, Giocatore g2, Stack s) {
        Spell a = new loaderOmeophaty();
        s.addSpell(a);
    }
    
}
