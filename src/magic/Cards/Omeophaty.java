
package magic.Cards;

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
    public void activate(Stack s) {
        Spell a = new loaderOmeophaty();
        //if(a != null)
        //  System.out.println("a esiste");
        s.addSpell(a);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
