
package magic;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import magic.Fasi.Combat;
import magic.Fasi.Draw;
import magic.Fasi.End;
import magic.Fasi.Phase;
import magic.Fasi.Untap;
import magic.Fasi.MainPhase;

/*+++GESTORE DELLE FASI+++ Classe che contine i meccanismi di gestione delle fasi di gioco*/

public class GestoreFasi {
    public List<Phase> fasi = new LinkedList<>();
    
    /*Funzione fondamentale sfruttata dal main (gestore dei turni) per chiamare la sequenza di fasi del turno di un giocatore, questa sequenza è data da una lista modificabile*/
    public boolean phaseCalls(Giocatore g1, Giocatore g2, Board b, BufferedReader buff) throws IOException{
        Phase a;
        boolean r;
        while(!fasi.isEmpty()){
            a = fasi.remove(0);
            r = a.execute(g1, g2, b, buff);
            if(r)
                return true;
        }
        return false;
    }
    
    public void addPhase(Phase e, int position){
        fasi.add(position, e);
    }
    
    public void removePhase(int position){
        fasi.remove(position);
    }
    
    /*Funzione fondamentale che al termine di un turno resetta la lista secondo l'ordine normale del gioco*/
    public void resetPhaseList(Board board){
        fasi.clear();
        Draw n1 = new Draw();
        Untap n2 = new Untap(board);
        Combat n3 =  new Combat();
        MainPhase n4 = new MainPhase();
        End n5 = new End(board);
        fasi.add(n1);
        fasi.add(n2);
        fasi.add(n3);
        fasi.add(n4);
        fasi.add(n5);
    }
}
