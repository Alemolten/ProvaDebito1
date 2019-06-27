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
public class ThContaDispari extends Thread{
    DatiCondivisi d ;
    
    public ThContaDispari(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        int posizione = d.getPosizione();
        ArrayList array = d.getNumeriGenerati();
        Object numero = array.get(posizione);
        int n = Integer.parseInt(numero.toString());
        if(n % 2 == 0) {
            
        }
        else {
            int dispari = d.getNumeroDispariLetti();
            dispari = dispari + 1;
            d.setNumeroDispariLetti(dispari);
        }
    }
}
