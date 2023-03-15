/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package Ejercicios_Guia_1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
       String nombre = leer.next();
              
       System.out.println(nombre);
       
       
    }
    
}
