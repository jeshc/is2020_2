/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronsingleton;

import ico.fes.aragon.BaseDeDatosSingleton;
import ico.fes.conalep.BaseDeDatos;

/**
 *
 * @author jeshc
 */
public class PatronSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseDeDatos bd1 = new BaseDeDatos("mysql:132.248.173.4:3306", "root", 
                                                        "dios", "cliente", "3306");
        
         BaseDeDatos bd2 = new BaseDeDatos("mysql:132.248.173.4:3306", "root", 
                                                        "dios", "cliente", "3306");
        
        BaseDeDatos bd3 = new BaseDeDatos("mysql:132.248.173.4:3306", "root", 
                                                        "dios", "cliente", "3306");
    
        
        bd1.consultaClientes();
        bd1.consultaClientes();
        bd1.consultaClientes();
        
        
        bd2.consultaClientes();
        
        bd3.consultaClientes();
        System.out.println("Termina el código del Conalep !!!!");
        
        
        BaseDeDatosSingleton dbs1 = BaseDeDatosSingleton.getInstance();
        BaseDeDatosSingleton dbs2 = BaseDeDatosSingleton.getInstance();
        BaseDeDatosSingleton dbs3 = BaseDeDatosSingleton.getInstance();
        
        dbs1.consultaClientes();
        dbs1.consultaClientes();
        dbs1.consultaClientes();
        
        dbs2.consultaClientes();
        dbs2.consultaClientes();
        dbs2.consultaClientes();
        dbs2.consultaClientes();
        
        dbs3.consultaClientes();
        dbs3.consultaClientes();
        dbs3.consultaClientes();
        dbs3.consultaClientes();
        
        
    }   
    
}
