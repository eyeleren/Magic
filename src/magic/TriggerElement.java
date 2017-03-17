
package magic;

public class TriggerElement{
        public int eventCode; 
        public TriggerElem link;
        public TriggerElement(int code, TriggerElem permanentSpell){
            eventCode = code;
            link = permanentSpell;
        }
}
