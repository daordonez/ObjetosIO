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
public class Cds {
    
    private String titulo;
    private String genero;
    private String grupo;
    private int anioPub;
    private String artista;
    private int numPistas;
    
    
    public Cds(){
        this.titulo = null;
        this.genero = null;
        this.grupo = null;
        this.anioPub = 0;
        this.artista = null;
        this.numPistas = 0;
    }
    
    public Cds(String titulo, String artista){
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnioPub() {
        return anioPub;
    }

    public void setAnioPub(int anioEd) {
        this.anioPub = anioEd;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getNumPistas() {
        return numPistas;
    }

    public void setNumPistas(int numPistas) {
        this.numPistas = numPistas;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    
    
}
