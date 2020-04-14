/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is;

/**
 *
 * @author jeshc
 */
public class Flauta extends instrumento{

    @Override
    public boolean tocar() {
        System.out.println("Soplando la flauta...");
        System.out.println("el sonido de la flauta");
        return true;
    }
    
}
