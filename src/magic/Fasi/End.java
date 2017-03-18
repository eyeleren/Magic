package magic.Fasi;

import java.io.BufferedReader;
import magic.Creatures.Creature;
import java.util.Iterator;
import magic.Board;
import magic.Giocatore;
import magic.Sauron;

/*+++END PHASE+++ durante questa fase le creature del giocatore corrente vengono ripristinate alla salute massima, poi finisce il turno del giocatore*/

public class End implements Phase{
    public Giocatore player;
    public Creature creature;
    public Board b;
    
    
    public End(Board b){
        this.b = b;
    }
    
    public void basevita1(){
        Iterator x = b.boardp1.listIterator(0);
            while(x.hasNext()){
                Creature p;
                p = (Creature) x.next();
                p.regen();
            }      
    }
      
    public void basevita2(){
        Iterator y = b.boardp2.listIterator(0);
        while(y.hasNext()){
            Creature p;
            p = (Creature) y.next();
            p.regen();
        }
    }
    
    public boolean execute(Giocatore giocatore1, Giocatore giocatore2, Board campo, BufferedReader buff){
        this.player = giocatore1;
        System.out.println(giocatore1.name + " inizia la tua End Phase: la difesa delle tue creature viene ripristinata. \n \n");
        if (player.getId() == 1){
            this.basevita1();
            campo.occhio.mainTrigger(Sauron.END);
            return false;
        }
        else{
            this.basevita2();
            campo.occhio.mainTrigger(Sauron.END);
            return false;
        }
    }        
}   
