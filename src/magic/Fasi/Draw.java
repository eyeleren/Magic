package magic.Fasi;

import java.io.BufferedReader;
import java.io.IOException;
import magic.Board;
import magic.Cards.Card;
import magic.Giocatore;
import static magic.Interfaccia.*;


public class Draw implements Phase{
    public Giocatore player;
    BufferedReader buff;
    
    
    
    
    public void drawCard(BufferedReader buff)throws IOException{
        if(player.lungMazzo() == 0){
            System.out.println(player.name + " hai esaurito le carte del mazzo");
            player.setLooses(true);
        }
        else{
            if(player.lungMano() == 7) {
                player.addCard(player.pescata());
                showCards(player.hand);
                int r;
                System.out.println(player.name + " la tua mano contiene più di 7 carte, scegli una carta da scartare:");
                r = Integer.parseInt(buff.readLine());
                player.hand.remove(r);
            }
            else{
                Card c = player.daPescare();
                System.out.println(player.name + " hai pescato " + c.getName());
                player.addCard(player.pescata());
                
               
            }
        }
    }
    //Sistemare da qui in giù

    public boolean execute(Giocatore giocatore1, Giocatore giocatore2, Board campo, BufferedReader buff) {    
        this.player = giocatore1;
        //fixa
        this.drawCard(buff);
        return player.looses = true;
        
    }
}
