
package magic;

import java.util.LinkedList;

/*++SAURON+++*/

public class Sauron {
    
    public static final int DRAW = 1;
    public static final int UNTAP = 2;
    public static final int COMBAT = 3;
    public static final int MAIN = 4;
    public static final int END = 5;
    
    LinkedList<TriggerElement> DrawTriggers;
    LinkedList<TriggerElement> UntapTriggers;
    LinkedList<TriggerElement> CombatTriggers;
    LinkedList<TriggerElement> MainTriggers;
    LinkedList<TriggerElement> EndTriggers;
    
    public Sauron(){
        DrawTriggers = new LinkedList<>();
        UntapTriggers = new LinkedList<>();
        CombatTriggers = new LinkedList<>();
        MainTriggers = new LinkedList<>();
        EndTriggers = new LinkedList<>();
    }
    
    public void drawRegister(int eventCode, TriggerElem e){
        TriggerElement e1 = new TriggerElement(eventCode, e);
        DrawTriggers.add(e1);
    }
    
    public void untapRegister(int eventCode, TriggerElem e){
        TriggerElement e1 = new TriggerElement(eventCode, e);
        UntapTriggers.add(e1);
    }
    
    public void combatRegister(int eventCode, TriggerElem e){
        TriggerElement e1 = new TriggerElement(eventCode, e);
        CombatTriggers.add(e1);
    }
    
    public void mainRegister(int eventCode, TriggerElem e){
        TriggerElement e1 = new TriggerElement(eventCode, e);
        MainTriggers.add(e1);
    }
    
    public void endRegister(int eventCode, TriggerElem e){
        TriggerElement e1 = new TriggerElement(eventCode, e);
        EndTriggers.add(e1);
    }
    
    public void drawTrigger(int code){
        for(int i = DrawTriggers.size()-1; i >= 0; i--){
            TriggerElement t = DrawTriggers.get(i);
            if(t.eventCode == code){
                t.link.activate();
                DrawTriggers.remove(i);
            }
        }
    }
    
    public void untapTrigger(int code){
        for(int i = UntapTriggers.size()-1; i >= 0; i--){
            TriggerElement t = UntapTriggers.get(i);
            if(t.eventCode == code){
                t.link.activate();
                UntapTriggers.remove(i);
            }
        }
    }
    
    public void combatTrigger(int code){
        for(int i = CombatTriggers.size()-1; i>=0; --i){
            TriggerElement t = CombatTriggers.get(i);
            if(t.eventCode == code){
                t.link.activate();
                CombatTriggers.remove(i);
            }
        }
    }
    
    public void mainTrigger(int code){
        for(int i = MainTriggers.size()-1; i>=0; --i){
            TriggerElement t = MainTriggers.get(i);
            if(t.eventCode == code){
                t.link.activate();
                MainTriggers.remove(i);
            }
        }
    }
    
    public void endTrigger(int code){
        for(int i = EndTriggers.size()-1; i>=0; --i){
            TriggerElement t = EndTriggers.get(i);
            if(t.eventCode == code){
                t.link.activate();
                EndTriggers.remove(i);
            }
        }
    }
}
