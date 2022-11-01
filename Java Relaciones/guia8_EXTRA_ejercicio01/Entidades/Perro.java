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
public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private int tamanio;

    public Perro(){

    }

    public Perro(String nombre, String raza, int edad, int tamanio){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    @Override
    public String toString(){
        return "Perro{" + " Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + ", Tamaño: " + tamanio + "cm }";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
