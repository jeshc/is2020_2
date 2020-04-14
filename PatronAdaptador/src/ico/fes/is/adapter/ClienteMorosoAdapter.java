/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.adapter;

import ico.fes.is.sports.sinAdaptador.ClienteMoroso;
/**
 *
 * @author jeshc
 */
public class ClienteMorosoAdapter implements Cliente{
    private ClienteMoroso adaptado;

    public ClienteMorosoAdapter() {
    }

    public ClienteMorosoAdapter(ClienteMoroso adaptado) {
        this.adaptado = adaptado;
    }

    @Override
    public void cobrarCuotaMensual(float couta, float multa, float descuento) {
        adaptado.cobrarCuotaMensual(couta, multa);
    }
    
    
    
}
