/*
    Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
    matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
    signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */

package Ejercicios_Guia_1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int[4][4];
        int[][] traspuesta = new int [4][4];
        boolean VoF;
        
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 3; j++){
                System.out.println("Ingrese un valor para la matriz " + i + "," + j);
                matriz[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 3; j++){
                System.out.println("Ingrese un valor para la otra matriz " + i + "," + j);
                traspuesta[i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i != 3; i++) {
            for (int j = 0; j != 3; j++){
                if (Math.abs(matriz [i][j]) == Math.abs(traspuesta [i][j])){
                    VoF = true;
                } else {
                    VoF = false;
                    break;
                }
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
        
        if (VoF = true){
            System.out.println("Las matrizes son anti simetricas");
        } else {
            System.out.println("Las matrizes no son anti simetricas");
        }
    }
   
}
