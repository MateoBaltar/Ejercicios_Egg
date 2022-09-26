/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de miembros");
        int miembros = leer.nextInt();
        
        System.out.println("------ ALUMNOS ------");
        String [] alumnos = new String[miembros];
        for (int i = 0; i < miembros; i++){
            System.out.println("Ingrese nombre del alumno " + (i));
            alumnos[i] = leer.next();
        }
        
        for (int i = 0; i < miembros; i++){
            System.out.println(alumnos[i]);
        }
    }
    
}
