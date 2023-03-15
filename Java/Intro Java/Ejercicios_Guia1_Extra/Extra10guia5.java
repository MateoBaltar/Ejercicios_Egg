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
public class Extra10guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int min = 0;
        int max = 10;
        int rand = (int) Math.ceil(Math.random() * 10);
        int rand2 = (int) Math.ceil(Math.random() * 10);
        
        int rand3 = rand * rand2;
        System.out.println("Los numeros son " + rand + " y " + rand2);
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();   
        } while (num != rand3);
    }

}
