
package magic;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import magic.Cards.Card;
import magic.Cards.Omeophaty;

public class Interfaccia {
    public static void setPlayers(Giocatore g1, Giocatore g2, String name1, String name2){
        g1.name = name1;
        g2.name = name2;
        g1.health = 10;
        g2.health = 10;
        g1.id = 1;
        g2.id = 2;
    }
    
    public static void createOriginalDeck(LinkedList l){
        Card c1 = new Omeophaty();
        l.add(c1);
    }
    
    public static void showCards(LinkedList<Card> c){
        Iterator a = c.listIterator(0);
        int i = 1;
        String temp;
        temp = c.get(0).getName();
        System.out.print("(" + i + ") " + temp + ", ");
        Card p;
        while(a.hasNext()){
            p = (Card) a.next();
            temp = p.getName();
            i++;
            System.out.print("(" + i + ") " + temp + ", ");
        }
        System.out.println("\n");
    }
    
    public static void chargeStack(Giocatore giocatore1, Giocatore giocatore2, Board campo, BufferedReader buff, Stack stack) throws IOException{
        int chosen;
        Card c;
        boolean passes1 = false;
        boolean passes2 = false;
        boolean empty = false; //Se uno dei due giocatori non può giocare istantanee.
        int turn = 2;
        System.out.println(giocatore1.name + " scegli una carta da giocare");
        showCards(giocatore1.hand);
        chosen = Integer.parseInt(buff.readLine());
        c = giocatore1.hand.remove(chosen);
        c.activate(stack);
        empty = giocatore2.noIstant(); //se il giocatore 2 non ha istantanee allora neanche gli chiedo
        while((!passes1 || !passes2) && !empty){
            if(turn == 1 && !passes1){
                turn = 2;
                System.out.println(giocatore2.name + " vuoi passare? Se si allora numero negativo");
                //fa vedere quali sono le carte istantanee che si possono giocare --> funzione dedicata
                if(chosen >= 0){
                    chosen = Integer.parseInt(buff.readLine());
                    c = giocatore2.hand.remove(chosen);
                    c.activate(stack);
                }
                else{
                    passes1 = true;
                }
                empty = giocatore1.noIstant();
            }
            else if(!passes2){
                turn = 1;
                System.out.println(giocatore1.name + " vuoi passare? Se si allora numero negativo");
                //fa vedere quali sono le carte istantanee che si possono giocare --> funzione dedicata
                if(chosen >= 0){
                    chosen = Integer.parseInt(buff.readLine());
                    c = giocatore1.hand.remove(chosen);
                    c.activate(stack);
                }
                else{
                    passes2 = true;
                }
                empty = giocatore2.noIstant();
            }
        }
    }
    
    public static void setDeck(Giocatore g, LinkedList carte, BufferedReader buff) throws IOException{
        int choosen;
        System.out.println("Inizio preparazione del mazzo del giocatore: " + g.name);
        System.out.println("Queste sono le carte disponibili:");
        for(int i = 20; i > 0; i--){
            showCards(carte);
            System.out.println("Ti restano " + i + "carte da scegliere");
            System.out.println("Scegli una carta");
            choosen = Integer.parseInt(buff.readLine());
            //In base al numero scelto bisogna aggiungere al mazzo di g la carta di indice choosen
        }
        System.out.println("Preparazione mazzo personalizzato completata.");
    }
}
