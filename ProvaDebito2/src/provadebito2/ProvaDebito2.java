/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provadebito2;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CorsiMariano
 */
public class ProvaDebito2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi d = new DatiCondivisi();
        ThGenera thG = new ThGenera(d);
        ThContaPari thCP = new ThContaPari(d);
        ThContaDispari thCD = new ThContaDispari(d);
        ThVisualizza thV = new ThVisualizza(d);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il numero di elementi da generare");
        int nGenerare = input.nextInt();
        d.setNumeroElementi(nGenerare);
        
        thG.start();
        thCP.start();
        thCD.start();
        thV.start();
        int numeroZero = d.getNumeroZero();
        System.out.println("Numero di zero letti" + numeroZero);
    }
    
}
