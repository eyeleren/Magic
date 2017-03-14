
package magic;

import Spell.Spell;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//lista ordinata di spell per la risoluzione degli effetti
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
    
    /*Funzione per avere una visione di ciò che è stato caricato nello stack, non funzia*/
    public List<Spell> view(){
        List<Spell> vista = new ArrayList<>(s);
        return vista;
    }
    
    public void resolveStack(){
        Spell a;
        while(!s.isEmpty()){
            a = s.pop();
            a.cast();
        }
    }
}
