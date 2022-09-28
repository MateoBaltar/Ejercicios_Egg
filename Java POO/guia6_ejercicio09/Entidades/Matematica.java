/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guia6_ejercicio9.Entidades;

/**
 *
 * @author mateo
 */
public class Matematica {
    private double numero1;
    private double numero2;

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double devolverMayor() {
        double mayor;
        if (numero1 > numero2) {
            mayor = numero1;
        } else {
            mayor = numero2;
        }
        return mayor;
    }
    
    public int calcularPotencia(){
        int potencia;
        if (numero1 > numero2) {
            potencia = (int) Math.abs(Math.pow(numero1, numero2));
        } else {
            potencia = (int) Math.abs(Math.pow(numero2, numero1));
        }
        return potencia;
    }
    
    public int calculaRaiz(){
        int raiz;
        if (numero1 > numero2) {
            raiz = (int) Math.sqrt(numero2);
        } else {
            raiz = (int) Math.sqrt(numero1);
        }
        return raiz;
    }
}
