/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
package guia6_ejercicio06_extra.Entidades;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Ahorcado {
    Scanner leer = new Scanner(System.in);
    private int x;
    private String[] palabra;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private int intentos = 0;
    
    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letraEncontrada, int jugadasMaximas) {
        this.palabra = palabra;
        this.letrasEncontradas = letraEncontrada;
        this.jugadasMaximas = jugadasMaximas;
    }
    
    public void crearJuego(){
        System.out.println("Ingrese la palabra:");
        String ingresa = leer.next();
        this.x = ingresa.length();
        this.palabra = new String[x];
        for (int i = 0; i != x;i++){
            this.palabra[i] = ingresa.substring(i,i+1);
        }
        
        System.out.println("Cuantas vidas?");
        this.jugadasMaximas = leer.nextInt();
        
        this.letrasEncontradas = 0;
    }
    
    public int longitud(){
        return x;
    }
    
    public String buscar(String letra){
        boolean encontrada = false;
        for (int i = 0; i != x; i++){
            if (letra.equals(palabra[i])){
                encontrada = true;
            }
        }
        if (encontrada == true) {
            return "La letra fue encontrada";
        } else {
            
            return "La letra no fue encontrada";
        }
    }
    
    public String encontradas(String letra){
        int contador = 0;
        boolean encontrada = false;
        for (int i = 0; i!=x;i++){
            if (letra.equals(palabra[i])){
                contador++;
                encontrada = true;
            }
        }
        if (encontrada == true) {
            return "La letra fue encontrada" + contador+" veces.";
        } else {
            this.intentos += 1;
            return "La letra no fue encontrada";
        }
    }
    
    public int intentos(){
        return jugadasMaximas - intentos;
    }
    
    public void juego(){
        int menu;
        
        do {
            System.out.println("1. Crear juego");
            System.out.println("2. Longitud");
            System.out.println("3. Buscar letra");
            System.out.println("4. Adivinar letra");
            System.out.println("5. Ver intentos restantes");
            System.out.println("6. Salir");
            menu = leer.nextInt();
            
            switch(menu) {
                case 1: this.crearJuego();
                break;
                case 2: System.out.println(this.longitud());
                break;
                case 3: System.out.println("Ingrese la letra a buscar");
                    System.out.println(this.buscar(leer.next()));
                break;
                case 4: System.out.println("Adivine una letra:");
                    System.out.println(this.encontradas(leer.next()));
                break;
                case 5: System.out.println(this.intentos());
            }
            if (this.intentos == this.jugadasMaximas){
                System.out.println("Lo sentimos, ya no le quedan vidas");
                break;
            }
        } while (menu != 6);
    }
}
