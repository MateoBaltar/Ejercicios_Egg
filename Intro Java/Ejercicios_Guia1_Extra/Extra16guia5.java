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
public class Extra16guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String seguir;
        boolean V = true;
        System.out.println("Cuantas personas desea ingresar");
        int x = leer.nextInt();

        String[] nombre = new String [x];
        int[] edad = new int [x];

        for (int i = 0; i != x; i++) {
            System.out.println("Ingrese el nombre de la persona" + (i+1));
            nombre[i] = leer.next();
            System.out.println("Ahora ingrese la edad");
            edad[i] = leer.nextInt();
        }
        for (int i = 0; i != x; i++) {
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Edad: " + edad[i]);
            if (edad[i] >= 18) {
                System.out.println("Mayor de edad");
            } else {
                System.out.println("Menor de edad");
            }
             System.out.println("----------------");
             
             do {
                 System.out.println("Desea continuar con la proxima persona? (Si/No)");
                 seguir = leer.next();
                 if (seguir.equals("Si") || seguir.equals("No")|| seguir.equals("no")|| seguir.equals("si")) {
                     V = false;
                 }
             } while (V == true);
             
             if (seguir.equals("No") || seguir.equals("no")) {
                 break;
             }
             
        }
   }
}
