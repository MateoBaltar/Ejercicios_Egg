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
    private boolean comodin;

    public Jugador() {
    }

    public Jugador(String id, boolean mojado, boolean comodin) {
        this.id = id;
        this.mojado = mojado;
        this.comodin = comodin;
    }

/*
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
*/ 
    public boolean disparo(Revolver r){
        if (r.mojar() == true){
            this.mojado = true;
        } else {
            this.mojado = false;
            r.siguienteChorro();
        }
        return (mojado);
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
    public boolean isComodin(){
        return comodin;
    }
    public void setComodin(boolean comodin){
        this.comodin = comodin;
    }
    
}
