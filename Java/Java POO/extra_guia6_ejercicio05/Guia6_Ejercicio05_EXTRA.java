/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */

package guia6_ejercicio05_extra;

import guia6_ejercicio05_extra.Entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio05_EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Meses adivina1 = new Meses();
        
        System.out.println("Adivine el mes:");
        adivina1.adivinar(leer.next());
    }

}
