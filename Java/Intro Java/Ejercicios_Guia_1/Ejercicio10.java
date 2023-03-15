/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */

package Ejercicios_Guia_1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número limite");
        int limit = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingrese un número a sumar");
            int num = leer.nextInt();
            suma = suma + num;
        } while (suma < limit);
        
    }

}
