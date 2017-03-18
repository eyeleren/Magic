package magic;

import magic.Creatures.Creature;
import java.util.LinkedList;
import java.util.*;
import magic.Spells.Spell;

/*+++BOARD+++ contiene creature e permanenti suddivisi per i due giocatori e l'occhio che vede tutto (trigger)*/

public class Board {
    public int turn;
    public LinkedList<Creature> boardp1;
    public LinkedList<Creature> boardp2;
    public LinkedList<Spell> perma1;
    public LinkedList<Spell> perma2;
    public Sauron occhio;
    
    public Board(){
        boardp1 = new LinkedList<>();
        boardp2 = new LinkedList<>();
        perma1 = new LinkedList<>();
        perma2 = new LinkedList<>();
        occhio = new Sauron();
    }
}
