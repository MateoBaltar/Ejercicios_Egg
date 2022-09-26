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
public class Extra22guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        
        int[][] matriz = new int [3][5];
        
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 5; j++) {
                matriz[i][j] = (int) Math.ceil(Math.random() * 30);
            }
        }
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
         for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 5; j++) {
                suma = suma + matriz[i][j];
            }
        }
         
         System.out.println("La suma de los elementos de la matriz es " + suma);
    }

}
