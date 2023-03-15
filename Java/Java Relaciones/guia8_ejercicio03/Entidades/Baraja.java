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

package guia8_ejercicio03.Entidades;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
    ArrayList<Carta> baraja = new ArrayList<>();

    public Baraja(){
        
    }

    public void crearBaraja() {
        String[] palos = {"Espadas","Bastos","Oros","Copas"};
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i !=9) {
                for (int j = 0; j < 4; j++) {
                    int numero = i;
                    Carta carta = new Carta(numero,palos[j]);
                    baraja.add(carta);
                }
            }
        }
    }
    public void barajar(){
        Collections.shuffle(baraja);
        for (Carta carta : baraja) {
            System.out.println(carta.toString());
        }
    }

    public String siguienteCarta(){
        Carta aux = baraja.get(0);
        baraja.remove(0);
        return aux.toString();
    }

    public int cartasDisponibles(){
        return baraja.size();
    }

    public void darCartas(int cantidad){
        if (baraja.size() < cantidad) {
            System.out.println("No hay suficientes cartas para repartir " + cantidad + " cartas");
        } else {
            System.out.println("Cartas repartidas:");
            for (int i = 0; i < cantidad; i++) {
                Carta aux = baraja.get(0);
                baraja.remove(0);
                System.out.println(aux.toString());
            }
        }
    }

    public void cartasMonton(){
        if (baraja.size()== 40) {
            System.out.println("Aun no se han descartado cartas");
        } else {
            System.out.println("Hay " + (40-baraja.size()) + " cartas en el monton");
        }
    }

    public void mostrarBaraja(){
        System.out.println("Cartas aun en la baraja:");
        for (Carta carta : baraja) {
            System.out.println(carta.toString());
        }
    }
}
