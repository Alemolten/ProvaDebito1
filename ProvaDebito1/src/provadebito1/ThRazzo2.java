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
public class ThRazzo2 extends Thread{
    DatiCondivisi d;
    Random r = new Random();
    
    public ThRazzo2(DatiCondivisi d) {
        this.d = d;
    }
    
    public void run() {
        System.out.println("Secondo razzo partito");
        int nRandom = r.nextInt(1000)+1000;
        try {
            Thread.sleep(nRandom);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThRazzo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Seconda roccia colpita");
        d.getArrivoR2().release();
    }
}
