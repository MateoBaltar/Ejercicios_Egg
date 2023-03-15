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
public class Extra04guia5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero = 0;
        
        do {
            System.out.println("Ingrese un número entre 1 y 10");
            numero = leer.nextInt();
            
        } while (numero < 1 || numero > 10);
        
        switch (numero) {
            
            case 1: System.out.println("I");
            break;
                
            case 2: System.out.println("II");
            break;   
            
            case 3: System.out.println("III");
            break;   
                
            case 4: System.out.println("IV");
            break;   
                
            case 5:System.out.println("V");
            break;
            
            case 6:System.out.println("VI");
            break;   
                
            case 7:System.out.println("VII");
            break;       
                
            case 8:System.out.println("VIII");
            break;   
                
            case 9:System.out.println("IX");
            break;   
                
            case 10: System.out.println("X");
            break;      
        }
    }

}
