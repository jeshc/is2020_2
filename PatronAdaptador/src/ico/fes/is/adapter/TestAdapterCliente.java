/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.adapter;

import ico.fes.is.sports.sinAdaptador.ClienteMoroso;
import ico.fes.is.sports.sinAdaptador.ClienteNuevo;
import ico.fes.is.sports.sinAdaptador.ClientePremium;

/**
 *
 * @author jeshc
 */
public class TestAdapterCliente {

    public static void main(String[] args) {

        Cliente[] carteraClientes = {
            new ClienteNuevoAdapter(new ClienteNuevo("José")),
            new ClientePremiumAdapter(new ClientePremium("Jesús")),
            new ClientePremiumAdapter(new ClientePremium("Diana")),
            new ClienteMorosoAdapter(new ClienteMoroso("jorge")),
            new ClientePremiumAdapter(new ClientePremium("Diego"))
        };

        float cuotaMensual = 500.0f;
        float multa = 5.0f;
        float descuento = 10.0f;
            
        for (Cliente cliente : carteraClientes) {
            cliente.cobrarCuotaMensual(cuotaMensual, multa, descuento);
        }
        
    }
}
