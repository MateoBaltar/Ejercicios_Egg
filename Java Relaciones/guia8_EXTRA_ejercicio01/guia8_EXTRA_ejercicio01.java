/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */

package guia8_EXTRA_ejercicio01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import guia8_EXTRA_ejercicio01.Entidades.Perro;
import guia8_EXTRA_ejercicio01.Entidades.Persona;

public class guia8_EXTRA_ejercicio01 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        HashMap<Persona, Perro> adopciones = new HashMap<Persona, Perro>();
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();
        String menu;
        

        do {
            System.out.println("Ingrese el nombre de la persona");
            String nombre = leer.nextLine();

            System.out.println("Ingrese el apellido de la persona");
            String apellido = leer.nextLine();

            System.out.println("Ingrese la edad de la persona");
            int edad = leer.nextInt();

            System.out.println("Ingrese el documento de la persona");
            long documento = leer.nextLong();
            leer.nextLine();

            Persona persona = new Persona(nombre, apellido, edad, documento);
            personas.add(persona);

            System.out.println("Desea agregar mas personas?");
            menu = leer.nextLine();

        } while (menu.equals("Si") || menu.equals("si"));

        do {
            System.out.println("Ingrese el nombre del perro");
            String nombrePerro = leer.nextLine();

            System.out.println("Ingrese la raza del perro");
            String raza = leer.nextLine();

            System.out.println("Ingrese la edad del perro");
            int edadPerro = leer.nextInt();

            System.out.println("Ingrese el tamaño del perro en cm");
            int tamanio = leer.nextInt();
            leer.nextLine();

            Perro perro = new Perro(nombrePerro, raza, edadPerro, tamanio);
            perros.add(perro);

            System.out.println("Desea agregar mas perros?");
            menu = leer.nextLine();

        } while (menu.equals("Si") || menu.equals("si"));
        
        boolean adoptado = true;
        for (Persona persona : personas) {
            do {
            adoptado = true;                
            System.out.println(persona.getNombre()+", que perro desea adoptar?");
    
            for (Perro perro : perros) {
                System.out.println(perro.getNombre());
            }
        
            System.out.println("Ingrese el nombre del perro que desea adoptar");
            String perroAdopta = leer.nextLine();
        
            for (Perro aux : perros) {
                if (aux.getNombre().equals(perroAdopta)){
                    adoptado = false;
                    perros.remove(aux);
                }
            }
        
            if (adoptado == false) {
                System.out.println("Felicidades usted adopto a "+perroAdopta);
                int contador = 0;
                for (Perro perro : perros) {
                    if (perro.getNombre().equals(perroAdopta)) {
                        break;
                    }
                    contador++;
                }                    
                adopciones.put(persona, perros.get(contador));
            }

            } while (adoptado == true);
         }
               
        
        for (Map.Entry<Persona, Perro> lista : adopciones.entrySet()) {
            Perro paux = lista.getValue();
            Persona aux = lista.getKey();
            System.out.println(aux.toString());
            System.out.println(paux.toString());
        }
    }
}
