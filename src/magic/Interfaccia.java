
package magic;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import magic.Cards.Card;
import magic.Cards.Magikarp;
import magic.Cards.Omeophaty;
import magic.Creatures.Creature;


/*+++CLASSE INTERFACCIA+++ gestisce varie operazioni legate a standard input/output*/

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
        Card c2 = new Magikarp();
        l.add(c1);
        l.add(c2);
    }
    
    public static void showCards(LinkedList<Card> c){
        Iterator a = c.listIterator(0);
        int i = 1;
        String temp;
        Card p;
        while(a.hasNext()){
            p = (Card) a.next();
            temp = p.getName();
            System.out.print("(" + i + ") " + temp + ", ");
            i++;
        }
        System.out.println("\n");
    }
    
    public static void showInstants(LinkedList<Card> c, LinkedList<Creature> c2){
        Iterator a = c.listIterator(0);
        Iterator b = c2.listIterator(0);
        int i = 1;
        String temp;
        Card p;
        Creature p2;
        while(a.hasNext()){
            p = (Card) a.next();
            temp = p.getName();
            System.out.print("(" + i + ") " + temp + ", ");
            i++;
        }
        while(b.hasNext()){
            p2 = (Creature) b.next();
            temp = p2.getName();
            System.out.print("(" + i + ") " + temp + ", ");
            i++;
        }
        System.out.println("\n");
    }
    
    public static void chargeStack(Giocatore giocatore1, Giocatore giocatore2, Board campo, BufferedReader buff, Stack stack) throws IOException{
        int chosen;
        Card c;
        boolean passes1 = false;
        boolean passes2 = false;
        boolean empty = false; //Se uno dei due giocatori non può giocare istantanee.
        int turn = 1;
        System.out.println(giocatore1.name + " scegli una carta da giocare, 0 o un numero negativo per saltare la fase.");
        LinkedList<Creature> creatures1 = new LinkedList<>();
        LinkedList<Creature> creatures2 = new LinkedList<>();
        if(giocatore1.getId() == 1){
            creatures1 = campo.effect1();
            creatures2 = campo.effect2();
        }
        else{
            creatures2 = campo.effect1();
            creatures1 = campo.effect2();
        }
        showInstants(giocatore1.hand, creatures1);
        chosen=0;        
        do{
            try{
                chosen = Integer.parseInt(buff.readLine());
            }
            catch(NumberFormatException e){
                    System.out.println("Non hai scelto una carta valida, prova di nuovo.");
                    chosen = giocatore1.hand.size() + 1;
            }
        }while(chosen > giocatore1.hand.size());
        if(chosen - 1 < 0)
            return;
        //completare
        c = giocatore1.hand.remove(chosen -1);
        c.activate(stack);
        empty = giocatore2.noInstant(); //se il giocatore 2 non ha istantanee allora neanche gli chiedo
        while((!passes1 && !passes2) && !empty){
            if(turn==1){
                turn++;
            }
            else{
                turn--;
            }
            if(turn == 1 && !passes1){
                System.out.println(giocatore1.name + " vuoi rispondere con un'istantanea? ");
                System.out.println("Inserisci un numero negativo o 0 per passare, ");
                System.out.println("altrimenti scegli un'istantanea da giocare.");
                LinkedList inst1 = giocatore1.showInstant();
                showInstants(inst1, creatures1);
                //completare
                do{
                    try{
                        chosen = Integer.parseInt(buff.readLine());
                    }
                    catch(NumberFormatException e){
                        System.out.println("Non hai scelto una carta valida, prova di nuovo.");
                        chosen = giocatore1.hand.size() + 1;
                    }
                }while(chosen > giocatore1.hand.size());
                if(chosen >= 0){
                    if(chosen-1 >= 0){
                        int sc = giocatore1.hand.indexOf(inst1.remove(chosen-1));
                        c = giocatore1.hand.remove(sc);
                        c.activate(stack);
                    }
                    else{
                        passes1 = true;
                    }
                }
                else{
                    passes1 = true;
                }
                empty = giocatore1.noInstant();
            }
            else if(!passes2){
                System.out.println(giocatore2.name + " vuoi rispondere con un'istantanea? ");
                System.out.println(giocatore2.name + " inserisci un numero negativo o 0 per passare, ");
                System.out.println("altrimenti scegli un'istantanea da giocare.");
                LinkedList inst2 = giocatore2.showInstant();
                showInstants(inst2, creatures2);
                //comnpletare
                do{
                    try{
                        chosen = Integer.parseInt(buff.readLine());
                    }
                    catch(NumberFormatException e){
                        System.out.println("Non hai scelto una carta valida, prova di nuovo.");
                        chosen = giocatore2.hand.size() + 1;
                    }
                }while(chosen > giocatore2.hand.size());
                if(chosen >= 0){
                    if(chosen-1 >= 0){
                        int sc = giocatore2.hand.indexOf(inst2.remove(chosen-1));
                        c = giocatore2.hand.remove(sc);
                        c.activate(stack);
                    }
                    else{
                        passes2 = true;
                    }
                }
                else{
                    passes2 = true;
                }
                empty = giocatore2.noInstant();
            }
        }
    }
    
    public static void setDeck(Giocatore g, LinkedList carte, BufferedReader buff) throws IOException{
        int choosen;
        System.out.println("Inizio preparazione del mazzo del giocatore: " + g.name );
        System.out.println("Queste sono le carte disponibili:");
        for(int i = 6; i > 0; i--){
            choosen = 0;
            showCards(carte);
            System.out.println("Ti restano " + i + " carte da scegliere.");
            System.out.println("Scegli una carta, 0 per chiedere la descrizione:");
            while(choosen > carte.size() || choosen < 1){
                System.out.println("Carta n°:");
                try{
                    choosen = Integer.parseInt(buff.readLine());
                }
                catch(NumberFormatException e){
                    System.out.println("Scegli una carta, stavolta una che esiste, grazie.");
                }
                if(choosen == 0){
                    System.out.println("Inserisci il numero della carta di cui vuoi leggere la descrizione:");
                    try{
                        choosen = Integer.parseInt(buff.readLine());
                    }
                    catch(NumberFormatException e){
                        System.out.println("Input non valido");
                    }
                    if(choosen > 0){
                        Card c;
                        c = (Card) carte.get(choosen-1);
                        System.out.println(c.getName() + "  " + c.getType() + "  " + c.getDescription());
                    }
                    i++;
                }
            }
            g.deckInsert((Card) carte.get(choosen-1));
        }
        System.out.println("Preparazione mazzo personalizzato completata.\n");
    }
    
    public static void newHand(Giocatore g){
        for(int i=0; i<5; i++)
            g.addCard(g.pescata());
    }
}
