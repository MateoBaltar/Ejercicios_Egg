/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos. 
 */

package guia9_ejercicio02.Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico{

    protected int resolucion;
    protected boolean sintonizador;

    public Televisor() {
    }
    
    public Televisor(int precio, String color, char consumo, int peso, int rosolucion, boolean sintonizador) {
        super(precio, color, consumo, peso);
        this.resolucion = rosolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor");
        this.resolucion = leer.nextInt();
        leer.nextLine();
        System.out.println("Tiene sintonizador TDT?");
        String tieneSintonizador = leer.nextLine();
        if (tieneSintonizador.equals("Si") || tieneSintonizador.equals("si")) {
            this.sintonizador = true;
        } else{
            this.sintonizador = false;
        }
    }

    public double precioFinal(){
        
        if (this.resolucion > 40){
            this.precio = super.precioFinal()+(this.precio * 0.30);
            if (sintonizador == true) {
                this.precio += 500;
                return this.precio;
            }
            return this.precio;
        }
        return super.precioFinal();
    }
}
