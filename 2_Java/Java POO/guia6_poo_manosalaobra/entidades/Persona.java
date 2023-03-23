/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_poo_manosalaobra.entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Persona {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private int dni;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Date nacimiento, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    
    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "leer=" + leer + ", nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + ", dni=" + dni + '}';
    }
    
    
}
