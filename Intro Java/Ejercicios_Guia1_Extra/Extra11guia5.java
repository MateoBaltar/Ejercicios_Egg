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
public class Extra11guia5 {

  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introducir un numero");
        long num = leer.nextLong();
        int digitos = 0;
        while (num>0){
            num = num / 10;
            digitos++;
        }
        
        System.out.println("La cantidad de digitos es " + digitos);
    }

}
