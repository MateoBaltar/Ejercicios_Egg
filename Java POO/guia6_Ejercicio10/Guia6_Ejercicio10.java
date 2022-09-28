/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */

package guia6_Ejercicio10;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector1 = new int[50];
        double[] vector2 = new double[20];
        
        for (int i = 0; i != 50; i++) {
            vector1[i] = (int) Math.ceil(Math.random() * 30);
        }
        System.out.println(Arrays.toString(vector1));
        Arrays.sort(vector1);
        
        for (int i = 0; i !=20;i++) {
            if (i <= 9) {
                vector2[i] = vector1[i];
            } else{
                vector2[i] = 0.5;
            }
        }
        
        System.out.println(Arrays.toString(vector1));
        System.out.println(Arrays.toString(vector2));
    }

}
