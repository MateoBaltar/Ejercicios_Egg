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
public class Extra08guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int contador = 0;
        int par = 0;
        int impar = 0;
        int suma = 0;
        do {
            System.out.println("Ingrese un numero"); 
            num = leer.nextInt();
            if ( num % 5 == 0) {
                break;
            } 
            contador++;
            if ( num % 2 == 0) {
                par++;
            } else {
                impar++;
            }  
            
            if ( num >= 0) {
                suma = suma + num;
            }
        } while (num % 5 != 0);
        
        System.out.println("La cantidad de numeros leidos es " + contador);
        System.out.println("La cantidad de numeros pares es " + par);
        System.out.println("La cantidad de numeros impares es " + impar);
        System.out.println("La suma de los numeros es " + suma);
    }

}
