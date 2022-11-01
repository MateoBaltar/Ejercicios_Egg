/*
Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
 */

package guia8_EXTRA_ejercicio03.Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Poliza {
    Scanner leer = new Scanner(System.in);

    private Vehiculo vehiculo;
    private Cliente cliente;
    private ArrayList<Cuota> cuotas;
    private long numeroPoliza;
    private Date inicio;
    private Date fin;
    private int cantidadCuotas;
    private int montoAsegurado;
    private int maxGranizo;
    private boolean granizo;
    private String formaPago;
    private String tipo;

    public void registrarPoliza(List<Cliente> clientes, List<Vehiculo> vehiculos){
        int x = 0;
        System.out.println("De que cliente es esta poliza?");
        for (Cliente cliente : clientes) {
            System.out.println(x + ". " + cliente.getNombreCompleto());
            x++;
        }
        System.out.println("-----------");
        int eleccion = leer.nextInt();
        this.cliente = clientes.get(eleccion);

        x = 0;
        System.out.println("Indique cual es el vehiculo de " + cliente.getNombreCompleto() + " a partir del numero de motor");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(x+ ". " + vehiculo.getChasis());
        }
        System.out.println("-----------");
        eleccion = leer.nextInt();
        this.vehiculo = vehiculos.get(eleccion);

        System.out.println("REGISTRAR POLIZA");
        System.out.println("Ingrese el numero de la poliza");
        this.numeroPoliza = leer.nextLong();

        System.out.println("Ingrese la fecha de inicio de la poliza (DD/MM/AAAA)" );
        inicio.setDate(leer.nextInt());
        inicio.setMonth(leer.nextInt());
        inicio.setYear(leer.nextInt());

        System.out.println("Ingrese la fecha de fin de la poliza (DD/MM/AAAA)");
        fin.setDate(leer.nextInt());
        fin.setMonth(leer.nextInt());
        fin.setYear(leer.nextInt());

        System.out.println("Ingrese la cantidad de cuotas");
        this.cantidadCuotas = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese la forma de pago");
        this.formaPago = leer.nextLine();

        System.out.println("Ingrese el monto total asegurado");
        this.montoAsegurado = leer.nextInt();
        leer.nextLine();


        System.out.println("El seguro incluye granizo?");
        if (leer.nextLine().equals("Si") || leer.nextLine().equals("si")){
            this.granizo = true;
        } else{
            granizo = false;
        }

        if (granizo == true) {
            System.out.println("Ingrese el monto asegurado por granizo");
            this.maxGranizo = leer.nextInt();
            leer.nextLine();
        } else {
            this.maxGranizo = 0;
        }

        System.out.println("Ingrese el tipo de cobertura");
        this.tipo = leer.nextLine();
    }

}
