package magic;

/*+++GIOCATORE+++ classe che si occupa di descrivere lo stato del giocatore(vita, mano, mazzo), che inoltre contiene anche operazioni utili 
alla gestione della mano e del mazzo.*/

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
    
    public boolean noInstant(){
        Iterator x = hand.listIterator(0);
        Card f;
        while(x.hasNext()){
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
    
    
    public void addCard(Card e){
        hand.add(e);
    }
    
    
    public int getId(){
        return id;
    }
    
    public int qtVita() {
        return health;
    }
    
    public LinkedList<Card> showInstant(){
        Iterator x = hand.listIterator(0);
        LinkedList<Card> l = new LinkedList<>();
        while(x.hasNext()){
            Card f;
            f = (Card) x.next();
            if("Instant".equals(f.getType()) ){
                l.add(f);
            }
        }
        return l;
    }
    
    public void deckInsert(Card c){
        this.deck.add(c);
    }
    
}
