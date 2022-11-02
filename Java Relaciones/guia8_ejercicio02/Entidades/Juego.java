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
import java.util.Scanner;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;
/*
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
 */
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r){
        this.jugadores = jugadores;
        this.revolver = r;
    }
/*
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
    public void ronda(){
        Scanner leer = new Scanner(System.in);

        boolean finronda = false;
        int numRonda = 0;
        int eleccion;
        do {
            for (Jugador jugador : jugadores) {
                numRonda++;
                boolean skip = false;
                do {
                    System.out.println("Jugador: " + jugador.getId() + ". Que desea hacer? [Posee comodin? " + jugador.isComodin()+"]");
                    System.out.println("1. Jalar el gatillo");
                    System.out.println("2. Verificar donde esta la bala (Consume comodin)");
                    System.out.println("3. Pasar el arma (Consume comodin)");
                    eleccion = leer.nextInt();
                    switch (eleccion) {
                        case 1:if (jugador.disparo(revolver) == true) {
                            System.out.println(jugador.getId() + " fue mojado por la bala en la ronda "+numRonda+". Fin del juego.");
                            finronda = true;
                        }
                        break;

                        case 2: if (jugador.isComodin() == true) {
                            jugador.setComodin(false);
                            System.out.println(revolver.toString());

                        } else if (jugador.isComodin() == false) {
                            System.out.println("Ya uso el comodin, no puede volver a usarlo");
                        }
                        break;

                        case 3: if (jugador.isComodin() == true) {
                            skip = true;
                            jugador.setComodin(false);
                            break;
                        } else if (jugador.isComodin() == false) {
                            System.out.println("Ya uso el comodin, no puede volver a usarlo");
                        }
                    }
                    
                } while (eleccion != 1 && skip == false);
                if (finronda == true) {
                    break;
                }
                
            }
        } while (finronda == false);
        

    }

}
