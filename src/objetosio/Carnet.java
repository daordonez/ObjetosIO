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
public class Carnet {

    public DatosPer datosPerso;
    public Fecha fechaNac;
    public Fecha fechaSoli;
    public String horaSol;

    public Carnet() {
        this.datosPerso = new DatosPer();
        this.fechaNac = new Fecha();
        this.fechaSoli = new Fecha();
        this.horaSol = null;
    }

}
