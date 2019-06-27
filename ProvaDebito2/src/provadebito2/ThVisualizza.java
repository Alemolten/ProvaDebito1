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
public class ThVisualizza extends Thread{
    DatiCondivisi d;
    
    public ThVisualizza(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        int pariI = d.getNumeroPariInseriti();
        System.out.println("Numero pari inseriti" + pariI);
        int dispariI = d.getNumeroDispariInseriti();
        System.out.println("Numero dispari inseriti" + dispariI);
        int pariL = d.getNumeroPariLetti();
        System.out.println("Numero pari letti" + pariL);
        int dispariL = d.getNumeroDispariLetti();
        System.out.println("Numero dispari letti" + dispariL);
    }
}
