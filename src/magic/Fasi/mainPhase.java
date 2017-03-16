
package magic.Fasi;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import magic.Board;
import magic.Cards.Card;
import magic.Giocatore;
<<<<<<< Updated upstream
import static magic.Interfaccia.*;
import magic.Stack;

//Tutta da fare
public class mainPhase implements Phase{
    public Stack stack;
    
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
=======
import magic.Stack;
import static magic.Interfaccia;

//Tutta da fare
public class mainPhase implements Phase{
    public Giocatore player1;
    public Giocatore player2;
    public Stack stack;
    
    public boolean passes1 = false;
    public boolean passes2 = false;
    
    

    
    
    
    public void caricaCarta(Giocatore player, int c){
    
    
    }
    
    
    
    
    
    
    
    

    @Override
    public boolean execute(Giocatore player1, Giocatore player2, Board campo) {
        System.out.println(player1.name + "'s Main phase starts");
        System.out.println(player1.name + "'s hand, choose one to play");
        showCards(player1.hand);
        
       
        
        
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> Stashed changes
    }

}
