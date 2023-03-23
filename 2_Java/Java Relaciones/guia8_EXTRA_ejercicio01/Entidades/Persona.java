/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_EXTRA_ejercicio01.Entidades;

/**
 *
 * @author mateo
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private long documento;

    private Perro perro;

    public Persona(){

    }

    public Persona(String nombre, String apellido, int edad, long documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    @Override
    public String toString(){
        return "Persona{" + "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Documento: " + documento +'}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
}
