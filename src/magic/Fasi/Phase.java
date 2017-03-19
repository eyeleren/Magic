
package magic.Fasi;

import java.io.BufferedReader;
import java.io.IOException;
import magic.Board;
import magic.Giocatore;

/*
Interfaccia che specifica il metodo execute in comune a tutte le fasi: questo metodo è fondamentale perchè è quello chiamato dal gestore delle fasi, una fase per essere eseguita
deve avere execute.
*/

public interface Phase {

    public boolean execute(Giocatore giocatore1, Giocatore giocatore2, Board campo, BufferedReader buff) throws IOException;

}
