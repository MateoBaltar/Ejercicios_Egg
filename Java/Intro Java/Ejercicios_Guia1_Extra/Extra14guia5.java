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
public class Extra14guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantdida de familias");
        int x = leer.nextInt();
        int promedio = 0;
        int contador = 0;
        
        for (int i = 0; i != x; i++){
            System.out.println("Ingrese la cantidad de hijos de la familia " + (i+1));
            int cantidad = leer.nextInt();
            for (int j = 0; j != cantidad; j++) {
                System.out.println("Ingrese la edad del hijo " + (j+1));
                int edad = leer.nextInt();
                promedio = promedio + edad;
                contador++;
            }
        }
            
        promedio = promedio / contador;
        
        System.out.println("La edad promedio de todas las familias es " + promedio);
    }

}
