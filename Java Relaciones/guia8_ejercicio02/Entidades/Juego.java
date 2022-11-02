/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */

package Entidades;
import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        this.jugadores = jugadores;
        this.revolver = r;
    }

    public void ronda(){
        boolean finronda = false;
        int numRonda = 0;
        do {
            for (Jugador jugador : jugadores) {
                numRonda++;
                if (jugador.disparo(revolver) == true) {
                    System.out.println(jugador.getId() + " fue mojado por la bala en la ronda "+numRonda+". Fin del juego.");
                    finronda = true;
                    break;
                }
            }
        } while (finronda == false);
        

    }

}
