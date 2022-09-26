/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guia6_poo_manosalaobra;

import guia6_poo_manosalaobra.Servicios.ServicioPersona;
import guia6_poo_manosalaobra.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Poo_ManosALaObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioPersona ServicioPersona = new ServicioPersona();
        
        Persona persona1 = ServicioPersona.crearPersona();
        
        
        Persona persona2 = new Persona();
        
        persona2.setNombre(leer.next());
        
        System.out.println(persona1.getNombre() + " " + persona2.getNombre());
    }

}
