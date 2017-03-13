
package magic.Fasi;
import Creatures.Creature;
import magic.Board;
import magic.Giocatore;

import java.util.*;

public class Untap {
    public Board b;
    public Giocatore player;
    
    
    Iterator x = b.boardp1.listIterator(0);
    Iterator y = b.boardp2.listIterator(0);
    
    public void detap1(){
        b.boardp1.get(0).untap();
        while(x.hasNext()){
            Creature p;
            p = (Creature) x.next();
            p.untap();
        }
        
        
    }

    public void detap2(){
        b.boardp2.get(0).untap();
        while(y.hasNext()){
            Creature p;
            p = (Creature) y.next();
            p.untap();
        }
    }
    
    public void execute(){
        if (player.getId() == 1){
            this.detap1();
        }
        else{
            this.detap2();
        }
    }    
        
}     