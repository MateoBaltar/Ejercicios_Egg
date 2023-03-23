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
import guia8_EXTRA_ejercicio03.Entidades.Cuota;
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
                case 1: if (clientes.size() == 0) {
                    System.out.println("No hay clientes registrados. Desea registrar uno?");
                    String registrar = leer.nextLine();
                    if (registrar.equals("No") || registrar.equals("no")) {
                       break; 
                    }
                } else {
                    for (Cliente cliente : clientes) {
                        System.out.println(cliente.toString());
                    }
                    System.out.println("Desea introduir otro cliente?");
                    String registrar = leer.nextLine();
                    if (registrar.equals("No") || registrar.equals("no")) {
                       break; 
                    }
                }
                
                    do {
                    Cliente cliente = new Cliente();
                    cliente.registrarCliente();
                    clientes.add(cliente);
                    vehiculos.add(cliente.getVehiculo());
                    System.out.println("Desea introducir otro cliente?");
                    salir = leer.nextLine();
                } while (salir.equals("Si") || salir.equals("si"));
                break;


                case 2:  if (vehiculos.size() == 0) {
                    System.out.println("No hay vehiculos registrados. Desea registrar un cliente con vehiculo?");
                    String registrar = leer.nextLine();
                    if (registrar.equals("No") || registrar.equals("no")) {
                       break; 
                    }
                } else {
                    for (Vehiculo vehiculo : vehiculos) {
                        System.out.println(vehiculo.toString());
                    }
                    System.out.println("Desea introduir otro cliente con vehiculo?");
                    String registrar = leer.nextLine();
                    if (registrar.equals("No") || registrar.equals("no")) {
                       break; 
                    }
                }
                
                    Cliente cliente = new Cliente();
                    cliente.registrarCliente();
                    clientes.add(cliente);
                    vehiculos.add(cliente.getVehiculo());

                break; 


                case 3: do {
                    if (polizas.isEmpty()) {
                        System.out.println("No hay polizas registrados. Desea registrar una?");
                        String registrar = leer.nextLine();
                        if (registrar.equals("No") || registrar.equals("no")) {
                           break; 
                        }
                    } else {
                        for (Poliza poliza : polizas) {
                            System.out.println(poliza.toString());
                        }
                        System.out.println("Desea registrar una nueva poliza?");
                        String registrar = leer.nextLine();
                        if (registrar.equals("No") || registrar.equals("no")) {
                           break; 
                        }
                    }
                    Poliza poliza = new Poliza();
                    poliza.registrarPoliza(clientes, vehiculos);
                    polizas.add(poliza);
                    System.out.println("Desea introducir otra poliza?");
                    salir = leer.nextLine();
                } while (salir.equals("Si") || salir.equals("si"));
                break;

                case 4: if (polizas.isEmpty()) {
                    System.out.println("No hay polizas registrados. Desea registrar una?");
                    String registrar = leer.nextLine();
                    if (registrar.equals("No") || registrar.equals("no")) {
                       break; 
                    }
                } else {
                    int x = 1;
                    System.out.println("De cual poliza quiere saber las cuotas?");
                    for (Poliza poliza : polizas) {
                        System.out.println(x + poliza.toString());
                        x++;
                    }
                    System.out.println("------------");
                    int eleccion = leer.nextInt();
                    for (Cuota cuota : polizas.get(eleccion-1).getCuotas()) {
                        System.out.println(cuota.toString());
                    }
                }
                break; 


                default:
                    break;
            }
        } while (menu != 5);
    }
}
