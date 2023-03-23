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
public class Extra23guia5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabra = new String [5];
        String[][] matriz = new String [20][20];
        int contador = 0;
        int x = 0;
        String numero;
        
        for (int i = 0; i != 5; i++) {
            do {
                System.out.println("Ingrese una palabra de 3 a 5 caracteres");
                palabra[i] = leer.next();
                palabra[i] = palabra[i].toUpperCase();
            } while (palabra[i].length() < 3 || palabra[i].length() > 5);
        }
        for (int i = 0; i != 19; i++) {
            int rand = (int) Math.floor(Math.random() * 20);   
            for (int j = 0; j != 19; j++) {
                if (matriz[rand][j] == null){
                    if (x  <= 4){
                        if (contador != palabra[x].length()){
                            matriz[rand][j] = palabra[x].substring(j,j+1);
                            contador++;
                        } else if (matriz [rand][j] == null){
                            int random2 = (int) Math.floor(Math.random() * 10);
                            numero = Integer.toString(random2);
                            matriz[rand][j] = numero;
                        }
                    }
                } else {
                    x = x-1;
                    break;
                }    
            }
            x++;
            contador = 0;
        }
        for (int i = 0; i != 19; i++){
            for (int j = 0; j!=19; j++){
                if (matriz [i][j] == null){
                   int random2 = (int) Math.floor(Math.random() * 10);
                        numero = Integer.toString(random2);
                        matriz[i][j] = numero; 
                }       
            }      
        }
        for (int i = 0; i != 19; i++){
            for (int j = 0; j!=19; j++){
                System.out.print(matriz[i][j] + " ");   
            }      
            System.out.println("");
        }
    }

    
}
