/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = pi * radio^2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * pi * radio).
 */

package guia6_ejercicio02;

import guia6_ejercicio02.Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        
        System.out.println("Ingrese el radio del circulo");
        int radio = leer.nextInt();
        Circunferencia circun1 = new Circunferencia(radio);
        

        System.out.println("El area del circulo es= " + circun1.getArea());
        
        System.out.println("El periometro del circulo es= " + circun1.getPerimetro());
        
    }

}
