/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int[] num = new int[4];
       String[] asterisco = new String[4];        
      
       System.out.println("Ingrese 4 números");
       for (int i = 0; i < 3 ;i++) {
          num[i] = leer.nextInt();
          asterisco[i] = "";
       }
       
       
       for (int i = 0; i < 3; i++) {
           for (int j = 0; j < num[i]; j++){
               asterisco[i] = asterisco[i] + "*";
           }
               
        }
       
       for (int i = 0; i < 3 ;i++) {
          System.out.println(num[i] + " " + asterisco[i]);
       }
       
    }
    
}
