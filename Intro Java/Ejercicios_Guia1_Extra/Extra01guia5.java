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
public class Extra01guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un tiempo en minutos");
        int min = leer.nextInt();
        int dia = 0;
        int horas = min / 60;
        
        do {
            if (horas > 24) {
            horas = horas - 24;
            dia++;
        }  
        } while (horas > 24);
        
        if (dia > 1) {
            System.out.println(dia + " dias y " + horas + " horas");
        } else{
            System.out.println(dia + " dia y " + horas + " horas");
        }
        
    }
}

