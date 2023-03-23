/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package guia6_ejercicio06;

import guia6_ejercicio06.Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera cafetera1 = new Cafetera();
        int menu;
        boolean correcto = false;
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1. Llenar la cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar la cafetera");
            System.out.println("4. Cargar cafe");
            System.out.println("5. Salir");
            menu = leer.nextInt();

            switch (menu) {
                case 1: cafetera1.llenarCafetera();
                    System.out.println("Cafetera rellenada completamente");
                    break;
                case 2: do {
                    System.out.println("Ingrese el tamaño de la taza (chico, mediano, grande)");
                    String taza = leer.next();
                    if (taza.equals("chico")) {
                        cafetera1.servirTaza(2);
                        correcto = true;
                    } else if (taza.equals("mediano")) {
                        cafetera1.servirTaza(5);
                        correcto = true;
                    } else if (taza.equals("grande")){
                        cafetera1.servirTaza(10);
                        correcto = true;
                    }
                } while (correcto = false);
                break;
                case 3: cafetera1.vaciarCafetera();
                    System.out.println("la cafetera se vacio correctamente");
                    break;
                case 4: System.out.println("Ingrese la cantidad de cafe a cargar");
                cafetera1.agregarCafe(leer.nextInt());
                break;
            }
        } while (menu != 5);
    }

}
