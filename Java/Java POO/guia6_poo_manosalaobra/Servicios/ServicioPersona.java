/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_poo_manosalaobra.Servicios;

import guia6_poo_manosalaobra.entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    
    
    public Persona crearPersona(){
       Persona personaCompleta = new Persona();
    
    personaCompleta.setNombre(leer.next());
    
    return personaCompleta; 
    }
    
}
