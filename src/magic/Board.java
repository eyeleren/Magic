package magic;

import magic.Creatures.Creature;
import java.util.LinkedList;
import java.util.*;
import magic.Spells.Spell;

/*+++BOARD+++ contiene creature e permanenti suddivisi per i due giocatori e l'occhio che vede tutto (trigger)*/

public class Board {
    public int turn;
    public List<Creature> boardp1 = new LinkedList<>();
    public List<Creature> boardp2 = new LinkedList<>();
    public List<Spell> perma1 = new LinkedList<>();
    public List<Spell> perma2 = new LinkedList<>();
    public Sauron occhio = new Sauron();
    
    
    
    public LinkedList<Creature> effect1(){
        LinkedList<Creature> res = null;
        Iterator x = boardp1.listIterator(0);
        while(x.hasNext()){
            Creature cr = (Creature) x.next();
            if(cr.hasEffect() && cr.isTapped()){
                res.add(cr);
            }
        }
        return res;
    }
    
     public LinkedList<Creature> effect2(){
        LinkedList<Creature> res = null;
        Iterator x = boardp2.listIterator(0);
        while(x.hasNext()){
            Creature cr = (Creature) x.next();
            if(cr.hasEffect() && cr.isTapped()){
                res.add(cr);
            }
        }
        return res;
    }
    
}
