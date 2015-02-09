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
public class Alumno {
    
    private int idAlumno;
    private String nombre;
    private String apellido;
    private int curso;
    
    //Constructor por defecto
    public Alumno(){
        this.idAlumno = idAlumno++;
        this.nombre = null;
        this.apellido = null;
        this.curso = 0;
    }
    /**
     * Constructor detallado con parametros
     * @param nombre - Nombre del nuevo alumno
     * @param apellido - Apellido del nuevo objeto
     */
    public Alumno (String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.idAlumno = idAlumno++;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
    
    
    
}
