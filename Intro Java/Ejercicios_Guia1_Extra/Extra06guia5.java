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
public class Extra06guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int bajo = 0;
        double promedio = 0;
        int contador = 0;
        System.out.println("Cuantas personas desea ingresar?");
        int x = leer.nextInt();
        for (int i = 0; i != x; i++) {
            System.out.println("Ingrese la estatura de la persona numero " + (i+1));
            double altura = leer.nextDouble();
            if (altura < 1.60) {
            bajo++;
            }
            promedio = promedio + altura;
            contador++;
        }
        promedio = promedio / contador;
        
        System.out.println("El promedio de estatura es: " + promedio);
        System.out.println("La cantidad de personas debajo de 1.60 mts es " + bajo);
    }

}
