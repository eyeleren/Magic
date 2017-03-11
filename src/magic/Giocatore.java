package magic;

//il giocatore contiene mazzo di carte, mano, hp e nome

import Cards.Card;
import java.util.LinkedList;
import java.util.List;

public class Giocatore {
    public String name;
    public int id;
    public int health;
    public List<Card> deck = new LinkedList<Card>();
    public List<Card> hand = new LinkedList<Card>();
       
}
