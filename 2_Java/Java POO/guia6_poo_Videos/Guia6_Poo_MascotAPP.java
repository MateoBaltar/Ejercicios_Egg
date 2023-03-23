/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6_poo_Videos;

import guia6_poo_Videos.Servicios.ServicioMascota;
import guia6_poo_Videos.entidades.Mascota;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia6_Poo_MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int a = 10;
        
        ServicioMascota sm = new ServicioMascota();
        
        Mascota mm = new Mascota();
        
        modificador(a,mm);
        
        System.out.println("a " + a);
        System.out.println("Mascota "+mm);

}

    public static void modificador(int num, Mascota m){
        
        num = 100;
        m.setApodo("Mascota Referencia");
        
    }
}
