/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */

package Ejercicios_Guia_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        int top = 9;
        int[][] matriz = new int[4][4];
        int[][] traspuesta = new int [4][4];
        
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 3; j++){
                int rando = rand.nextInt(top);
                matriz[i][j] = rando;
            }
        }
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 3; j++){
                traspuesta[i][j] = matriz[j][i];
            }
        }
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 3; j++){
                System.out.printf(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 3; j++){
                System.out.printf(traspuesta[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }

}
