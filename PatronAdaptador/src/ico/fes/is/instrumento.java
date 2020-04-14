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
public abstract class instrumento {
    public abstract boolean tocar(); // metodo abstracto
    
    public void saludar(){ // método no abstracto
        System.out.println("Hola");
        System.out.println("Yo no soy abstracto, por que si tengo cuerpo");
    }
}
