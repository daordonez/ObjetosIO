/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosio;

/**
 *
 * @author diegordonez
 */
public class DatosPer {
    
    private NombreComp  nombreCompleto;
    private Domicilio domicilioPer;
    
    //Constructor por defecto
    public DatosPer(){
        
        this.nombreCompleto = new NombreComp();
        this.domicilioPer = new Domicilio();
    }
    
}
