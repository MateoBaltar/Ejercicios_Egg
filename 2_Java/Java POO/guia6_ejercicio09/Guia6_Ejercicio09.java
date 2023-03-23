/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guia6_ejercicio9;

import guia6_ejercicio9.Entidades.Matematica;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Matematica numeros1 = new Matematica((double) Math.ceil(Math.random() * 20), (double) Math.ceil(Math.random() * 20));
        int menu;

        do {
            System.out.println("Que desea hacer?");
            System.out.println("1. Saber cual es el mayor");
            System.out.println("2. Calcular la potencia del mayor por el menor");
            System.out.println("3. Calcular la raiz del menor");
            System.out.println("4. Salir");
            menu = leer.nextInt();

            switch (menu) {
                case 1: System.out.println("El mayor de ambos numeros es: " + numeros1.devolverMayor());
                break;
                case 2:System.out.println("El la potencia del mayor es: " + numeros1.calcularPotencia());
                break;
                case 3:System.out.println("La raiz del menor es: " + numeros1.calculaRaiz());
                break;

            }
        } while (menu != 4);
    }

}
