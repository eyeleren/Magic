
package magic;

import java.util.LinkedList;
import java.util.List;
import magic.Fasi.Combat;
import magic.Fasi.Draw;
import magic.Fasi.End;
import magic.Fasi.Phase;
import magic.Fasi.Untap;
import magic.Fasi.mainPhase;



public class gestoreFasi{
    public List<Phase> fasi = new LinkedList<Phase>();
    
    private Giocatore g;
    private Board b;
    
    public void setGiocatoreAndBoard(Giocatore a, Board h){
        this.b = h;
        this.g = a;
    }
    
    public boolean phaseCalls(Giocatore g, Board b){
        Phase a;
        boolean r;
        while(!fasi.isEmpty()){
            a = fasi.remove(0);
            r = a.execute(g, b);
            if(!r)
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
    
    public void resetPhaseList(){
        fasi.clear();
        Draw n1 = new Draw();
        Untap n2 = new Untap();
        Combat n3 =  new Combat();
        mainPhase n4 = new mainPhase();
        End n5 = new End();
        fasi.add(n1);
        fasi.add(n2);
        fasi.add(n3);
        fasi.add(n4);
        fasi.add(n5);
    }
}
