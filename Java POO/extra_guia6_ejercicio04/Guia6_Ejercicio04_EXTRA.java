/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde. Dispondrá de los siguientes métodos:
• Métodos getters y setters para el número de DNI y la letra.
• Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
• Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
mayúscula; por ejemplo: 00395469-F).
 */

package guia6_ejercicio04_extra;

import guia6_ejercicio04_extra.Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio04_EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        NIF verificador1 = new NIF();
        verificador1.crearNif();
        
        System.out.println("Su NIF es: "+ verificador1.mostrar());
    }

}
