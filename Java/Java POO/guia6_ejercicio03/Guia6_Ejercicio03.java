/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */

package guia6_ejercicio03;

import guia6_ejercicio03.Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int menu;
        Operacion numeros = new Operacion();
        System.out.println("Ingrese el primer numero");
        numeros.setNumero1(leer.nextInt());
        
        System.out.println("Ingrese el segundo numero");
        numeros.setNumero2(leer.nextInt());
        
        do {
            System.out.println("Que quiere hacer?");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            
            switch (menu){
                case 1: System.out.println("La suma de los numeros es= " + numeros.sumar());
                break;
                case 2: System.out.println("La resta de los numeros es= " + numeros.restar());
                break;
                case 3: System.out.println("La multiplicacion de los numeros es= " + numeros.multiplicar());
                break;
                case 4: System.out.println("La division de los numeros es= " + numeros.dividir());
                break;
                default: System.out.println("Nos vemos");
            } 
        } while (menu != 5);
        
        
    }

}
