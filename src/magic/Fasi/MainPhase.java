
package magic.Fasi;

import java.io.BufferedReader;
import java.io.IOException;
import magic.Board;
import magic.Giocatore;

import static magic.Interfaccia.*;
import magic.Sauron;
import magic.Stack;

/*+++MAIN PHASE+++ durante la main phase il giocatore corrente sceglie una carta da giocare, che viene caricata nello stack per la risoluzione, 
successivamente viene data all'altro giocatore la possiblità di rispondere con un'istantanea, a sua volta anche il giocatore corrente potrà rispondere, 
sempre con un istantanea, la phase termina con la risoluzione delle spell nello stack, quando entrambi i giocatori passano la possibilità di rispondere.
Alcuni metodi di questa classe appartengono alla classe interfaccia, dato che c'è bisogno di gestire operazioni di i/o riguardanti la scelta delle carte.*/


public class MainPhase implements Phase{
    public Stack stack;
    public boolean passes1 = false;
    public boolean passes2 = false;
    
    public MainPhase(){
        this.stack = new Stack();
    }
    
    @Override
    public boolean execute(Giocatore giocatore1, Giocatore giocatore2, Board campo, BufferedReader buff) throws IOException {
        boolean l;
        System.out.println(giocatore1.name + " la tua Main Phase è iniziata.");
        chargeStack(giocatore1, giocatore2, campo, buff, stack);
        System.out.println("Fine del caricamento dello stack, ora verrà risolto.");
        l = stack.resolveStack(giocatore1, giocatore2, campo);
        campo.occhio.mainTrigger(Sauron.MAIN);
        return l;
    }
}
