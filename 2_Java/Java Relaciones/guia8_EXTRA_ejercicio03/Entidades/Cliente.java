/*
clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
 */

package guia8_EXTRA_ejercicio03.Entidades;

import java.util.Scanner;

public class Cliente {
    

    Scanner leer = new Scanner(System.in);

    private String nombre;
    private String apellido;
    private long documento;
    private String mail;
    private String domicilio;
    private long telefono;

    private Vehiculo vehiculo = new Vehiculo();

    public void registrarCliente(){
        String salir;

        do {
            System.out.println("REGISTRAR CLIENTE");
            System.out.println("Ingrese el nombre y apellido del cliente");
            String nombreCompleto = leer.nextLine();
            int idx = nombreCompleto.lastIndexOf(' ');

            this.nombre = nombreCompleto.substring(0, idx);
            this.apellido = nombreCompleto.substring(idx+1);

            System.out.println("Ingrese el numero de documento de " + nombreCompleto);
            this.documento = leer.nextLong();
            leer.nextLine();

            System.out.println("Ingrese el mail");
            this.mail = leer.nextLine();

            System.out.println("Ingrese el domicilio");
            this.domicilio = leer.nextLine();

            System.out.println("Ingrese el numero de telefono");
            this.telefono = leer.nextLong();
            leer.nextLine();

            System.out.println("-- INFORMACION DEL CLIENTE --");
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Numero de documento: " + documento);
            System.out.println("Mail: " + mail);
            System.out.println("Domicilio: " + domicilio);
            System.out.println("Telefono: " + telefono);
            System.out.println("-----------------------------");

            System.out.println("Es la informacion del cliente correcta?");
            salir = leer.nextLine();
            
        } while (salir.equals("No") || salir.equals("no"));
        System.out.println("Cliente registrado correctamente. Procediendo a registrar vehiculo del cliente " + nombre + " " + apellido);
        this.vehiculo.registrarVehiculo();
    }

    public String getNombreCompleto(){
        return nombre + " " + apellido;
    }
    
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    @Override
    public String toString() {
        return "[ Nombre completo: " + nombre +" "+apellido + ", documento: " + documento
                + ", mail: " + mail + ", domicilio: " + domicilio + ", telefono: " + telefono + " ]";
    }
}
