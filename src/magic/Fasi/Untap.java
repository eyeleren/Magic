
package magic.Fasi;

import magic.Creatures.Creature;
import magic.Board;
import magic.Giocatore;

import java.util.*;

public class Untap implements Phase{
    public Board b;
    public Giocatore player;
    Iterator x;
    Iterator y;
    public Untap(Board b){
        this.b = b;
        x = b.boardp1.listIterator(0);
        y = b.boardp2.listIterator(0);
    }
    
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
    //Sistemare da qui in giù
    public boolean execute(Giocatore player, Board b){
        if (player.getId() == 1){
            this.detap1();
            return false;
        }
        else{
            this.detap2();
            return false;
        }
    }
}     