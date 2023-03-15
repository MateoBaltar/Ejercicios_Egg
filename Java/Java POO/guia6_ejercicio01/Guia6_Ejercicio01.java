/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */

package guia6_ejercicio01;

import guia6_ejercicio01.Entidades.Libro;
import guia6_ejercicio01.Servicios.ServicioLibro;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioLibro ServicioLibro = new ServicioLibro();
        
        Libro libro1 = ServicioLibro.cargarLibro();
        
        System.out.println(libro1.toString());
    }

}
