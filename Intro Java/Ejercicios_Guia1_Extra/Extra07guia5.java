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
public class Extra07guia5 {

  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        int mayor = 0;
        int menor = 100000;
        int promedio = 0;
        
        System.out.println("Cuantos numeros desea ingresar");
        int x = leer.nextInt();
        
        while (contador != x) {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            if (num > mayor) {
                mayor = num;
            } else if (num < menor) {
                menor = num;
            }
            promedio = promedio + num;
            contador++;
        }
        
        promedio = promedio / x;
        System.out.println("el promedio es " + promedio);
        System.out.println("El numero mayor es " + mayor + " y el menor es " + menor);
        contador = 0;
        mayor = 0;
        menor = 100000;
        promedio = 0;
        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            if (num > mayor) {
                mayor = num;
            } else if (num < menor) {
                menor = num;
            }
            promedio = promedio + num;
            contador++;
            
        } while (contador != x);
         
        promedio = promedio / x;
        System.out.println("el promedio es " + promedio);
        System.out.println("El numero mayor es " + mayor + " y el menor es " + menor);
    }

}
