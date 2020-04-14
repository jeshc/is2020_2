/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.interfaces;

/**
 *
 * @author jeshc
 */
public interface Instrumento {
    public abstract boolean tocar();
    public abstract void afinar();
    public abstract int guardar( String lugar);
    // ...  
    
}
