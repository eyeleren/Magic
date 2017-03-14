
package magic;

import java.io.Console;
import static magic.Interfaccia.*;

public class Magic {

    public static void main(String[] args) {
        //Inserire l'inizializzazione di tutto
        boolean loose;
        int turn;
        String nome1, nome2;
        Giocatore g1 = new Giocatore();
        Giocatore g2 = new Giocatore();
        Board campo = new Board();
        Stack seq = new Stack();
        //Parte dell'interfaccia che fa costruire il mazzo etc
        GestoreFasi Gfasi = new GestoreFasi();
        Gfasi.resetPhaseList(campo);
        //Avvio del gioco
        Console console = System.console();
        if (console == null) {
            System.err.println("No console.");
            System.exit(1);
        }
        System.out.println("Benvenuti in Magic!!!");
        System.out.println("Prego inserire i nomi dei giocatori:");
        nome1 = console.readLine();
        nome2 = console.readLine();
        setPlayers(g1, g2, nome1, nome2);
        loose = false;
        turn = 1;
        while(!loose){
            if(turn == 1){
                turn = 2;
                loose = Gfasi.phaseCalls(g1, campo);
                Gfasi.resetPhaseList(campo);
            }
            else{
                turn = 1;
                loose = Gfasi.phaseCalls(g2, campo);
                Gfasi.resetPhaseList(campo);
            }
        }
        //Termine del gioco con dichiarazione vittoria sconfitta.
        if(turn == 1){
            System.out.println("Congratulazioni!!! Il giocatore" + g1.name + "ha vinto la partita!");
        }
        else{
            System.out.println("Congratulazioni!!! Il giocatore" + g2.name + "ha vinto la partita!");
        }
        System.out.println("Fine del gioco.");
    }
    
}
