
package magic.Cards;

import magic.Giocatore;
import magic.Spells.Spell;
import magic.Spells.MagikarpLoader;
import magic.Stack;

public class Magikarp implements Card{

    String name;
    String type;
    String description;

    public Magikarp() {
        this.name = "Magikarp";
        this.type = "Creature";
        this.description = "This card does nothing: Splash...";
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
        Spell a = new MagikarpLoader(g1);
        s.addSpell(a);
    }
    
}
