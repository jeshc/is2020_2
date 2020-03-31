/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.aragon;

/**
 *
 * @author jeshc
 */
public class BaseDeDatosSingleton {
    private String url;
    private String user;
    private String password;
    private String nombreBd;
    private String port;
    private static BaseDeDatosSingleton _instance;

    private BaseDeDatosSingleton() {
        System.out.println("Conectando a bd...");
        System.out.println("Conectandonos a el servidor:"+url);
        System.out.println("Conectado satisfactoriament al server");
    }

    private BaseDeDatosSingleton(String url, String user, String password, String nombreBd, String port) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.nombreBd = nombreBd;
        this.port = port;
        System.out.println("Conectando a bd...");
        System.out.println("Conectandonos a el servidor:"+url);
        System.out.println("Conectado satisfactoriament al server");
    }
    
    public static BaseDeDatosSingleton getInstance(){
        if(_instance == null){
            _instance=new BaseDeDatosSingleton();
        }else{
            System.out.println("Ya fué instanciado el objeto!!");
        }
        
        return _instance;
        
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombreBd() {
        return nombreBd;
    }

    public void setNombreBd(String nombreBd) {
        this.nombreBd = nombreBd;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
    
    public void consultaClientes(){ // simular una consulta a la tabla clientes
        System.out.println("Id de este objeto:"+this.toString());
        System.out.println("ID  |   NOMBRE  |   TELEFONO");
        System.out.println("1  |   José  |   556677888");
        System.out.println("2  |   Diana  |   554433633");
        System.out.println("3  |   Diego  |   434343434");
        System.out.println("4  |   Zoila  |   7676767767");
        System.out.println("5  |   Manuel  |   432332327");
        
        
    }
    
    
}
