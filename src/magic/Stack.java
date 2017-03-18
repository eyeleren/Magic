
package magic;

import magic.Spells.Spell;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*+++STACK+++ la classe contiene una lista ordinata di spell utile alla risoluzione degli effetti e i suoi metodi*/

public class Stack {
    private LinkedList<Spell> s = new LinkedList<>();
    
    /*Il controllo di cosa viene messo nello stack, in particolare se il primo è un stregoneria o una creatura,
    e che i successivi siano tutto il resto è lasciato alla struttura di funzioni dell'interfaccia che può usare le successive
    funzioni come isEmpty*/
    public void addSpell(Spell c){
        s.push(c);
    }
    
    public boolean isEmpty(){
        return s.isEmpty();
    }
    
    public void delete(Spell e){
        s.remove(e);
    }
    
    public boolean resolveStack(Giocatore g1, Giocatore g2, Board b){
        Spell a;
        boolean loose;
        while(!s.isEmpty()){
            a = s.pop();
            loose = a.cast(g1, g2, b);
            if(loose)
                return loose;
        }
        return false;
    }
}
