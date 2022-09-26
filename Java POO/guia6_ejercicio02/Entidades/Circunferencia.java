/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = pi * radio^2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * pi * radio).
 */
package guia6_ejercicio02.Entidades;

import static java.lang.Math.PI;

/**
 *
 * @author mateo
 */
public class Circunferencia {
    
    private int radio;
    
    public Circunferencia() {
    }

    public Circunferencia(int radio) {
        setRadio(radio);
    }
    
    public int getRadio() {
        return radio;
    }

    private void setRadio(int radio) {
        this.radio = radio;
    }

    public double getArea() {
        return PI * (radio * radio);
    }

    public double getPerimetro() {
        return 2 * PI * radio;
    }

    
    
}
