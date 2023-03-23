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
public class Extra09guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int residuo;
        int cociente = 0;
        System.out.println("Ingrese dos numeros para dividirlos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        residuo = num1;
        
        do {
            residuo = residuo - num2;
            cociente++;
            
        } while (residuo >= num2);
        
        System.out.println("El residuo de la division es " + residuo);
        System.out.println("El cociente de la division es " + cociente);
    }

}
