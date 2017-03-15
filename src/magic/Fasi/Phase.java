 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.Fasi;

import java.io.BufferedReader;
import java.io.IOException;
import magic.Board;
import magic.Giocatore;

/**
 *
 * @author Roberto
 */
public interface Phase {
    public boolean execute(Giocatore giocatore1, Giocatore giocatore2, Board campo, BufferedReader buff) throws IOException;
}
