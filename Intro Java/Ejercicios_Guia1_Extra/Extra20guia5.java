/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package Ejercicios_Guia1_Extra;

/**
 *
 * @author users
 */
public class Extra20guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int [10];
        
        rellenar(vector);
        
        imprimir(vector);
    }
    
    
    public static void rellenar(int[] vector){
        
        for (int i = 0; i!=10; i++){
            vector[i] = (int) Math.ceil(Math.random() * 100);
        }
        
        
    }
    
    public static void imprimir(int[] vector){
        for (int i = 0; i != 10; i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }
    
}
