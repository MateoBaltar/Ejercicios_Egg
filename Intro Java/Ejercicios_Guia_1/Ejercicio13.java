/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 */

package Ejercicios_Guia_1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        for (int i = 1; i != num+1; i++){
            for (int e = 1; e != num+1; e++){
                if (i > 1 && i < num && e > 1 && e < num){
                    System.out.printf(" ");
                }else {
                    System.out.printf("*");
                }
            }
            System.out.println("");
        }
            
    }

}
