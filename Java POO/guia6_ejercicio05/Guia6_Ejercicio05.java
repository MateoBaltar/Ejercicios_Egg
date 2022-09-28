/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */

package guia6_ejercicio05;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        int menu;
        System.out.println("Ingrese el numero de cuenta");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        cuenta1.setDNI(leer.nextLong());
        System.out.println("Ingrese el saldo de su cuenta");
        cuenta1.setSaldoActual(leer.nextInt());
        
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extraccion rapida");
            System.out.println("4. Consultar su saldo");
            System.out.println("5. Consultar sus datos");
            System.out.println("6. Salir");
            menu = leer.nextInt();
            
            switch (menu) {
                case 1: System.out.println("Ingrese el monto a depositar");
                cuenta1.ingresar(leer.nextInt());
                break;
                case 2:System.out.println("Ingrese el monto a retirar");
                cuenta1.retirar(leer.nextInt());
                break;
                case 3:System.out.println("Ingrese el monto a retirar rapido");
                cuenta1.extraccionRapida(leer.nextInt());
                break;
                case 4:System.out.println("Su saldo actual es: $" + cuenta1.getSaldoActual());
                break;
                case 5: System.out.println(cuenta1.toString());
                break;
                default: System.out.println("Nos vemos");
                                    
            }
        } while ( menu != 6);
    }

}
