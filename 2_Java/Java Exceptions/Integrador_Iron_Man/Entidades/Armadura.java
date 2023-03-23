package Integrador_Iron_Man.Entidades;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import Integrador_Iron_Man.Enumeraciones.Resistencias;

public class Armadura extends TonyStark{
    
    Scanner leer = new Scanner(System.in);
    private String colorPrimario;
    private String colorSecundario;
    private String resistencia;
    private double nivelSalud;
    private BrazoIzquiero brazoIzquiero = new BrazoIzquiero();
    private BrazoDerecho brazoDerecho = new BrazoDerecho();
    private PiernaDerecha piernaDerecha = new PiernaDerecha();
    private PiernaIzquierda piernaIzquierda = new PiernaIzquierda();
    private Casco casco = new Casco();

    public void Armadura(){
    }
    public void crearTraje(){
        String material;
        Resistencias enumeracion;
        ArrayList<String> enumeracionString = new ArrayList<>();
        
        System.out.println("Ingrese el color primario y luego el secundario");
        this.colorPrimario = leer.nextLine();
        this.colorSecundario = leer.nextLine();
        System.out.println("Ingrese cual material quiere para la armadura");
        System.out.println("HRA, HRB, HRC");
        do {
            material = leer.nextLine();
        } while (!"HRA".equals(material) && !"HRB".equals(material) && !"HRC".equals(material));
        
        this.resistencia = material;

        switch (material) {
            case "HRA":
                this.nivelSalud = 1000;
                break;
            case "HRB":
                this.nivelSalud = 2000;
                break;
            case "HRC":
                this.nivelSalud = 3000;
                break;
        }


    }



    public void caminar(){
        System.out.println("Ingrese el tiempo que desea caminar");
        int tiempo = leer.nextInt();
        leer.nextLine();
        double consumoTotal = (piernaIzquierda.usar(tiempo,"Basico") + piernaDerecha.usar(tiempo,"Basico"));
        if ((super.getGenerador() - consumoTotal) > super.getGenerador()) {
            System.out.println("El consumo seria mayor a la cantidad de energia que se posee, intente una menor intensidad o menor tiempo");
        } else {
            System.out.println("Se consumieron " + consumoTotal + " puntos de energia");
            super.consumo(consumoTotal);
        }
    }

    public void correr(){
        System.out.println("Ingrese el tiempo que desea correr");
        int tiempo = leer.nextInt();
        leer.nextLine();
        double consumoTotal = (piernaIzquierda.usar(tiempo,"Normal") + piernaDerecha.usar(tiempo,"Normal"));
        if ((super.getGenerador() - consumoTotal) > super.getGenerador()) {
            System.out.println("El consumo seria mayor a la cantidad de energia que se posee, intente una menor intensidad o menor tiempo");
        } else {
            System.out.println("Se consumieron " + consumoTotal + " puntos de energia");
            super.consumo(consumoTotal);
        }
    }

    public void propulsarse(){
        System.out.println("Ingrese el tiempo que desea propulsarse");
        int tiempo = leer.nextInt();
        leer.nextLine();
        double consumoTotal = (piernaIzquierda.usar(tiempo,"Intensivo") + piernaDerecha.usar(tiempo,"Intensivo"));
        if ((super.getGenerador() - consumoTotal) > super.getGenerador()) {
            System.out.println("El consumo seria mayor a la cantidad de energia que se posee, intente una menor intensidad o menor tiempo");
        } else {
            System.out.println("Se consumieron " + consumoTotal + " puntos de energia");
            super.consumo(consumoTotal);
        }
    }

    public void volar(){
        System.out.println("Ingrese el tiempo que desea propulsarse");
        int tiempo = leer.nextInt();
        leer.nextLine();
        double consumoTotal = (piernaIzquierda.usar(tiempo,"Intensivo") + piernaDerecha.usar(tiempo,"Intensivo"));
        consumoTotal+= (brazoDerecho.usar(tiempo,"Normal") + brazoIzquiero.usar(tiempo,"Normal"));
        if ((super.getGenerador() - consumoTotal) > super.getGenerador()) {
            System.out.println("El consumo seria mayor a la cantidad de energia que se posee, intente una menor intensidad o menor tiempo");
        } else {
            System.out.println("Se consumieron " + consumoTotal + " puntos de energia");
            super.consumo(consumoTotal);
        }
    }

    public void disparar(){
        System.out.println("Ingrese el tiempo que desea disparar");
        int tiempo = leer.nextInt();
        double consumoTotal = (brazoDerecho.usar(tiempo,"Intensivo") + brazoIzquiero.usar(tiempo,"Intensivo"));
        if ((super.getGenerador() - consumoTotal) > super.getGenerador()) {
            System.out.println("El consumo seria mayor a la cantidad de energia que se posee, intente una menor intensidad o menor tiempo");
        } else {
            System.out.println("Se consumieron " + consumoTotal + " puntos de energia");
            super.consumo(consumoTotal);
        }
        
        
    }

    public double getGenerador(){
        return super.getGenerador();
    }

    public void consumoGenerador(double consumo){
        super.generador -= consumo;
    }
    public String getColorPrimario() {
        return colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public String getResistencia() {
        return resistencia;
    }

    public double getNivelSalud() {
        return nivelSalud;
    }

    public BrazoIzquiero getBrazoIzquiero() {
        return brazoIzquiero;
    }

    public BrazoDerecho getBrazoDerecho() {
        return brazoDerecho;
    }

    public PiernaDerecha getPiernaDerecha() {
        return piernaDerecha;
    }

    public PiernaIzquierda getPiernaIzquierda() {
        return piernaIzquierda;
    }

    public Casco getCasco() {
        return casco;
    }
}
