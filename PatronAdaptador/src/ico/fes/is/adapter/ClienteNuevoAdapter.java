/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.is.adapter;

import ico.fes.is.sports.sinAdaptador.*;

/**
 *
 * @author jeshc
 */
public class ClienteNuevoAdapter implements Cliente{
    private ClienteNuevo adaptado;

    public ClienteNuevoAdapter() {
    }

    public ClienteNuevoAdapter(ClienteNuevo adaptado) {
        this.adaptado = adaptado;
    }
    
    
    
    @Override
    public void cobrarCuotaMensual(float couta, float multa, float descuento) {
        adaptado.cobrarCuotaMensual(couta);
    }
    
}
