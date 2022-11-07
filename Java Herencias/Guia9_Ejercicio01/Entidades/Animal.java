/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
 */
package Guia9_Ejercicio01.Entidades;

public class Animal {
    
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String razaAnimal;

    public Animal(String nombre, String alimento, int edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }

    public void alimentacion(){
    }
}
