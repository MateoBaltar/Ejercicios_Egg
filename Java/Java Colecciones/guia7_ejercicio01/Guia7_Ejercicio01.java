/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package guia7_ejercicio01;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia7_Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> raza = new ArrayList();
        String salir;
        
        do {            
            System.out.println("Ingrese la raza de perros");
            raza.add(leer.nextLine());
            
            System.out.println("Quiere ingresar mas razas?");
            salir = leer.nextLine();
            
        } while (salir.equals("Si"));
        
        System.out.println("Las razas ingresadas son:");
        
        for (String aux : raza) {
            System.out.println(aux);
        }
    }
    
}
