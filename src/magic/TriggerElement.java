
package magic;

/*
Questa classe definisce la struttura degli elementi delle liste di trigger: per ciascuno di essi deve essere inserito, al fine di registrarsi, il codice dell'evento
per il quale deve essere attivato l'effetto e il link al metodo che svolge l'effetto.
*/

public class TriggerElement{
        public int eventCode; 
        public TriggerElem link;
        public TriggerElement(int code, TriggerElem permanentSpell){
            eventCode = code;
            link = permanentSpell;
        }
}
