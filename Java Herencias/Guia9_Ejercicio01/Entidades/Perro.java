/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
 */

package Guia9_Ejercicio01.Entidades;


public class Perro extends Animal {
    public Perro(String nombre, String alimento, int edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }
    
    @Override
    public void alimentarse() {
        super.alimentarse();
        System.out.println("El perro " + nombre+ " se alimenta de " + alimento);
    }
}
