
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
    
    public void phaseCalls(){
        Phase a;
        while(!fasi.isEmpty()){
            a = fasi.remove(0);
            a.execute();
        }
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
        fasi.add((Phase) n1);
        fasi.add((Phase) n2);
        fasi.add((Phase) n3);
        fasi.add((Phase) n4);
        fasi.add((Phase) n5);
    }
}
