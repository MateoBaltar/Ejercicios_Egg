/*
Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.

a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.

b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).

c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.

d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.
 */

package guia8_EXTRA_ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

import guia8_EXTRA_ejercicio03.Entidades.Cliente;
import guia8_EXTRA_ejercicio03.Entidades.Poliza;
import guia8_EXTRA_ejercicio03.Entidades.Vehiculo;

public class guia8_EXTRA_ejercicio03 {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Poliza> polizas = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    
        int menu;
        String salir;

        do {
            System.out.println("La Tercera Seguros");
            System.out.println("--MENU PRINCIPAL--");
            System.out.println("1. Gestión Integral de clientes");
            System.out.println("2. Gestión de vehículos");
            System.out.println("3. Gestión de Pólizas");
            System.out.println("4. Gestión de cuotas");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            leer.nextLine();

            switch (menu) {
                case 1: do {
                    Cliente cliente = new Cliente();
                    cliente.registrarCliente();
                    clientes.add(cliente);

                    System.out.println("Desea introducir otro cliente?");
                    salir = leer.nextLine();
                } while (salir.equals("Si") || salir.equals("si"));
                break;


                case 2:do {
                    Vehiculo vehiculo = new Vehiculo();
                    vehiculo.registrarVehiculo();
                    vehiculos.add(vehiculo);
                    salir = leer.nextLine();
                } while (salir.equals("Si") || salir.equals("si"));
                break; 


                case 3: do {
                    Poliza poliza = new Poliza();
                    poliza.registrarPoliza(clientes, vehiculos);
                    polizas.add(poliza);

                    System.out.println("Desea introducir otro cliente?");
                    salir = leer.nextLine();
                } while (salir.equals("Si") || salir.equals("si"));
                break;

                case 4:
                break; 


                default:
                    break;
            }
        } while (menu != 5);
    }
}
