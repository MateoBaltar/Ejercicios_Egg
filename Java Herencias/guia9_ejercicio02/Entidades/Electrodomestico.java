/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio.
 */

package guia9_ejercicio02.Entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumo;
    protected int peso;

    public Electrodomestico(){
    }

    public Electrodomestico(double precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        switch (letra) {
            case 'A':
            this.consumo = 'A';
            break;
            case 'B':
            this.consumo = 'B';
            break;
            case 'C':
            this.consumo = 'C';
            break;
            case 'D':
            this.consumo = 'D';
            break;
            case 'E':
            this.consumo = 'E';
            break;
            case 'F':
            this.consumo = 'F';
            break;
            default:
            this.consumo = 'F';
            break;
        }
    }

    public void comprobarColor(String color){
        color = color.toLowerCase();
        switch (color) {
            case "blanco":
            this.color = "Blanco";
            break;
            case "negro":
            this.color = "Negro";
            break;
            case "azul":
            this.color = "Azul";
            break;
            case "rojo":
            this.color = "Rojo";
            break;
            case "gris":
            this.color = "Gris";
            break;
            default:
            this.color = "Blanco";
            break;
        }
    }

    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el color del electrodomestico");
        String color = leer.nextLine();
        comprobarColor(color);
        System.out.println("Ingrese el consumo (Letra de la A a la F)");
        char letra = leer.nextLine().charAt(0);
        comprobarConsumoEnergetico(letra);
        System.out.println("Ingrese el peso");
        this.peso = leer.nextInt();
        System.out.println("Ingrese el precio (precio de base $1000)");
        int precioAgrega = leer.nextInt();
        this.precio = 1000 + precioAgrega;
    }

    public double precioFinal(){
        switch (this.consumo) {
            case 'A':
            if (this.peso >= 1  && this.peso <= 19){
                this.precio = this.precio + 1000 + 100;
            } else if (this.peso >= 20  && this.peso <= 49) {
                this.precio = this.precio + 1000 + 500;
            }else if (this.peso >= 50  && this.peso <= 79) {
                this.precio = this.precio + 1000 + 800;
            }else if (this.peso >= 80) {
                this.precio = this.precio + 1000 + 1000;
            }

            break;

            case 'B':
            if (this.peso >= 1  && this.peso <= 19){
                this.precio = this.precio + 800 + 100;
            } else if (this.peso >= 20  && this.peso <= 49) {
                this.precio = this.precio + 800 + 500;
            }else if (this.peso >= 50  && this.peso <= 79) {
                this.precio = this.precio + 800 + 800;
            }else if (this.peso >= 80) {
                this.precio = this.precio + 800 + 1000;
            }
            break;
            case 'C':
            if (this.peso >= 1  && this.peso <= 19){
                this.precio = this.precio + 600 + 100;
            } else if (this.peso >= 20  && this.peso <= 49) {
                this.precio = this.precio + 600 + 500;
            }else if (this.peso >= 50  && this.peso <= 79) {
                this.precio = this.precio + 600 + 800;
            }else if (this.peso >= 80) {
                this.precio = this.precio + 600 + 1000;
            }
            break;
            case 'D':
            if (this.peso >= 1  && this.peso <= 19){
                this.precio = this.precio + 500 + 100;
            } else if (this.peso >= 20  && this.peso <= 49) {
                this.precio = this.precio + 500 + 500;
            }else if (this.peso >= 50  && this.peso <= 79) {
                this.precio = this.precio + 500 + 800;
            }else if (this.peso >= 80) {
                this.precio = this.precio + 500 + 1000;
            }
            break;
            case 'E':
            if (this.peso >= 1  && this.peso <= 19){
                this.precio = this.precio + 300 + 100;
            } else if (this.peso >= 20  && this.peso <= 49) {
                this.precio = this.precio + 300 + 500;
            }else if (this.peso >= 50  && this.peso <= 79) {
                this.precio = this.precio + 300 + 800;
            }else if (this.peso >= 80) {
                this.precio = this.precio + 300 + 1000;
            }
            break;
            case 'F':
            if (this.peso >= 1  && this.peso <= 19){
                this.precio = this.precio + 100 + 100;
            } else if (this.peso >= 20  && this.peso <= 49) {
                this.precio = this.precio + 100 + 500;
            }else if (this.peso >= 50  && this.peso <= 79) {
                this.precio = this.precio + 100 + 800;
            }else if (this.peso >= 80) {
                this.precio = this.precio + 100 + 1000;
            }
            break;
            default:
            break;
        }
        return this.precio;
    }
}
