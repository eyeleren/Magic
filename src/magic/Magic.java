
package magic;

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
        gestoreFasi Gfasi = new gestoreFasi();
        Gfasi.resetPhaseList();
        //Avvio del gioco
        System.out.println("Benvenuti in Magic!!!");
        System.out.println("Prego inserire i nomi dei giocatori:");
        nome1 = ;
        nome2 = ;
        setPlayers(g1, g2, nome1, nome2);
        loose = false;
        turn = 1;
        while(!loose){
            if(turn == 1){
                turn = 2;
                loose = Gfasi.phaseCalls(g1, campo);
                Gfasi.resetPhaseList();
            }
            else{
                turn = 1;
                loose = Gfasi.phaseCalls(g2, campo);
                Gfasi.resetPhaseList();
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
