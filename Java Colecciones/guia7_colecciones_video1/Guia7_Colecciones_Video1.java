/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_colecciones_video1;

import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class Guia7_Colecciones_Video1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombresArray = new String[5];
        
        for (int i = 0; i < 5; i++) {
            nombresArray[i] = "Chiquito"+ (i + 1);
        }
        
        for (String var : nombresArray) {
            System.out.println(var);
        }
        
        //Collections
    
        ArrayList<String> nombresArrayList = new ArrayList();

        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");

        System.out.println(nombresArrayList.size());
        
        nombresArrayList.remove("Chiquito");
        
        System.out.println(nombresArrayList.size());

    }
    
    
    
    
}
