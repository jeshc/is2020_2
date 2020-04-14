/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.sports.sinAdaptador;

/**
 *
 * @author jeshc
 */
public class ClienteMoroso {
    private String nombre;

    public ClienteMoroso() {
    }

    public ClienteMoroso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void cobrarCuotaMensual( float cuota , float multa){
        System.out.println("Señor(a) "+ this.nombre +":");
        System.out.println("Por tener pagos morosos debe pagar una multa de " + multa +"%");
        System.out.println("Cuota:"+cuota);
        System.out.println("Con recargos:" + (cuota + (cuota*(multa / 100))) );
    }
}
