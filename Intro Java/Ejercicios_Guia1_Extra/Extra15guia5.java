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
public class Extra15guia5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int resultado;
 
        System.out.println("Que desea hacer? Sumar, restar, dividir o multiplicar?");
        
        String selec = leer.next();
        selec = selec.toUpperCase();
        switch (selec) {
            case "SUMAR": resultado = num1 + num2;
                        System.out.println("La suma de los numeros es: " + resultado);
                        break;
            
            case "RESTAR":resultado = num1 - num2;
                        System.out.println("La suma de los numeros es: " + resultado);
                        break;
                
            case "DIVIDIR":resultado = num1 / num2;
                        System.out.println("La suma de los numeros es: " + resultado);
                        break;
                
            case "MULTIPLICAR":resultado = num1 * num2;
                        System.out.println("La suma de los numeros es: " + resultado);
                        break;
        }
        
    }

}
