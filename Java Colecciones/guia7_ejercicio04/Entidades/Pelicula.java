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

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package guia7_ejercicio04.Entidades;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author mateo
 */
public class Pelicula {
    private String titulo;
    private String director;
    private double duracion;
    private ArrayList<String> actores;
    
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion, ArrayList<String> actores) {
        actores = new ArrayList();
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.actores = actores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    public void getActores(){
        for (String aux : this.actores) {
            System.out.println(aux);
        }
    }
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            Integer temporal1 =(int)(t.getDuracion() * 60);
            Integer temporal2 =(int)(t1.getDuracion() * 60);
            return temporal1.compareTo(temporal2);
        }
    };
    
     public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {

        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
     
      public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {

        @Override
         public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}


