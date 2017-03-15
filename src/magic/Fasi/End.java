package magic.Fasi;

import java.io.BufferedReader;
import magic.Creatures.Creature;
import java.util.Iterator;
import magic.Board;
import magic.Giocatore;

public class End implements Phase{
    public Giocatore player;
    public Creature creature;
    public Board b;
    
    Iterator x;
    Iterator y;
    
    public End(Board b){
        this.b = b;
        x = b.boardp1.listIterator(0);
        y = b.boardp2.listIterator(0);
    }
    
    public void basevita1(){
        b.boardp1.get(0).regen();
            while(x.hasNext()){
                Creature p;
                p = (Creature) x.next();
                p.regen();
            //p.setAttack(p.getOriginAttack()); DA METTERE NEL CODICE DEL BUFF/DEBUFF
            //p.setDefense(p.getOriginDefense()); DA METTERE NEL CODICE DEL BUFF/DEBUFF
            }      
    }
      
    public void basevita2(){
        b.boardp2.get(0).regen();
        while(y.hasNext()){
            Creature p;
            p = (Creature) y.next();
            p.regen();
            //p.setAttack(p.getOriginAttack()); DA METTERE NEL CODICE DEL BUFF/DEBUFF
            //p.setDefense(p.getOriginDefense()); DA METTERE NEL CODICE DEL BUFF/DEBUFF
        }
        
    }
    
    public boolean execute(Giocatore giocatore1, Giocatore giocatore2, Board campo, BufferedReader buff){
        this.player = giocatore1;
        if (player.getId() == 1){
            this.basevita1();
            return false;
        }
        else{
            this.basevita2();
            return false;
        }
    }        
}   
