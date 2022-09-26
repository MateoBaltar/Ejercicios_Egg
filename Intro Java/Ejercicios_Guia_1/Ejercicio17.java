/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */

package Ejercicios_Guia_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vector = new int[20];
        int tope = 99999;
        
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        
        for (int i = 0; i != 20; i++) {
            int rando = rand.nextInt(tope);
            vector[i] = rando;
        }
        
        
        for (int i = 0; i != 20; i++) {
            if (vector[i] < 10) {
                contador1++;
            } else if (vector[i] >= 10 && vector[i] < 100){
                contador2++;
            } else if (vector[i] >= 100 && vector[i] < 1000){
                contador3++;
            } else if (vector[i] >= 1000 && vector[i] < 10000){
                contador4++;
            } else if (vector[i] >= 10000 && vector[i] < 100000){
                contador5++;
            }    
        }
        
        System.out.println("La cantidad de numeros de una cifra: " + contador1);
        System.out.println("La cantidad de numeros de dos cifrsa: " + contador2);
        System.out.println("La cantidad de numeros de tres cifras: " + contador3);
        System.out.println("La cantidad de numeros de cuatro cifras: " + contador4);
        System.out.println("La cantidad de numeros de cinco cifras: " + contador5);
        
    }

}
