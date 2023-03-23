/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package guia9_ejercicio04.Entidades;

import java.util.Scanner;

public class Rectangulo implements calculosFormas {
    private int base;
    private int altura;

    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura");
        this.altura = leer.nextInt();
    }

    @Override
    public double calculoArea() {
        return (base * altura);
    }

    @Override
    public double calculoPerimetro() {
        return ((base+altura)*2);
    }
    
}
