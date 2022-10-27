/* 
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
*/

package Entidades;

import java.util.Scanner;

public class Revolver {
    Scanner leer = new Scanner(System.in);
    
    private int posicionActual;
    private int posicionAgua;

    /**
     *  llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
     *  deben ser aleatorios.
     */
    public void llenarRevolver(){
        posicionActual = (int) (Math.random() * 10);
        posicionAgua = (int) (Math.random() * 10);
    }

    /**
     * mojar(): devuelve true si la posición del agua coincide con la posición actual
     */
    public boolean mojar(){
    return (posicionAgua == posicionActual);
    }

    public void siguienteChorro(){
        posicionActual++;
        if (posicionActual > 10) {
            posicionActual = 0;
        }
    }

    @Override
    public String toString(){
        return "Revolver {" + "Posicion actual= " + posicionActual + ", Posicion del agua=" + posicionAgua + '}';
    }
}
