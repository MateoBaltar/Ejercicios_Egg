/*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */

package guia9_ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

import guia9_ejercicio02.Entidades.Electrodomestico;
import guia9_ejercicio02.Entidades.Lavadora;
import guia9_ejercicio02.Entidades.Televisor;

public class guia9_ejercicio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
       int menu;
       
       

    for (int j = 0; j < 4; j++) {
        System.out.println("1. Cargar lavadora");
        System.out.println("2. Cargar televisor");
        menu = leer.nextInt();
        switch (menu) {
            case 1:
            Lavadora lavadora = new Lavadora();
            lavadora.crearLavadora();
            electrodomesticos.add(lavadora);
            break;
            
            case 2:
            Televisor televisor = new Televisor();
            televisor.crearTelevisor();
            electrodomesticos.add(televisor);
                break;
        }
    }
    int total = 0;

    for (Electrodomestico electrodomestico : electrodomesticos) {
        if (electrodomestico instanceof Lavadora) {
            System.out.println("Lavadora: $" + electrodomestico.precioFinal());
            total+=electrodomestico.precioFinal();
        }
        if (electrodomestico instanceof Televisor) {
            System.out.println("Televisor: $" + electrodomestico.precioFinal());
            total+=electrodomestico.precioFinal();
        }
    }

    System.out.println("El total de electrodomesticos es: $" + total);
    }
}
