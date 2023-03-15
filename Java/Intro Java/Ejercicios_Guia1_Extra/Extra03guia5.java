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
public class Extra03guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        letra = letra.toUpperCase();
        
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            System.out.println("La letra es vocal");
        } else{
            System.out.println("No es vocal");
        }
        
    }
}