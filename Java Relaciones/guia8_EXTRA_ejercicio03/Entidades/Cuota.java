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
    private Date vencimiento;
    private String formaPago;

    public void registrarCuota(){
        System.out.println("REGISTRA CUOTA");
        System.out.println("Ingrese el numero de cuota");
        this.numeroCuota = leer.nextInt();

        System.out.println("Ingrese el monto a pagar");
        this.monto = leer.nextInt();

        System.out.println("Esta pagada la cuota?");
        if (leer.nextLine().equals("Si") || leer.nextLine().equals("si")){
            this.pagada = true;
        } else {
            
        }
    }
}
