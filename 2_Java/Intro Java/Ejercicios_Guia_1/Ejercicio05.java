/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package Ejercicios_Guia_1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = leer.nextInt();
        
        int doble = (int) Math.pow(num,2);
        int triple = (int) Math.pow(num,3);
        int raiz = (int) Math.sqrt(num);
       
        
        System.out.println("La cuadrado del número es: " + doble);
        System.out.println("La cubo del número es: " + triple);
        System.out.println("La raiz cuadrada del número es: " + raiz);
    }
    
}
