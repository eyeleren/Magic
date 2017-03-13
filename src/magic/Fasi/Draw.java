package magic.Fasi;
import magic.Giocatore;

public class Draw {
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
}
