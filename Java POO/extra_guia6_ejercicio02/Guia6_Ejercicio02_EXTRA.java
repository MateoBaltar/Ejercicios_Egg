/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
 */

package guia6_ejercicio02_extra;

import guia6_ejercicio02_extra.Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio02_EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Puntos coordenadas1 = new Puntos();
        coordenadas1.crearPuntos();
        
        System.out.println("La distancia entre los puntos es= "+ coordenadas1.calcularDistancia());
    }

}
