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
public class DatiCondivisi {
    private ArrayList<Integer> numeriGenerati;
    private int numeroElementi;
    private int numeroPariInseriti;
    private int numeroDispariInseriti;
    private int numeroPariLetti;
    private int numeroDispariLetti;
    private int numeroZero;
    private int posizione;
    
    public DatiCondivisi() {
        this.numeriGenerati = new ArrayList<Integer>();
        this.numeroElementi = 0;
        this.numeroPariInseriti = 0;
        this.numeroDispariInseriti = 0;
        this.numeroPariLetti = 0;
        this.numeroDispariLetti = 0;
        this.numeroZero = 0;
        this.posizione = 0;
    }
    
    public ArrayList<Integer> getNumeriGenerati() {
        return this.numeriGenerati;
    }
    
    public int getNumeroElementi() {
        return this.numeroElementi;
    }
    
    public int getNumeroPariInseriti() {
        return this.numeroPariInseriti;
    }
    
    public int getNumeroDispariInseriti() {
        return this.numeroDispariInseriti;
    }
    
    public int getNumeroPariLetti() {
        return this.numeroPariLetti;
    }
    
    public int getNumeroDispariLetti() {
        return this.numeroDispariLetti;
    }
    
    public int getNumeroZero() {
        return this.numeroZero;
    }
    
    public int getPosizione() {
        return this.posizione;
    }
    
    public void setNumeriGenerati(ArrayList numeriGenerati) {
        this.numeriGenerati = numeriGenerati;
    }
    
    public void setNumeroElementi(int numeroElementi) {
        this.numeroElementi = numeroElementi;
    }
    
    public void setNumeroPariInseriti(int numeroPariInseriti) {
        this.numeroPariInseriti = numeroPariInseriti;
    }
    
    public void setNumeroDispariInseriti(int numeroDispariInseriti) {
        this.numeroDispariInseriti = numeroDispariInseriti;
    }
    
    public void setNumeroPariLetti(int numeroPariLetti) {
        this.numeroPariLetti = numeroPariLetti;
    }
    
    public void setNumeroDispariLetti(int numeroDispariLetti) {
        this.numeroDispariLetti = numeroDispariLetti;
    }
    
    public void setNumeroZero(int numeroZero) {
        this.numeroZero = numeroZero;
    }
    
    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }
}
