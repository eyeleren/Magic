package magic;

import Cards.Card;
import Creatures.Creature;
import java.util.LinkedList;
import java.util.List;

//contiene creature e permanenti suddivisi per i due giocatori
public class Board {
    public List<Creature> boardp1 = new LinkedList<Creature>();
    public List<Creature> boardp2 = new LinkedList<Creature>();
}
