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

package guia7_ejercicio03;
import guia7_ejercicio03.Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author mateo
 */
public class Guia7_Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList();
        String salir;
        
        
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.nextLine();
            
            System.out.println("Ingrese sus 3 notas");
            int nota1 = leer.nextInt();
            int nota2 = leer.nextInt();
            int nota3 = leer.nextInt();
            leer.nextLine();
            
            Alumno alumnoaux = new Alumno(nombre, nota1, nota2, nota3);
            alumnos.add(alumnoaux);
            
            System.out.println("Desea ingresar mas alumnos?");
            salir = leer.nextLine();
            
        } while (salir.equals("Si") || (salir.equals("si")));
        
        do {
            boolean encontrado = false;
            
            System.out.println("De que alumno desea calcular la nota final?");
            String buscaAlumno = leer.nextLine();

            for (Alumno aux : alumnos) {
                if (aux.getNombre().equals(buscaAlumno)) {
                    System.out.println("La nota final del alumno " + aux.getNombre() + " es: " + aux.notaFinal());
                    encontrado = true;
                }
            }
            if (encontrado == false) {
                System.out.println("El alumno que busca no fue encontrado.");
            }
            
            System.out.println("Desea buscar a otro alumno?");
            salir = leer.nextLine();
            
        } while (salir.equals("Si") || (salir.equals("si")));
    }

}
