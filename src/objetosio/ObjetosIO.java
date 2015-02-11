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
        
        
//        Alumno al1 ;
//        al1 = llenarAlumno();
//        leeAlumno(al1);
//        Cds cd1 ;
//        cd1 = llenaCd();
        
        //Clase Carnet, nuevo carnet
        
//        Carnet carnet1 = new Carnet();
//        
//        llenaCarnet(carnet1);
//        
//        leeCarnet(carnet1);
        
        Carnet clase1[] = new Carnet[3];
        
        
        llenaClase(clase1);
        leeClase(clase1);
        
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
    
    static void llenaCarnet(Carnet cr){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca Nombre:");
        cr.datosPerso.nombreCompleto.nombre = teclado.next();
        System.out.print("Introduzca Apellido 1:");
        cr.datosPerso.nombreCompleto.ape1 = teclado.next();
        System.out.print("Introduzca Apellido 2:");
        cr.datosPerso.nombreCompleto.ape2 = teclado.next();
        //Fechas
        //Fecha nacimiento
        System.out.println("Fecha de nacimiento:");
        int fechNac[] = llenaFech();
        cr.fechaNac.dia = fechNac[0];
        cr.fechaNac.mes = fechNac[1];
        cr.fechaNac.anio = fechNac[2];
        //Fecha solicitud
        System.out.println("Fecha de solicitud:");
        int fechSol[] = llenaFech();
        cr.fechaSoli.dia = fechSol[0];
        cr.fechaSoli.mes = fechSol[1];
        cr.fechaSoli.anio = fechSol[2];
        
        System.out.print("Introduzca hora separado por ':' :");
        cr.horaSol = teclado.next();
        
    
    }
    
    static int[] llenaFech(){
        
        Scanner teclado = new Scanner(System.in);
        int fecha[] = new int[3];
        
        System.out.print("\t Introduzca (DIA):");
        fecha[0] = teclado.nextInt();
        System.out.print("\t Introduzca (MES):");
        fecha[1] =teclado.nextInt();
        System.out.print("\t Introduzca (AÑO):");
        fecha[2] = teclado.nextInt();
        
        return fecha;
    }
    
    static  void leeCarnet(Carnet cr){
        System.out.println("*********");
        System.out.println("Nombre:"+cr.datosPerso.nombreCompleto.nombre);
        System.out.println("1er Apellido: "+cr.datosPerso.nombreCompleto.ape1);
        System.out.println("2do Apellido: "+cr.datosPerso.nombreCompleto.ape2);
        System.out.println("Fecha Nacimiento: "+cr.fechaNac.dia+"/"+cr.fechaNac.mes+"/"+cr.fechaNac.anio);
        System.out.println("Fecha Solicitud: "+cr.fechaSoli.dia+"/"+cr.fechaSoli.mes+"/"+cr.fechaSoli.anio);
        System.out.println("Hora Solicitud: "+cr.horaSol);
    }
    
    static void llenaClase(Carnet cl[]){
        for (int i = 0; i < cl.length; i++) {
            cl[i] = new Carnet();
            llenaCarnet(cl[i]);
        }
    }
    static void leeClase(Carnet cl[]){
        for(Carnet car:cl){
            leeCarnet(car);
        }
    }
}
