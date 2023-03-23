/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_poo_Videos.Servicios;

import guia6_poo_Videos.entidades.Mascota;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Mascota crearMascota() {
        
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        return new Mascota(nombre, apodo, tipo);
        
    }
    
}
