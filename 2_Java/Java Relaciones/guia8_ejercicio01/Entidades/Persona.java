/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejercicio01.Entidades;

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

    public Persona(String nombre, String apellido, int edad, long documento, Perro perro){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    @Override
    public String toString(){
        return "Persona{" + "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Documento: " + documento + ", Perro: " + perro + '}';
    }
}
