/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
*/
package guia8_ejercicio03;
import java.util.Scanner;

import Entidades.Baraja;
public class guia8_ejercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        Baraja baraja = new Baraja();
        int menu;
        baraja.crearBaraja();
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1. Barajar el maso");
            System.out.println("2. Repartir la siguiente carta");
            System.out.println("3. Mostrar la cantidad de cartas disponibles");
            System.out.println("4. Repartir un numero de cartas indicado");
            System.out.println("5. Mostrar la cantidad de cartas ya fuera de juego");
            System.out.println("6. Mostrar todas las cartas en la baraja");
            System.out.println("7. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1: baraja.barajar();
                System.out.println("Maso barajado");
                    break;
                case 2: System.out.println(baraja.siguienteCarta());
                    break;
                case 3: System.out.println(baraja.cartasDisponibles());
                    break;
                case 4: System.out.println("Cuantas cartas desea?");
                int cantidad = leer.nextInt();
                    baraja.darCartas(cantidad);
                    break;
                case 5: baraja.cartasMonton();
                    break;
                case 6: baraja.mostrarBaraja();
                    break;
                default:
                    System.out.println("Adios!");
                    break;
            }
        } while (menu != 7);
    }
}
