/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */

package guia9_ejercicio02.Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int precio, String color, char consumo, int peso, int carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }
    

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora(){
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Ingrese el peso de la carga de la lavadora");
        this.carga = leer.nextInt();
    }

    public double precioFinal(){
        if (this.carga > 30){
            this.precio = super.precioFinal() + 500;
            return this.precio;
        }
        return super.precioFinal();
    }
}
