/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package guia6_ejercicio08;

import guia6_ejercicio08.Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cadena frase1 = new Cadena();
        int menu;
        String nuevaFrase = "";
        
        System.out.println("Ingrese una frase");
        frase1.setFrase(leer.nextLine());

        do {
            System.out.println("Que desea hacer?");
            System.out.println("1. Contar vocales");
            System.out.println("2. Invertir frase");
            System.out.println("3. Contar caracteres ingresados por usuario");
            System.out.println("4. Comprar longitud con otra frase");
            System.out.println("5. Unir la frase con otra");
            System.out.println("6. Remplazar las 'a' con un caracter a eleccion");
            System.out.println("7. Verificar si la frase tiene un caracter especifico");
            System.out.println("8. Salir");
            menu = leer.nextInt();
            leer.nextLine();

            switch (menu) {
                case 1: System.out.println("La cantidad de vocales en la frase es: " + frase1.mostrarVocales());
                break;
                
                case 2: System.out.println("La frase invertida es: '"+frase1.invertirFrase()+"'");
                break;
                
                case 3: System.out.println("Que caracter desea contar?");
                    String caracter = leer.next();
                    System.out.println("La cantidad de veces que se encontro el caracter es: "+frase1.vecesRepetido(caracter));
                break;
                
                case 4: System.out.println("Ingrese otra frase para comprar longitudes");
                    nuevaFrase = leer.nextLine();
                    System.out.println("Es la frase ingresada mas larga que la frase principal? " + frase1.compararLongitud(nuevaFrase));
                    break;
                    
                case 5: System.out.println("Ingrese una frase para unirla a la principal");
                    nuevaFrase = leer.nextLine();
                    System.out.println("La frase ingresada sumada a la principal es: '"+frase1.unirFrases(nuevaFrase)+"'");
                    break;
                    
                case 6: System.out.println("Ingrese el caracter que reemplazara a las 'a' de la frase");
                    nuevaFrase = leer.next();
                    System.out.println("La frase con el caracter de reemplazo es: '" + frase1.reemplazar(nuevaFrase)+"'");
                    break;
                    
                case 7: System.out.println("Cual caracter quiere saber si esta en la frase?");
                    nuevaFrase = leer.next();
                    System.out.println("El caracter se encuentra en la frase?" + frase1.contiene(nuevaFrase));
                    break;
                    
                default: System.out.println("Nos vemos");
            }

        } while (menu != 8);
    }

}
