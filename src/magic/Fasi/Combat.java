//NON DA IMPLEMENTARE

package magic.Fasi;
import java.io.BufferedReader;
import magic.Board;
import magic.Giocatore;

//Questa classe per quanto riguarda il primo assignment è finita.

public class Combat implements Phase{
    public Giocatore player;

    @Override
    public boolean execute(Giocatore giocatore1, Giocatore giocatore2, Board campo, BufferedReader buff) {
        return false;
    }
}
