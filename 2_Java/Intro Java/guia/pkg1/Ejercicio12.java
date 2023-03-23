/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números para saber si son multiplos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
       
        
        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Los dos números son multiplos");
            
        } else{
            System.out.println("Los dos números no son multiplos");
        }
        
    }
    
}
