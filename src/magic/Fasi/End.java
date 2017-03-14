package magic.Fasi;

import Creatures.Creature;
import java.util.Iterator;
import magic.Board;
import magic.Giocatore;
import java.util.*;

public class End implements Phase{
    public Giocatore player;
    public Creature creature;
    public Board b;
    
    Iterator x = b.boardp1.listIterator(0);
    Iterator y = b.boardp2.listIterator(0);

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
    
    //Sistemare da qui in giù
    public void execute(){
        if (player.getId() == 1){
            this.basevita1();
        }
        else{
            this.basevita2();
        }
    }    

    @Override
    public boolean execute(Giocatore giocatore, Board campo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}   
