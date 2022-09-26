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
public class Extra12guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String uno;
        String dos;
        String tres;
        
        for (int i = 0; i !=9; i++) {
            for (int j = 0; j !=9; j++) {
                for (int x = 0; x != 9; x++){
                    uno = Integer.toString(i);
                    dos = Integer.toString(j); 
                    tres = Integer.toString(x); 
                    if (x == 3) {
                        tres = "E";
                    }
                    if (j == 3) {
                        dos = "E";
                    }
                    if (i == 3) {
                        uno = "E";
                    }
                    
                    System.out.println(uno+"-"+dos+"-"+tres);
                }
            }
        }
        
    }

}
