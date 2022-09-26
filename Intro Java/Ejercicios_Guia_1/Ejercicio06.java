/*
Crear un programa que dado un numero determine si es par o impar.
 */
package Ejercicios_Guia_1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        
        if (num % 2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número no es par");
        }
               
    }
    
}
