/*
cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
*/

package guia8_EXTRA_ejercicio03.Entidades;

import java.util.Date;
import java.util.Scanner;

public class Cuota {
    

    Scanner leer = new Scanner(System.in);

    private int numeroCuota;
    private int monto;
    private boolean pagada;
    private Date vencimiento = new Date();
    private String formaPago;

    public void registrarCuota(){
        String salir;
        String estado;
        do {
            System.out.println("REGISTRA CUOTA");
            System.out.println("Ingrese el numero de cuota");
            this.numeroCuota = leer.nextInt();

            System.out.println("Ingrese el monto a pagar");
            this.monto = leer.nextInt();
            leer.nextLine();
            System.out.println("Esta pagada la cuota?");
            String confirma = leer.nextLine();
            if (confirma.equals("Si") || confirma.equals("si")){
            this.pagada = true;
            estado = "Pagada";
            } else {
                this.pagada = false;
                estado = "No pagada";
            }

            System.out.println("Ingrese la fecha de vencimiento (DD/MM/AAAA)");
            vencimiento.setDate(leer.nextInt());
            vencimiento.setMonth(leer.nextInt());
            vencimiento.setYear(leer.nextInt());
            leer.nextLine();

            System.out.println("Ingrese la forma de pago");
            formaPago = leer.nextLine();

            System.out.println("-- INFORMACION DEL CLIENTE --");
            System.out.println("Numero de cuota: " + numeroCuota);
            System.out.println("Monto a pagar: $" + monto);
            System.out.println("Estado de la cuota: " + estado);
            System.out.println("Fecha de vencimiento: " + vencimiento.getDate() + "/" + vencimiento.getMonth() + "/" + vencimiento.getYear());
            System.out.println("Forma de pago: " + formaPago);
            System.out.println("-----------------------------");

            System.out.println("Es la informacion de la cuota correcta??");
            salir = leer.nextLine();
            
        } while (salir.equals("No") || salir.equals("no"));
    }

    @Override
    public String toString() {
        return "[ Numero de cuota: " + numeroCuota + ", monto: " + monto + ", pagada: " + pagada + ", vencimiento: "
                + vencimiento.getDate()+"/"+vencimiento.getMonth()+"/"+vencimiento.getYear() + ", forma de pago: " + formaPago + " ]";
    }
}
