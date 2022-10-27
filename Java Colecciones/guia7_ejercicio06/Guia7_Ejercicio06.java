/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */

package guia7_ejercicio06;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 *
 * @author mateo
 */
public class Guia7_Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<String, Integer> producto = new HashMap();
        int menu;
        String item;
        int precio;

        do {
            System.out.println("----MENU----");
            System.out.println("1. Introducir producto");
            System.out.println("2. Modificar precio de producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar los productos");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            leer.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Ingrese el nombre del producto");
                    item = leer.nextLine();
                    System.out.println("Ahora ingrese su valor");
                    precio = leer.nextInt();
                    leer.nextLine();
                    producto.put(item, precio);
                    break;
                    
                case 2:
                    System.out.println("Que producto desea modificar?");
                    item = leer.nextLine();
                    boolean encontrado = false;
                    for (Map.Entry<String, Integer> entry : producto.entrySet()) {
                        if (entry.getKey().equals(item)) {
                            System.out.println("El valor actual del producto " + entry.getKey() + " es $" + entry.getValue());
                            System.out.println("Ingrese el nuevo valor");
                            precio = leer.nextInt();
                            leer.nextLine();
                            entry.setValue(precio);
                            encontrado = true;
                        }
                    }
                    if (encontrado == false) {
                        System.out.println("El producto no fue encontrado");
                    }
                    break;

                case 3:
                    System.out.println("Que producto desea eliminar?");
                    producto.remove(leer.nextLine());
                    break;

                case 4:
                    for (Map.Entry<String, Integer> entry : producto.entrySet()) {
                        System.out.println("Producto:" + entry.getKey() + "| Precio: $" + entry.getValue());
                    }
            }
        } while (menu != 5);
    }

}
