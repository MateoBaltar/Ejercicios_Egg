/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */

package guia7_ejercicio05;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author mateo
 */
public class Guia7_Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashSet<String> paises = new HashSet();
        
        String salir;
        boolean encontrado = false;
        
        do {            
            System.out.println("Ingrese un pais");
            paises.add(leer.nextLine());
            
            System.out.println("Desea agregar mas paises>");
            salir = leer.nextLine();
        } while (salir.equals("Si") || salir.equals("si"));
        
        for (String pais : paises) {
            System.out.println(pais);
        }
        ArrayList<String> paisesLista = new ArrayList(paises);
        
        
        System.out.println("Ingrese un pais a borrar de la lista");
        String borrar = leer.nextLine();
        
        Iterator<String> it = paisesLista.iterator();
        while (it.hasNext()) {
            if (it.next().equals(borrar)){
                it.remove();
                encontrado = true;
            }
        }
        if (encontrado == false){
            System.out.println("El pais no fue encontrado");
        } else {
             for (String pais : paisesLista) {
            System.out.println(pais);
        }
        }
       
    }
}
