
package magic.Cards;

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
    public void activate() {
        return;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
