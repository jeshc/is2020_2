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
public class ClientePremium {
    private String nombre;

    public ClientePremium() {
    }

    public ClientePremium(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void cobrarCuotaMensual(float cuota , float descuento){
        System.out.println("Señor(a) "+this.nombre +" :");
        System.out.println("Por su buen historial ud. es beneficiado con un "+descuento +"% de desc.");
        System.out.println("Cuota:"+cuota);
        System.out.println("Con descuento:"+ (cuota-(cuota*(descuento/100))) );
    }
}
