
package magic.Fasi;

import Creatures.Creature;
import magic.Board;
import magic.Giocatore;

import java.util.*;

public class Untap implements Phase{
    public Board b;
    public Giocatore player;
    
    Iterator x = b.boardp1.listIterator(0);
    Iterator y = b.boardp2.listIterator(0);
    /*Non so esattamente come funziona, per quanto riguarda gli errori sistemate anche al fine di dare
    di ritorno il valore di execute che porta a sapere se il giocatore ha perso*/
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
        this.player = player;
        if (player.getId() == 1){
            this.detap1();
            return false;
        }
        else{
            this.detap2();
            return false;
        }
    }

   // @Override
    //public boolean execute(Giocatore giocatore, Board campo) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}     