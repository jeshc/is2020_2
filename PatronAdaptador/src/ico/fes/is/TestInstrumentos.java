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
public class TestInstrumentos {
    public static void main(String[] args) {
        Guitarra g = new Guitarra();
        Flauta f = new Flauta();
        g.tocar();
        f.tocar();
        f.saludar();
    }
}
