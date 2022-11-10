/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos. 
 */

package guia9_ejercicio02;

import guia9_ejercicio02.Entidades.Lavadora;
import guia9_ejercicio02.Entidades.Televisor;

public class guia9_ejercicio02 {
    
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();

        lavadora.crearLavadora();
        System.out.println("Precio final: $" + lavadora.precioFinal());

        televisor.crearTelevisor();
        System.out.println("Precio final: $" + televisor.precioFinal());
    }

}
