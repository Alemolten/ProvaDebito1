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
public class ThGenera extends Thread{
    DatiCondivisi d;
    
    public ThGenera(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        Random r = new Random();
        int nGenerato;
        nGenerato = r.nextInt(37);
        ArrayList array = d.getNumeriGenerati();
        array.add(nGenerato);
        d.setNumeriGenerati(array);
        if(nGenerato != 0) {
            if(nGenerato % 2 == 0) {
                int pari = d.getNumeroPariInseriti();
                pari = pari + 1;
                d.setNumeroPariInseriti(pari);
            }
            else {
                int dispari = d.getNumeroDispariInseriti();
                dispari = dispari + 1;
                d.setNumeroDispariInseriti(dispari);
            }   
        }
    }
}
