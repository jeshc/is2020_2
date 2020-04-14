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
public class TestSportClub {
    public static void main(String[] args) {
        Object [] carteraClientes= {
            new ClienteNuevo("José"),
            new ClientePremium("Jesús"),
            new ClientePremium("Diana"),
            new ClienteMoroso("jorge"),
            new ClientePremium("Diego")
        };
        
        for (Object cliente : carteraClientes) {
            if(cliente.getClass().getSimpleName().equals("ClienteNuevo")){
                ((ClienteNuevo)cliente).cobrarCuotaMensual(500.0f);
            }
            if(cliente.getClass().getSimpleName().equals("ClienteMoroso")){
                ((ClienteMoroso)cliente).cobrarCuotaMensual(500.0f, 5.0f);
            }
            if(cliente.getClass().getSimpleName().equals("ClientePremium")){
                ((ClientePremium)cliente).cobrarCuotaMensual(500.0f,10.0f);
            }
            
            
        }
        
    }
 
}
