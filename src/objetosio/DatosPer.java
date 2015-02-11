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
    
    public NombreComp  nombreCompleto;
    public Domicilio domicilioPer;
    
    //Constructor por defecto
    public DatosPer(){
        
        this.nombreCompleto = new NombreComp();
        this.domicilioPer = new Domicilio();
    }
    
}
