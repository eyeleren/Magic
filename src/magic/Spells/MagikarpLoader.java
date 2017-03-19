
package magic.Spells;

import magic.Board;
import magic.Creatures.Creature;
import magic.Creatures.CreatureMagikarp;
import magic.Giocatore;

/*
Loader (caricatore della creatura sul campo) della creature di debug
*/

public class MagikarpLoader implements Spell{
    
    private Giocatore g;
    
    public MagikarpLoader(Giocatore g){
        this.g = g;
    }
    
    @Override
    public boolean cast(Giocatore g1, Giocatore g2, Board b) {
        System.out.println("Magikarp è stata posizionata sul campo.");
        Creature m = new CreatureMagikarp();
        if(g.getId() == 1)
            b.boardp1.add(m);
        else
            b.boardp2.add(m);
        return false;
    }
    
}
