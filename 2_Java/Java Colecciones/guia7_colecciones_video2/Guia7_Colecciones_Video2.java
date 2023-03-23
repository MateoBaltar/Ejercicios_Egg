/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_colecciones_video2;

import guia7_colecciones_video2.Entidades.Mascota;
import guia7_colecciones_video2.Servicios.ServicioMascotas;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Guia7_Colecciones_Video2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ServicioMascotas sm = new ServicioMascotas();
        
        sm.fabricaChiquitos(2);
        
        sm.fabricaMascota(2);
        
        sm.mostrarMascotas();
}

}
