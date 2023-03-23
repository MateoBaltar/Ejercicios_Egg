/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_colecciones_video2.Servicios;

import guia7_colecciones_video2.Entidades.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class ServicioMascotas {
    
    private Scanner leer;
    private ArrayList<Mascota> mascotas;

    public ServicioMascotas() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    
    public Mascota crearMascota() {
        
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        Mascota m = new Mascota(nombre, apodo, tipo);
        
        mascotas.add(m);
        return m;
        
    }
    
    public void mostrarMascotas(){
        
        System.out.println("Las mascotas actuales de la lista mascotas son: ");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        
        System.out.println("Cantidad = " + mascotas.size());
    }
    
    public void fabricaChiquitos(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Fer", "Chiquito", "Beagle"));
                    
        }
    }
    
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            
            System.out.println(mascotaCreada.toString());
        }
   
    }
}
