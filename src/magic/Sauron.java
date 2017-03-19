
package magic;

import java.util.LinkedList;

/*++SAURON+++
Si tratta dell'oggetto che effettua la funzione di trigger, si occupa di richieste di notifica in caso di eventi e nel caso essi avvengono avvertire
chi si è registrato.

(Il nome deriva dal signore degli anelli vista la somiglianza tra il personaggio e il fatto che quest'oggetto conosce tutti gli eventi del gioco)
*/

public class Sauron {
    
    //Definizione delle costanti per codificare l'evento: fine della fase
    public static final int DRAW = 1;
    public static final int UNTAP = 2;
    public static final int COMBAT = 3;
    public static final int MAIN = 4;
    public static final int END = 5;
    
    //Vi è una lista di registrazione per ogni fase del gioco, per ciascuna di esse vi sono i metodi per registrarsi e attivare il trigger
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
