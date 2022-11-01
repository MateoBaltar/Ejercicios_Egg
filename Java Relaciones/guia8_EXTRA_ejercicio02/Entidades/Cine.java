/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
        8 A X | 8 B X | 8 C X | 8 D   | 8 E X | 8 F X
        7 A X | 7 B X | 7 C X | 7 D X | 7 E   | 7 F X
        6 A X | 6 B X | 6 C   | 6 D X | 6 E X | 6 F
        5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
        4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
        3 A X | 3 B X | 3 C X | 3 D   | 3 E X | 3 F X
        2 A X | 2 B   | 2 C X | 2 D X | 2 E X | 2 F
        1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */

package guia8_EXTRA_ejercicio02.Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Cine {
    Scanner leer = new Scanner(System.in);

    private String nombre;
    private int entrada;
    private ArrayList<Sala> salas = new ArrayList();
    private ArrayList<Espectador> espectadores = new ArrayList();
    private ArrayList<Pelicula> peliculas = new ArrayList();

    public Cine() {
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public String getNombre(){
        return nombre;
    }

    public void crearCine(){
        
        int menu;
        String salir;
        System.out.println("Ingrese el nombre del cine");
        this.nombre = leer.nextLine();

        do {
            System.out.println("--Cine " + this.nombre+"--");
            System.out.println("-----MENU-----");
            System.out.println("1. Asignar valor de entrada");
            System.out.println("2. Ingresar pelicula");
            System.out.println("3. Registrar espectador");
            System.out.println("4. Asignar asientos");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            leer.nextLine();
            
            switch (menu) {
                case 1: System.out.println("Ingrese el valor de entrada para el cine");
                this.entrada = leer.nextInt();
                leer.nextLine();
                break;


                case 2: do {
                    System.out.println("Ingrese el nombre de la pelicula");
                    String nombrePelicula = leer.nextLine();
                    System.out.println("Ingrese el nombre del director de la pelicula");
                    String director = leer.nextLine();
                    System.out.println("Ingrese la duracion en minutos");
                    int duracion = leer.nextInt();
                    System.out.println("Ingrese la edad minima requerida para ver la pelicula");
                    int edadMinima = leer.nextInt();
                    leer.nextLine();
                    Pelicula pelicula = new Pelicula(nombrePelicula,director,duracion,edadMinima);
                    peliculas.add(pelicula);
                    System.out.println("Desea ingresar otra pelicula?");
                    salir = leer.nextLine();
                    
                } while (salir.equals("Si") || salir.equals("si"));
                    break;


                case 3: do {
                    System.out.println("Ingrese el nombre del espectador");
                    String nombre = leer.nextLine();

                    System.out.println("Ingrese la edad");
                    int edad = leer.nextInt();

                    System.out.println("Ingrese la cantidad de dinero que posee");
                    int dinero = leer.nextInt();
                    leer.nextLine();

                    Espectador espectador = new Espectador(nombre,edad,dinero);
                    this.espectadores.add(espectador);

                    System.out.println("Desea ingresar otro espectador?");
                    salir = leer.nextLine();

                } while (salir.equals("Si") || salir.equals("si"));
                    break;


                case 4:
                    System.out.println("Para que pelicula desea asignar los asientos?");
                    for (Pelicula pelicula : peliculas) {
                        System.out.println(pelicula.getNombre());
                    }
                    String seleccion = leer.nextLine();

                    for (Pelicula pelicula : peliculas) {
                        if (pelicula.getNombre().equals(seleccion)) {
                            Sala sala = new Sala();
                            sala.asignarAsientos(entrada, pelicula, espectadores);
                            this.salas.add(sala);
                        }
                    }
                    break;
                default:
                    System.out.println("Adios!");
                    break;
            }
        } while (menu != 5);
        
    }
    public void mostrarPeliculas(){
        System.out.println("Peliculas en el cine Mostro");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostarAsientos(){
        System.out.println("De cual pelicula quiere saber los asientos?");
        String eleccion = leer.nextLine();

        for (Sala sala : salas) {
            if (sala.getPelicula().getNombre().equals(eleccion)){
                sala.mostrarAsientos();
            }
        }
    }

    
}

