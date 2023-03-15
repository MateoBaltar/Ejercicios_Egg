/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */

package guia6_ejercicio07;

import guia6_ejercicio07.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona persona[] = new Persona[4];
        boolean correcto;
        String sex;
        int bajo = 0;
        int ideal = 0;
        int sobre = 0;
        int mayor = 0;
        int menor = 0;
        
        
        for (int i = 0; i !=4; i++){
            persona[i] = new Persona();
            
            System.out.println("Ingrese el nombre de la persona " + (i+1));
            String name = leer.next();
            
            System.out.println("Ingrese la edad de la persona");
            int age = leer.nextInt();
            
            do {
                System.out.println("Ingrese el sexo de la persona (M,F u O)");
                sex = leer.next();
                if (sex.equals("M") || sex.equals("F") ||sex.equals("O")) {
                    correcto = true;
                }
            } while (correcto = false);
            
            System.out.println("Ingrese el peso");
            int weight = leer.nextInt();
            
            System.out.println("Ingrese la altura");
            double height = leer.nextDouble();
            
            persona[i].crearPersona(name,age,sex,weight,height);
            switch (persona[i].calcularIMC()) {
                case 1:
                    sobre++;
                    break;
                case 0:
                    ideal++;
                    break;
                case -1:
                    bajo++;
                    break;
                default:
                    break;
            }
            
            if (persona[i].esMayorDeEdad() == true){
                mayor++;
            } else {
                menor++;
            }
        }
        
        System.out.println("La cantidad de personas con sobrepeso es: " + sobre);
        System.out.println("La cantidad de personas con peso ideal es: " + ideal);
        System.out.println("La cantidad de personas debajo del peso ideal es: " + bajo);
        System.out.println("La cantidad de personas mayor de edad es: " + mayor);
        System.out.println("La cantidad de personas menor de edad es: " + menor);
    }

}
