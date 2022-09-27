/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */

package guia_ejercicio04;

import guia_ejercicio04.Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia_Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la base y la altura del rectangulo");
        Rectangulo rectangulo1 = new Rectangulo(leer.nextInt(),leer.nextInt());
        
        rectangulo1.dibujar(rectangulo1.getBase(), rectangulo1.getAltura());
        
        System.out.println("El perimetro del rectangulo es= " + rectangulo1.perimetro());
        System.out.println("La superficie del rectangulo es= " + rectangulo1.superficie());
    }

}
