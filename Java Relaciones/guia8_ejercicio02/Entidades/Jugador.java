/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */

package Entidades;

public class Jugador {

    private String id;
    private boolean mojado;

    private Revolver revolver;

    public Jugador() {
    }

    public Jugador(String id, boolean mojado, Revolver revolver) {
        this.id = id;
        this.mojado = mojado;
        this.revolver = revolver;
    }
    
    public boolean disparo(){
        if (revolver.mojar() == true){
            this.mojado = false;
        } else {
            this.mojado = true;
            revolver.siguienteChorro();
        }
        return (mojado == false);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
}
