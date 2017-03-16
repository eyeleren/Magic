package magic;

//il giocatore contiene mazzo di carte, mano, hp e nome

import java.util.Iterator;
import magic.Cards.Card;
import java.util.LinkedList;


public class Giocatore {
    public String name;
    public int id;
    public int health;
    public boolean looses = false;
    public LinkedList<Card> deck = new LinkedList<>();
    public LinkedList<Card> hand = new LinkedList<>();
    Iterator x = hand.listIterator(0);
    
    public boolean getLooses(){
        return looses;
    }
    
    public void setLooses(boolean l){
        this.looses = l;
    }
    
    
    public int lungMano(){
        return hand.size();
        }
    
    public int lungMazzo(){
        return deck.size();
    }
    
    //fatto
    public boolean noInstant(){
        while(x.hasNext()){
            Card f;
            f = (Card) x.next();
            if("Instant".equals(f.getType()) ){
                return false;
            }
        }
        return true;
    }
    
    public Card pescata(){
        return deck.remove(0);
    }
    
    public Card daPescare(){
        return deck.peek();
    }
    
    public void addCard(Card e){
        hand.add(e);
    }
    
    /*//modificata dall'input via terminale
    public int scartaCarta(){
        return 0;
    }*/
    
    public int getId(){
        return id;
    }
    
    public int qtVita() {
        return health;
    }
}
