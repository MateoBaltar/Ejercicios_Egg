/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */

package guia6_ejercicio11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Date fecha = new Date();
        
        System.out.println("Ingrese el dia, el mes y el año");
        fecha.setDate(leer.nextInt());
        fecha.setMonth(leer.nextInt()-1);
        fecha.setYear(leer.nextInt()-1900);
        
        Date fechaActual = new Date();
        
        System.out.println(fecha);
        
        System.out.println(fechaActual);
        
        if (fecha.getYear() > fechaActual.getYear()) {
            System.out.println("La diferencia de años entre la fecha ingresada y la actual es: " + (fecha.getYear() - fechaActual.getYear()));
        } else{
            System.out.println("La diferencia de años entre la fecha ingresada y la actual es: " + (fechaActual.getYear() - fecha.getYear()));
        }
    }

}
