/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */

package Ejercicios_Guia_1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros");
        int euros = leer.nextInt();
        double libra = 0.86;
        double dolar = 1.28611;
        double yen = 129.852;
        
        cambio(euros,libra,dolar,yen);
    }
    
    
    
    public static void cambio(int euros, double libra, double dolar, double yen){

        System.out.println("La cantidad de libras convertidas es: " + (euros *libra));
        System.out.println("La cantidad de dolares convertidas es: " + (euros *dolar));
        System.out.println("La cantidad de yenes convertidas es: " + (euros *yen));
        
    }
}
