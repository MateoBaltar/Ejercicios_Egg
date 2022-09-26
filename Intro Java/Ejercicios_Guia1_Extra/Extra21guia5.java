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
public class Extra21guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        double[] alumno = new double [10];
        int contador = 0;
        int contadord = 0;
        for (int i = 0; i != 10; i++){
            System.out.println("Ingrese la nota de los trabajos practicos");
            double trabajo1 = leer.nextInt();
            double trabajo2 = leer.nextInt();
            
            System.out.println("Ahora ingrese la nota de los integradores");
            double integrador1 = leer.nextInt();
            double integrador2 = leer.nextInt();
            
            alumno[i] = (trabajo1 * 0.10) + (trabajo2 * 0.15) + (integrador1 * 0.25) + (integrador2 * 0.50);
        }
        for (int i = 0; i != 10; i++) {
            if (alumno[i] >= 7) {
                contador++;
            } else {
                contadord++;
            }
        }
        
        System.out.println("La cantidad de alumnos aprobados es " + contador);
        System.out.println("La cantidad de alumnos desaprobados es " + contadord);
    }


}
