/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
 */

package Guia9_Ejercicio01;

import Guia9_Ejercicio01.Entidades.Animal;
import Guia9_Ejercicio01.Entidades.Caballo;
import Guia9_Ejercicio01.Entidades.Gato;
import Guia9_Ejercicio01.Entidades.Perro;


public class Guia9_Ejercicio01 {
    public static void main(String[] args) {
        
        Animal perro1 = new Perro("Stitch", "Carnivoro", 15, "Doberman");
        perro1.alimentarse();

        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();

        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.alimentarse();

        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.alimentarse();
    }
}
