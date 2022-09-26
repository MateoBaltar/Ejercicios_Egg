/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */

package Ejercicios_Guia_1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[20];
        int min = 1;
        int max = 25;
        int contador = 0;
        for (int i = 0; i != 20; i++) {
            vector[i] = (int)(Math.random()*(max-min+1)+min);
            System.out.println(vector[i]);
        }
        System.out.println("Ingrese un número para buscar:");
        int busca = leer.nextInt();
        
        System.out.println("El número se encuentra en el vector:");
        
        for (int i = 0; i != 20; i++) {
            if (vector[i] == busca){
                System.out.printf(i + " ");
                contador++;
            }
        }
        if (contador == 0){
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            System.out.println("El numero ingresado no se encuentra en ningun vector");
        }
        
    }

}
