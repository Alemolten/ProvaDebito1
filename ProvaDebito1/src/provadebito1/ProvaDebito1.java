/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provadebito1;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CorsiMariano
 */
public class ProvaDebito1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatiCondivisi d = new DatiCondivisi();
        ThRazzo1 thRa1 = new ThRazzo1(d);
        ThRazzo2 thRa2 = new ThRazzo2(d);
        ThRoccia1 thRo1 = new ThRoccia1(d);
        ThRoccia2 thRo2 = new ThRoccia2(d);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Premi S per far partire i razzi");
        String lettera = input.next();
        
        while(!lettera.equals("S")) {
            System.out.println("Inserire S per far partire i razzi");
            lettera = input.next();
        }
        if(lettera.equals("S")) {
            thRa1.start();
            thRa2.start();
            thRo1.start();
            thRo2.start();
            try {
                thRa1.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProvaDebito1.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                thRa2.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProvaDebito1.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                thRo1.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProvaDebito1.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                thRo2.join();
            } catch (InterruptedException ex) {
                Logger.getLogger(ProvaDebito1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Roccie distrutte");
    }
    
}
