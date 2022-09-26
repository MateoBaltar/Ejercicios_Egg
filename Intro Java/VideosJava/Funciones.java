/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author mateo
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(suma(10,10));

        Scanner leer = new Scanner(System.in);
                
       saludoPersonalizado(leer.next());
    }
    
    public static int suma(int a, int b) {
        int resultado = a + b;
        
        return resultado;
}
    
    public static void saludoPersonalizado(String nombre) {
        System.out.println("Hola " + nombre+ " como estas?");
                
    }
}
