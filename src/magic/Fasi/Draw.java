package magic.Fasi;

import java.io.BufferedReader;
import magic.Board;
import magic.Giocatore;

public class Draw implements Phase{
    public Giocatore player;
    
    public void drawCard(){
        if(player.lungMazzo() == 0){
            player.setLooses(true);
        }
        else{
            if(player.lungMano() == 7) {
                player.addCard(player.pescata());
                
                player.hand.remove(player.scartaCarta());
            }
            else{
                player.addCard(player.pescata());
            }
        }
    }
    //Sistemare da qui in giù

    public boolean execute(Giocatore giocatore1, Giocatore giocatore2, Board campo, BufferedReader buff) {    
        this.player = giocatore1;
        this.drawCard();
        return player.looses = true;
        
    }
}
