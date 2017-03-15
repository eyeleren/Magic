
package magic;

import java.io.BufferedReader;
import java.io.IOException;

public class Interfaccia {
    public static void setPlayers(Giocatore g1, Giocatore g2, String name1, String name2){
        g1.name = name1;
        g2.name = name2;
        g1.health = 10;
        g2.health = 10;
        g1.id = 1;
        g2.id = 2;
    }
    
    public static void setDeck(Giocatore g, BufferedReader buff) throws IOException{
        int choosen;
        System.out.println("Inizio preparazione del mazzo del giocatore: " + g.name);
        System.out.println("Queste sono le carte disponibili:");
        //Funzione che deve mostrare la lista di tutte le carte esistenti
        for(int i = 20; i > 0; i--){
            System.out.println("Ti restano " + i + "carte da scegliere");
            System.out.println("Scegli una carta");
            choosen = Integer.parseInt(buff.readLine());
            //In base al numero scelto bisogna aggiungere al mazzo di g la carta di indice choosen
        }
        System.out.println("Preparazione mazzo personalizzato completata.");
    }
}
