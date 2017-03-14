package magic;

//il giocatore contiene mazzo di carte, mano, hp e nome

import Cards.Card;
import java.util.LinkedList;
import java.util.List;

public class Giocatore {
    public String name;
    public int id;
    public int health;
    public boolean looses = false;
    public List<Card> deck = new LinkedList<>();
    public List<Card> hand = new LinkedList<>();
    
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
    
    public Card pescata(){
        return deck.remove(0);
    }
    
    public void addCard(Card e){
        hand.add(e);
    }
    
    //modificata dall'input via terminale
    public int scartaCarta(){
        return 0;
    }
    
    public int getId(){
        return id;
    }
    
    public int qtVita() {
        return health;
    }
}
