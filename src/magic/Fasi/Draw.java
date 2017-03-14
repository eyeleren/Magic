package magic.Fasi;

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

    @Override
    public boolean execute(Giocatore giocatore, Board campo) {    
        this.player = giocatore;
        this.drawCard();
        if (player.looses = true){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
