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
package guia9_ejercicio04;

import guia9_ejercicio04.Entidades.Circulo;
import guia9_ejercicio04.Entidades.Rectangulo;

public class guia9_ejercicio04 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Rectangulo rectangulo1 = new Rectangulo();

        System.out.println("Creando circulo:");
        circulo1.crearCirculo();

        System.out.println("Creando rectangulo:");
        rectangulo1.crearRectangulo();

        System.out.println("Area del circulo: " + circulo1.calculoArea());
        System.out.println("Perimetro del circulo: " + circulo1.calculoPerimetro());
        System.out.println("--------------------------------------");
        System.out.println("Area del rectangulo: " + rectangulo1.calculoArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo1.calculoPerimetro());
    }
}
