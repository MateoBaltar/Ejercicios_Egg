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
public class Extra02guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A = 20;
        int B = 14;
        int C = 60;
        int D = 5;
        int aux = 0;
        System.out.println("Valores A,B,C,D");
        System.out.println(A + " " + B + " "+ C + " "+ D);
        
        aux = A;
        A = D;       
        D = B;
        B = C;
        C = aux;
        System.out.println("Valores A,B,C,D cambiados entre si");
        System.out.println(A + " " + B + " "+ C + " "+ D);
    }
}