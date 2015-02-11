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
import java.util.Scanner;
public class ObjetosIO {

    
    public static void main(String[] args) {
        
        
        Alumno al1 ;
        
        al1 = llenarAlumno();
        
        leeAlumno(al1);
        
        Cds cd1 ;
        
        cd1 = llenaCd();
    }
    
    static  Alumno llenarAlumno(){
        
        Scanner teclado = new Scanner(System.in);
        Alumno alLLeno = new Alumno();
        System.out.println("Introduce nombre alumno: ");
        alLLeno.setNombre(teclado.next());
        System.out.println("Introduce apellido alumno: ");
        alLLeno.setApellido(teclado.next());
        System.out.println("Introduce curso alumno: ");
        alLLeno.setCurso(teclado.nextInt());
        
        return alLLeno;
    }
    
    static void leeAlumno(Alumno al1){
        
        System.out.println("--INFO--");
        System.out.println("Id: "+al1.getIdAlumno());
        System.out.println("Nombre: "+al1.getNombre());
        System.out.println("Apellido: "+al1.getApellido());
        System.out.println("Curos: "+al1.getCurso());
        System.out.println("------");
    }
    
    static Cds llenaCd(){
        Cds cdFunc = new Cds();
        Scanner teclado = new Scanner(System.in);
        
        //Atributos individuales del objeto ya creado SET
        System.out.println("Introduce titulo CD: ");
        cdFunc.setTitulo(teclado.next());
        System.out.println("Introduce genero: ");
        cdFunc.setGenero(teclado.next());
        System.out.println("Introduce grupo: ");
        cdFunc.setGrupo(teclado.next());
        System.out.println("Introduce año publicación: ");
        cdFunc.setAnioPub(teclado.nextInt());
        System.out.println("Introduce artista CD: ");
        cdFunc.setArtista(teclado.next());
        System.out.println("Introduce número de pistas:");
        cdFunc.setNumPistas(teclado.nextInt());
        return cdFunc;
    }
    
}
