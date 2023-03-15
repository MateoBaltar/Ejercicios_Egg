/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia1_Extra;

/**
 *
 * @author users
 */
public class Extra24guia5 {

    public static void dolor( int vector[], int posicion){
	int num1 = 0;
	int num2 = 1;
	int aux;
        int dolor;
        
	for (int i = 0; i != posicion; i++){
            if (posicion == 1 || posicion == 2) {
                vector[i] = 1;
            } else {
                aux = num1 + num2;
                num1 = num2;
                vector[i] = num1;
                num2 = aux;
            }
        }
		
    }

}
