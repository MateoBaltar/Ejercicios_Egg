/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */

package Ejercicios_Guia_1;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int contadorp = 0;
        int contadorf = 0;
        int fin = 0;
        do {
            System.out.println("Una frase");
            frase = leer.nextLine();
            int largo = frase.length();
            String pcarac = frase.substring(0, 1);
            String fcarac =  frase.substring(largo-1,largo);
            
            if (frase.equals("&&&&&")) {
               fin = 1; 
            }
            
            if (largo == 5) {
                if (pcarac.equals("X")) {
                   if  (fcarac.equals("O")) {
                       contadorp++;
                   }
                }
            } else {
                contadorf++;
            }
            
            
        } while (fin == 0);
        
        System.out.println("La cantidad de frases correctas introducidas es: " + contadorp);
        System.out.println("La cantidad de frases incorrectas introducidas es: " + contadorf);
    }
        
    
    
}
