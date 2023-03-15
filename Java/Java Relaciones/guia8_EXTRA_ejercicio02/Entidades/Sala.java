package guia8_EXTRA_ejercicio02.Entidades;

import java.util.ArrayList;
import java.util.Random;

public class Sala {
    Random random = new Random();


    private Pelicula pelicula;
    private String[][] asientos = new String[8][6];

    public Sala(){

    }
    
    public void asignarAsientos(int entrada, Pelicula pelicula, ArrayList<Espectador> espectadores){
        this.pelicula = pelicula;

        int topeFila = 8;
        int topeColmna = 6;
        boolean ocupado = false;

        for (int i = 0; i < 6; i++) {
            int x = 8;
            for (int j = 0; j < 8; j++) {
                switch (i){
                    case 0: this.asientos[j][i] = (x + "A ");
                    break;
                    case 1: this.asientos[j][i] = (x + "B ");
                    break;
                    case 2: this.asientos[j][i] = (x + "C ");
                    break;
                    case 3: this.asientos[j][i] = (x + "D ");
                    break;
                    case 4: this.asientos[j][i] = (x + "E ");
                    break;
                    case 5: this.asientos[j][i] = (x + "F ");
                    break;
                } 
                x--;
            }
        }
        
        for (Espectador espectador : espectadores) {
            if (espectador.getEdad() <= pelicula.getEdadMinima()) {
                System.out.println(espectador.getNombre() + " no puede entrar a la pelicula ya que tiene " + espectador.getEdad() + " años y el minimo para ver esta pelicula es "+pelicula.getEdadMinima());
                continue;
            }
            if (espectador.getDinero() <= entrada) {
                System.out.println(espectador.getNombre() + " no puede entrar a la pelicula ya que solo tiene " + espectador.getDinero() + " y la entrada vale " + entrada);
                continue;
            }
            do {
                ocupado = false;
                int rand1 = random.nextInt(topeFila);
                int rand2 = random.nextInt(topeColmna);

                if (asientos[rand1][rand2].length() == 3) {
                    this.asientos[rand1][rand2] = this.asientos[rand1][rand2].concat("X");
                    ocupado = true;
                }
            } while (ocupado == false);
        }
    }


    public Pelicula getPelicula() {
        return pelicula;
    }

    public void mostrarAsientos(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(asientos[i][j] + " | ");
            }
            System.out.println("");
        }
    }
}
