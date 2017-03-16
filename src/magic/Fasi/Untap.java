
package magic.Fasi;

import java.io.BufferedReader;
import magic.Creatures.Creature;
import magic.Board;
import magic.Giocatore;

import java.util.*;

public class Untap implements Phase{
    public Board b;
    Iterator x;
    Iterator y;
    public Untap(Board b){
        this.b = b;
        x = b.boardp1.listIterator(0);
        y = b.boardp2.listIterator(0);
    }
    
    public void detap1(){
        while(x.hasNext()){
            Creature p;
            p = (Creature) x.next();
            p.untap();
        }
    }

    public void detap2(){
        while(y.hasNext()){
            Creature p;
            p = (Creature) y.next();
            p.untap();
        }
    }
    
    public boolean execute(Giocatore giocatore1, Giocatore giocatore2, Board campo, BufferedReader buff){
        System.out.println(giocatore1.name + " untap phase, le tue creature sono state stappate");
        if (giocatore1.getId() == 1){
            this.detap1();
            return false;
        }
        else{
            this.detap2();
            return false;
        }
    }
}