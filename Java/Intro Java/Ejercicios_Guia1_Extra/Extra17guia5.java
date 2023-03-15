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
public class Extra17guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        if (primo(num) == true) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
        
    }
    
    
    
    public static boolean primo(int num) {
        boolean VoF;
        int contador = 0;
        
        for (int i = 1; i != num+1; i++){
            
            if (num % i == 0) {
                contador++;
            }
        }
        
        if (contador == 2) {
            VoF = true;
        } else {
            VoF = false;
        }
        
        return VoF;
    }

    
}
