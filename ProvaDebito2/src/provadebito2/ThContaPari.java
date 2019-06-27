/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provadebito2;
import java.util.*;

/**
 *
 * @author CorsiMariano
 */
public class ThContaPari extends Thread{
    DatiCondivisi d;
    
    public ThContaPari(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        int posizione = d.getPosizione();
        ArrayList array = d.getNumeriGenerati();
        Object numero = array.get(posizione);
        int n = Integer.parseInt(numero.toString());
        if(n != 0) {
            if(n % 2 == 0) {
                int pari = d.getNumeroPariLetti();
                pari = pari +1;
                d.setNumeroPariLetti(pari);
            }
        }
        else {
            int zero = d.getNumeroZero();
            zero = zero + 1;
            d.setNumeroZero(zero);
        }
    }
}
