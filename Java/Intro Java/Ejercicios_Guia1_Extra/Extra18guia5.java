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
public class Extra18guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese le tamaño del vector");
        int x = leer.nextInt();
        int suma = 0;
        int[] vector = new int [x];
        
        for ( int i = 0; i != x; i++) {
            System.out.println("Ingrese el valor del elemento " + i);
            vector[i] = leer.nextInt();
        }
        
        for ( int i = 0; i != x; i++) {
            suma = suma + vector[i];
        }
        System.out.println("La suma de todos los elementos del vector es " + suma);
    }

    
}
