
package magic.Fasi;

import java.io.BufferedReader;
import java.io.IOException;
import magic.Board;
import magic.Giocatore;

import static magic.Interfaccia.*;
import magic.Stack;

//Tutta da fare
public class mainPhase implements Phase{
    public Stack stack;
    public Giocatore player1;
    public Giocatore player2;
    public boolean passes1 = false;
    public boolean passes2 = false;
    
    public void mainPhase(){
        this.stack = new Stack();
    }
    
    @Override
    public boolean execute(Giocatore giocatore1, Giocatore giocatore2, Board campo, BufferedReader buff) throws IOException {
        boolean l;
        System.out.println(giocatore1.name + " la tua main phase è iniziata");
        chargeStack(giocatore1, giocatore2, campo, buff, stack);
        System.out.println("Fine del caricamento dello stack, ora verrà risolto.");
        l =  stack.resolveStack();
        return l;
    }
}
