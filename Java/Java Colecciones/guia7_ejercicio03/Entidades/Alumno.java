/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package guia7_ejercicio03.Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Alumno {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
    }

    public Alumno(String nombre, int nota1, int nota2, int nota3) {
        this.notas = new ArrayList();
        this.nombre = nombre;
        this.notas.add(nota1);
        this.notas.add(nota2);
        this.notas.add(nota3);
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    public int notaFinal(){
        int promedio = (int)((notas.get(0)+notas.get(1)+notas.get(2)) / 3);
        
        return promedio;
    }
    
}
