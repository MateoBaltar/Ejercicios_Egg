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
public class Extra05guia5 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double fin;
        System.out.println("Que tipo de socio es? A, B o C");
        char tipo = leer.nextLine().charAt(0);
        
        System.out.println("Ingrese el costo del tratamiento");
        int costo = leer.nextInt();
        
        switch (tipo){
            
            case 'A': fin = costo * 0.5;
                System.out.println("El costo final es $" + fin);
            break;
            
            case 'B': fin = costo * 0.35;
                System.out.println("El costo final es $" + fin);
            break;
            
            case 'C': fin = costo;
                System.out.println("El costo final es $" + fin);
            break;
        }
        
        
    }

}
