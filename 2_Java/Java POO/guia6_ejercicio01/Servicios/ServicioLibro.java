/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package guia6_ejercicio01.Servicios;

import guia6_ejercicio01.Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class ServicioLibro {
    Scanner leer = new Scanner(System.in);
    
    public Libro cargarLibro(){
        Libro libroCompleto = new Libro();
        
        System.out.println("Ingrese el titulo del libro:");
        libroCompleto.setTitulo(leer.nextLine());
        
        System.out.println("Ingrese el autor del libro:");
        libroCompleto.setAutor(leer.nextLine());
        
        System.out.println("Ingrese la cantidad de paginas del libro:");
        libroCompleto.setPaginas(leer.nextInt());
        
        System.out.println("Ingrese el ISBN del libro:");
        libroCompleto.setISBN((int) leer.nextLong());
        
        return libroCompleto;
    }
    
}
