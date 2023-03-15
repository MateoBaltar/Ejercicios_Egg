/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia1_Extra;

import java.util.Scanner;

/**
 *
 * @author users
 */
public class Extra19guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese el tamaño de los vectores");
        int x = leer.nextInt();
        
        int[] vector1 = new int[x];
        int[] vector2 = new int[x];
        
        for ( int i = 0; i != x; i++) {
            System.out.println("Ingrese el valor del primer vector, elemento " + i);
            vector1[i] = leer.nextInt();
        }
        for ( int i = 0; i != x; i++) {
            System.out.println("Ingrese el valor del segundo vector, elemento " + i);
            vector2[i] = leer.nextInt();
        }
        for ( int i = 0; i != x; i++) {
            if (vector1[i] != vector2[i]) {
                break;
            } else {
                contador++;
            }
        }
        if (contador == x) {
            System.out.println("Todos los valores son iguales");
        } else{
            System.out.println("Alguno de los valores es distinto");
        }
    }


}
