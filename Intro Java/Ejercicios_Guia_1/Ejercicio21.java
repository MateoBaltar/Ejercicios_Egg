/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */

package Ejercicios_Guia_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        int contador = 0;
        int a = 0;
        int b = 0;
        int top = 20;
        int[][] matriz = {{1,26,36,47,5,6,72,81,95,19}, {11,12,13,21,41,22,67,20,10,61}, {56,78,87,90,9,90,17,12,87,67}, {41,87,24,56,97,74,87,42,64,35}, {32,76,79,1,36,4,67,96,12,11}, {99,13,54,88,89,90,75,12,41,76}, {67,78,87,45,14,22,26,42,56,78}, {98,45,34,23,32,56,74,16,19,18}, {24,67,97,46,87,13,67,89,93,24}, {21,68,78,98,90,67,12,41,65,12}};
        int[][] matriz2 = {{36,5,67}, {89,90,75}, {14,22,26}};

 /*
            for (int j = 0; j != 10; j++){
                int rando = rand.nextInt(top);
                matriz[i][j] = rando;
            }
        }
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 3; j++){
                int rando = rand.nextInt(top);
                matriz2[i][j] = rando;
            }
        }
*/        
        
        for (int i = 0; i != 10; i++) {
            for (int j = 0; j != 10; j++){
                if (matriz[i][j] == matriz2[0][0]){
                    for (int x = i; x != i+3; x++){
                        for (int z = j; z != j+3; z++){
                            if (matriz[x][z] == matriz2[a][b]){
                                contador++;
                                b++;        
                            } else {
                                break;
                            }
                                
                        }
                        a++;
                        b = 0;
                    }
                    if (contador != 6){
                        contador = 0;
                        a = 0;
                        b = 0;
                    }
                }
            }
        }
        
        if (contador == 6){
            System.out.println("Funciona");
        }
    }

}
