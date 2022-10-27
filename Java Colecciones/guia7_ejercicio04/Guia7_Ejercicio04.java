/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */

package guia7_ejercicio04;
import guia7_ejercicio04.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author mateo
 */
public class Guia7_Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Pelicula> peliculas = new ArrayList();
        ArrayList<String> actores = new ArrayList();
        String salir;
        int menu;

        do {
            actores.clear();
            System.out.println("Ingrese el titulo de la pelicula");
            String titulo = leer.nextLine();

            System.out.println("Ingrese su director");
            String director = leer.nextLine();

            System.out.println("Ingrese la duración de la pelicula en horas");
            double duracion = leer.nextDouble();
            leer.nextLine();

            System.out.println("Ingrese los 3 actores");
            actores.add(leer.nextLine());
            actores.add(leer.nextLine());
            actores.add(leer.nextLine());
            
            Pelicula peliculaaux = new Pelicula(titulo, director, duracion, new ArrayList<String>(actores));
            peliculas.add(peliculaaux);

            System.out.println("Desea ingresar más peliculas?");
            salir = leer.nextLine();
            
        } while (salir.equals("Si") || (salir.equals("si")));
        
        
        do {
            System.out.println("----MENU----");
            System.out.println("1. Mostrar peliculas");
            System.out.println("2. Mostrar peliculas con una duracion de mas de 1 hora");
            System.out.println("3. Ordenar las peliculas de menor a mayor de a cuerdo a su duracion");
            System.out.println("4. Ordenar las peliculas de mayor a menor de a cuerdo a su duracion");
            System.out.println("5. Ordenar las películas por título alfabéticamente ");
            System.out.println("6. Ordenar las películas por director alfabéticamente");
            System.out.println("7. Salir");
            menu = leer.nextInt();
            leer.nextLine();

            switch (menu) {
                case 1:
                    for (Pelicula aux : peliculas) {
                        System.out.println(aux.getTitulo());
                        aux.getActores();
                    }
                    
                    break;

                case 2:
                    for (Pelicula aux : peliculas) {
                        if (aux.getDuracion() > 1) {
                            System.out.println(aux.getTitulo() + " Duracion: " + aux.getDuracion());
                        }
                    }
                    break;

                case 3:
                    peliculas.sort(Pelicula.compararDuracion);
                    for (Pelicula aux : peliculas) {
                        System.out.println(aux.getTitulo());
                    }
                    break;
                case 4:
                    peliculas.sort(Pelicula.compararDuracion);
                    Collections.reverse(peliculas);
                    for (Pelicula aux : peliculas) {
                        System.out.println(aux.getTitulo() + " Duracion: " + aux.getDuracion());
                    }
                    break;
                case 5:
                    peliculas.sort(Pelicula.compararTitulo);
                    for (Pelicula aux : peliculas) {
                        System.out.println(aux.getTitulo());
                    }
                    break;
                case 6:
                    peliculas.sort(Pelicula.compararDirector);
                    for (Pelicula aux : peliculas) {
                        System.out.println(aux.getTitulo() + " Director: " + aux.getDirector());
                    }
                    break;
            }
        } while (menu != 7);

    }

}
