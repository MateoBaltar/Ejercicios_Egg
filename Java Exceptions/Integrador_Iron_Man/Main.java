package Integrador_Iron_Man;

import java.util.Random;

import Integrador_Iron_Man.Entidades.Armadura;
import Integrador_Iron_Man.Entidades.TonyStark;

public class Main {
    public static void main(String[] args) {
        TonyStark tonyStark = new TonyStark();

        System.out.println("Hola Tony, vamos a crear un nuevo traje");
        Armadura armadura1 = new Armadura();
        armadura1.crearTraje();
        armadura1.getCasco().getConsola().getJarvis().setArmadura(armadura1);
        armadura1.getCasco().getConsola().usar();
        
    }
}
