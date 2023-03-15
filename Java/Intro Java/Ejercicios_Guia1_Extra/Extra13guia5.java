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
public class Extra13guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int M = 1;
        int num = leer.nextInt();
        
        String escalera = "1";
        String x;
        
        for (int i = 0; i != num; i++) {
            if (i == 0) {
                System.out.println(escalera);
            } else {
                x = Integer.toString(i+1);
                escalera = escalera.concat(x);
                System.out.println(escalera);
            }
            
        }
        
        for (int i = 1; i != num+1; i++) {
            for (int j = 1; j != M+1; j++) {
                System.out.print(j);
            }
            System.out.println("");
            M++;
        }
    }

}
