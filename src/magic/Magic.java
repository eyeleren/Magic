
package magic;

public class Magic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inserire linizializzazione di tutto
        boolean loose;
        int turn;
        Giocatore g1 = new Giocatore();
        Giocatore g2 = new Giocatore();
        Board campo = new Board();
        Stack seq = new Stack();
        //Parte dell'interfaccia che fa costruire il mazzo etc
        gestoreFasi Gfasi = new gestoreFasi();
        
        //Avvio del gioco
        loose = false;
        turn = 1;
        while(!loose){
            if(turn == 1){
                turn = 2;
                loose = Gfasi.phaseCalls(g1, campo);
                Gfasi.resetPhaseList();
            }
            else{
                turn = 1;
                loose = Gfasi.phaseCalls(g2, campo);
                Gfasi.resetPhaseList();
            }
        }
        //Termine del gioco con dichiarazione vittoria sconfitta.
    }
    
}
