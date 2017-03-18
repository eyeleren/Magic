
package magic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import magic.Cards.Card;
import static magic.Interfaccia.*;

/*+++CLASSE MAGIC+++ contiene il main e la struttura di gioco*/

public class Magic {

    public static void main(String[] args) throws IOException {
        //Inizializzazione di tutto ;)
        boolean loose;
        String nome1, nome2;
        Giocatore g1 = new Giocatore();
        Giocatore g2 = new Giocatore();
        Board campo = new Board();
        GestoreFasi Gfasi = new GestoreFasi();
        Gfasi.resetPhaseList(campo);
        LinkedList<Card> carte = new LinkedList<>();
        createOriginalDeck(carte); //Creazione della lista di tutte le carte esistenti.
        //Avvio del gioco
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("  __  __             _      \n" +
" |  \\/  |           (_)     \n" +
" | \\  / | __ _  __ _ _  ___ \n" +
" | |\\/| |/ _` |/ _` | |/ __|\n" +
" | |  | | (_| | (_| | | (__ \n" +
" |_|  |_|\\__,_|\\__, |_|\\___|\n" +
"                __/ |       \n" +
"               |___/      ");
        System.out.println("Prego inserire i nomi dei giocatori:");
        nome1 = buff.readLine();
        nome2 = buff.readLine();
        //Parte dell'interfaccia che fa costruire il mazzo etc
        setPlayers(g1, g2, nome1, nome2); //Inizializzazione dei valori fondamentali dei giocatori
        //Inizializzazione (preparazione da parte dei giocatori) dei mazzi
        setDeck(g1, carte, buff);
        setDeck(g2, carte, buff);
        Collections.shuffle(g1.deck);
        Collections.shuffle(g2.deck);
        //Inizializzazione delle mani dei giocatori: bigona farli pescare 5 carte ciascuno
        newHand(g1);
        newHand(g2);
        loose = false;
        campo.turn = 1;
        while(!loose){
            if(campo.turn == 1){
                System.out.println("Inizio del turno di " + g1.name + ".");
                campo.turn = 2;
                loose = Gfasi.phaseCalls(g1, g2, campo, buff);
                Gfasi.resetPhaseList(campo);
            }
            else{
                System.out.println("Inizio del turno di " + g2.name + ".");
                campo.turn = 1;
                loose = Gfasi.phaseCalls(g2, g1, campo, buff);
                Gfasi.resetPhaseList(campo);
            }
        }
        //Termine del gioco con dichiarazione vittoria sconfitta.
        if(g2.looses == true){
            System.out.println("__  __                        _       __\n" +
"\\ \\/ /___  __  __   _      __(_)___  / /\n" +
" \\  / __ \\/ / / /  | | /| / / / __ \\/ / \n" +
" / / /_/ / /_/ /   | |/ |/ / / / / /_/  \n" +
"/_/\\____/\\__,_/    |__/|__/_/_/ /_(_)   \n" +
"                                        "+"\nIl giocatore " + g1.name + " ha vinto la partita!");
        }
        else{
            System.out.println("__  __                        _       __\n" +
"\\ \\/ /___  __  __   _      __(_)___  / /\n" +
" \\  / __ \\/ / / /  | | /| / / / __ \\/ / \n" +
" / / /_/ / /_/ /   | |/ |/ / / / / /_/  \n" +
"/_/\\____/\\__,_/    |__/|__/_/_/ /_(_)   \n" +
"                                        "+ "\nIl giocatore " + g2.name + " ha vinto la partita!");
        }
        System.out.println("Fine del gioco.");
    }
}
