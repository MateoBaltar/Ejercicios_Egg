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
        return '{' + " Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + ", Tamaño: " + tamanio + "cm }";
    }
}
