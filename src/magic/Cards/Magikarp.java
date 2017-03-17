
package magic.Cards;

import magic.Spells.Spell;
import magic.Spells.loaderMagikarp;
import magic.Spells.loaderOmeophaty;
import magic.Stack;

public class Magikarp implements Card{

    String name;
    String type;
    String description;

    public Magikarp() {
        this.name = "Magikarp";
        this.type = "Spell";
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
    public void activate(Stack s) {
        Spell a = new loaderMagikarp();
        s.addSpell(a);
    }
    
}
