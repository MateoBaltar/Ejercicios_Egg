/*
vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
*/

package guia8_EXTRA_ejercicio03.Entidades;

import java.util.Scanner;

public class Vehiculo {
    Scanner leer = new Scanner(System.in);

    private String marca;
    private String modelo;
    private int anio;
    private long numeroMotor;
    private int chasis;
    private String color;
    private String tipo;

    public Vehiculo(){
    }
    
    public Vehiculo(String marca, String modelo, int anio, long numeroMotor, int chasis, String color, String tipo){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public void registrarVehiculo(){
        String salir;

        do {
            System.out.println("REGISTRAR VEHICULO");
            System.out.println("Ingrese la marca del vehiculo");
            this.marca = leer.nextLine();

            System.out.println("Ingrese el modelo del vehiculo");
            this.modelo = leer.nextLine();
            leer.nextLine();

            System.out.println("Ingrese el año");
            this.anio = leer.nextInt();
            leer.nextLine();

            System.out.println("Ingrese el numero de motor");
            this.numeroMotor = leer.nextLong();

            System.out.println("Ingrese el numero de chasis");
            this.chasis = leer.nextInt();
            leer.nextLine();

            System.out.println("Ingrese el color del vehiculo");
            this.color = leer.nextLine();

            System.out.println("Ingrese el tipo de vehiculo");
            this.tipo = leer.nextLine();

            System.out.println("---INFORMACION DEL VEHICULO---");
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Año: " + anio);
            System.out.println("Numero de motor: " + numeroMotor);
            System.out.println("Numero de chasis: " + chasis);
            System.out.println("Color: " + color);
            System.out.println("Tipo de vehiculo: " + tipo);
            System.out.println("------------------------------");
            
            System.out.println("Es la informacion del vehiculo correcta?");
            salir = leer.nextLine();
        } while (salir.equals("No") || salir.equals("no"));
    }

    public Scanner getLeer() {
        return leer;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public long getNumeroMotor() {
        return numeroMotor;
    }

    public int getChasis() {
        return chasis;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo [ Marca: " + marca + ", modelo: " + modelo + ", año: " + anio + ", numero de motor: " + numeroMotor
                + ", chasis: " + chasis + ", color: " + color + ", tipo: " + tipo + " ]";
    }
}
