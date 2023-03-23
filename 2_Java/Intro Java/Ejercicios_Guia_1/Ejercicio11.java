/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios_Guia_1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio11 {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int elec;
        
        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            elec = leer.nextInt();
           
            switch (elec) {
                case 1: int sumar = num1 + num2;
                    System.out.println("La suma de los numeros es: " + sumar);
                    continue;
                case 2: int restar = num1 - num2;
                    System.out.println("La resta de los numeros es: " + restar);
                    continue;
                case 3: int multi = num1 * num2;
                    System.out.println("La multiplicacion de los numeros es: " + multi);
                    continue;
                case 4: double div = num1 / num2;   
                    System.out.println("La division de los numeros es: " + div);
            }
        } while (elec != 5);
        
    }

}
