/*
nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones.
 */

package guia8_EXTRA_ejercicio04.Entidades;

public class Alumno {
    
    
    private String nombreCompleto;
    private long dni;
    private int cantidadVotos = 0;

    
    public Alumno(String nombreCompleto, long dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }


    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }


    public long getDni() {
        return dni;
    }


    public void setDni(long dni) {
        this.dni = dni;
    }


    public int getCantidadVotos() {
        return cantidadVotos;
    }


    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public void sumarVoto(){
        this.cantidadVotos += 1;
    }
}
