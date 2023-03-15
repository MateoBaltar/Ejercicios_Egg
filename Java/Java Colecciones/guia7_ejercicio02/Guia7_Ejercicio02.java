/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package guia7_ejercicio02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author mateo
 */
public class Guia7_Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> raza = new ArrayList();
        String salir;
        boolean encontrado = false;
        do {            
            System.out.println("Ingrese la raza de perros");
            raza.add(leer.nextLine());
            
            System.out.println("Quiere ingresar mas razas?");
            salir = leer.nextLine();
            
        } while (salir.equals("Si"));
        
        System.out.println("Las razas ingresadas son:");
        
        for (String aux : raza) {
            System.out.println(aux);
        }
        
        System.out.println("Ingrese una raza a eliminar de la lista");
        String razaEliminar = leer.nextLine();
        Iterator <String> it = raza.iterator();
        while (it.hasNext()) {
            if (it.next().equals(razaEliminar)){
                it.remove();
                encontrado = true;
            }
        }
        Collections.sort(raza);
        if (encontrado == true) {
            System.out.println("Eliminado exitosamente, aqui la lista:");
            for (String aux : raza) {
                System.out.println(aux);
            }
        } else {
            System.out.println("No se encontro la raza, aqui la lista nuevamente:");
            for (String aux : raza) {
                System.out.println(aux);
            }
        }
    }
    
}
