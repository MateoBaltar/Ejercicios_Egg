/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package Ejercicios_Guia_1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en Celcius");
        int temp = leer.nextInt();
        
        int faren = 32 + (9*temp / 5);
        
        System.out.println("La temperatura ingresada en Farenheit es: " + faren);
    }
    
}
