/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        System.out.println(concatena(frase));
    }
    
    public static String concatena(String frase) {
        String retorno = "";
        String carac = "";
        
        for (int i = 0; i < frase.length(); i++) {
            carac = frase.substring(i,i+1);
            switch (carac) {
                
                case "A": retorno = retorno + "@";
                continue;
                case "a":retorno = retorno + "@";
                continue;
                
                case "E": retorno = retorno + "#";
                continue;
                case "e": retorno = retorno + "#";
                continue;
                
                case "I": retorno = retorno + "$";
                continue;
                case "i": retorno = retorno + "$";
                continue;
                
                case "O": retorno = retorno + "%";
                continue;
                case "o": retorno = retorno + "%";
                continue;
                
                case "U": retorno = retorno + "*";
                continue;
                case "u": retorno = retorno + "*";
                continue;
                
                default: retorno = retorno + carac;
            }
        }
        return retorno;
    }
    
}
