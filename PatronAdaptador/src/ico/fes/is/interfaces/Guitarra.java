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
public class Guitarra implements Instrumento{

    @Override
    public boolean tocar() {
        System.out.println("Tocando cuerdas de arriba hacia abajo");
        System.out.println("Tran .... tran....");
        return true;
    }

    @Override
    public void afinar() {
        System.out.println("Presionando cuerda 6 en traste 2...");
        System.out.println("etc...");
    }

  
    public int guardar(String lugar) {
        System.out.println("Guardando la guitarra en " +  lugar);
        return 12; // se guardara 12 horas
    }
    
}
