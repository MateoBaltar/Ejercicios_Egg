/*
Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
 */
package guia8_EXTRA_ejercicio04.Entidades;

import java.util.ArrayList;

public class Voto {
    
    private Alumno alumno;
    private ArrayList<Alumno> votos = new ArrayList<>();


    public Voto(Alumno alumno) {
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public ArrayList<Alumno> getVotos() {
        return votos;
    }
    public void setVotos(ArrayList<Alumno> votos) {
        this.votos = votos;
    }
    
}
