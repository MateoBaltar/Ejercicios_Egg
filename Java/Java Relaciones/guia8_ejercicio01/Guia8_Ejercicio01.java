/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia8_ejercicio01;
import guia8_ejercicio01.Entidades.Perro;
import guia8_ejercicio01.Entidades.Persona;
import java.util.Scanner;
/**
 *
 * @author mateo
 */
public class Guia8_Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese el nombre de la persona");
            String nombre = leer.nextLine();
            System.out.println("Ingrese el apellido de la persona");
            String apellido = leer.nextLine();
            System.out.println("Ingrese la edad de la persona");
            int edad = leer.nextInt();
            System.out.println("Ingrese el documento de la persona");
            long documento = leer.nextLong();
            leer.nextLine();
            System.out.println("Ingrese el nombre del perro");
            String nombrePerro = leer.nextLine();
            System.out.println("Ingrese la raza del perro");
            String raza = leer.nextLine();
            System.out.println("Ingrese la edad del perro");
            int edadPerro = leer.nextInt();
            System.out.println("Ingrese el tamaño del perro en cm");
            int tamanio = leer.nextInt();
            leer.nextLine();

            if (i == 0) {
                Perro perro1 = new Perro(nombrePerro, raza, edadPerro, tamanio);
                Persona persona1 = new Persona(nombre, apellido, edad, documento, perro1);
                System.out.println(persona1.toString());
            } else {
                Perro perro2 = new Perro(nombrePerro, raza, edadPerro, tamanio);
                Persona persona2 = new Persona(nombre, apellido, edad, documento, perro2);
                System.out.println(persona2.toString());
            }
        }

    }

}
