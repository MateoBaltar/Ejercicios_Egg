/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */

package Ejercicios_Guia_1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int[] filas = new int[3];
        int[] columnas = new int[3];
        int[] diagonal = new int[3];
        boolean fila = false;
        boolean columna = false;
        boolean diagonals = false;
        
        for (int i = 0; i != 3; i++){
            filas[i] = 0;
            columnas[i] = 0;
            diagonal[i] = 0;
        }
        
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 3; j++){
               do {
                    System.out.println("Ingrese un valor para la matriz " + i + "," + j);
                    matriz[i][j] = leer.nextInt();
                    if (matriz[i][j] > 9) {
                        System.out.println("El numero ingresado es mayor a 9");
                    }
               } while (matriz[i][j] > 9);
            }
        }
        
        for (int i = 0; i != 3; i++){
            for (int j = 0; j != 3; j++){
                filas[i] = filas[i] + matriz[i][j];
            }
        }
            
        for (int i = 0; i != 3; i++){
            for (int j = 0; j != 3; j++){
                if (i == j){
                    diagonal[0] = diagonal[0] + matriz[i][j];
                }
                
            }
        }
        int x = 2;
        
        for (int i = 0; i != 3; i++){
            for (int j = 0; j != 3; j++){
                if (j == x){
                    diagonal[1] = diagonal[1] + matriz[i][j];
                    x = x-1;
                }
            }
        }
        
        for (int i = 0; i != 3; i++){
            for (int j = 0; j != 3; j++){
                columnas[i] = columnas[i] + matriz[j][i];
            }
        }
        
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 3; j++){
                System.out.printf(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        int contador = 0;
        for (int i = 0; i != 3; i++){
            if (filas[0] == filas[i]){
                contador++;
                if (contador == 3){
                    fila = true;
                    contador = 0;
                } else {
                    fila = false;
                } 
            }
        }
        contador = 0;
        for (int i = 0; i != 3; i++){
            if (columnas[0] == columnas[i]){
                contador++;
                if (contador == 3){
                    columna = true;
                    contador = 0;
                } else {
                    columna = false;
                } 
            }
        }
        contador = 0;
        for (int i = 0; i != 3; i++){
            if (diagonal[0] == diagonal[1]){
                contador++;
                if (contador == 3){
                    diagonals = true;
                    contador = 0;
                } else {
                    diagonals = false;
                } 
            }
        }
        
        if (fila == true && columna == true && diagonals == true) {
            System.out.println("El cuadrado es magico");
        } else{
            System.out.println("El cuadrado no es magico");
        }
    }

}
