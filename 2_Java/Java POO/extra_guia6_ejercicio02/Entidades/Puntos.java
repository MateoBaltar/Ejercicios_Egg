/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
 */
package guia6_ejercicio02_extra.Entidades;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Puntos {
    Scanner leer = new Scanner(System.in);
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Puntos() {
    }

    public Puntos(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        System.out.println("Ingrese las coordenadas de X (X1,X2)");
        this.x1= leer.nextInt();
        this.x2= leer.nextInt();
        System.out.println("Ahora ingrese las coordenadas de Y (Y1,Y2)");
        this.y1= leer.nextInt();
        this.y2= leer.nextInt();
    }
    
    public int calcularDistancia(){
        int distancia = (int) Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return distancia;
    }
    
}
