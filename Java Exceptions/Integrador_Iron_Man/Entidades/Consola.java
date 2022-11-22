package Integrador_Iron_Man.Entidades;

import java.util.Scanner;

public class Consola{
    public boolean destruido = false;
    public  boolean estado = true;
    public final double consumo = 0.25;
    private Jarvis jarvis = new Jarvis();

    public double getConsumo() {
        return consumo;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public void setDestruido(boolean destruido){
        this.destruido = destruido;
    }

    public void usar(){
        Scanner leer = new Scanner(System.in);
        int menu;
        System.out.println("Hola, mi nombre es J.A.R.V.I.S y seré su asistente en este traje");

        do {
            System.out.println("Estas son mis funciones, puede elejir lo que usted quiera");
            System.out.println("1. Mover el traje");
            System.out.println("2. Mostrar el estado del traje");
            System.out.println("3. Revisar dispositivos e intentar repararlos");
            System.out.println("4. Usar Radar");
            System.out.println("5. Simulador");
            System.out.println("6. Destruir contacto hostil");
            System.out.println("7. Abandonar el traje");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Como quiere moverse?");
                    System.out.println("1. Caminar");
                    System.out.println("2. Correr");
                    System.out.println("3. Propulsarse");
                    System.out.println("4. Volar");
                    try {
                        menu = leer.nextInt();
                    switch (menu) {
                        case 1:
                            jarvis.getArmadura().caminar();
                        break;

                        case 2:
                            jarvis.getArmadura().correr();
                        break;

                        case 3:
                            jarvis.getArmadura().propulsarse();
                        break;

                        case 4:
                            jarvis.getArmadura().volar();
                        break;
                        default:
                        System.out.println("Opcion ingresada no valida");
                    }
                    } catch (Exception e) {
                        System.out.println("Error al ingresar opcion");
                    }
                    
                break;

                case 2:
                    jarvis.mostrarEstado();
                break;

                case 3:
                    jarvis.revisarDispositivos();
                break;

                case 4:
                    if (jarvis.getContactos().isEmpty()) {
                        System.out.println("No hay contactos en el radar, intenta usar el simulador primero");
                    } else {
                        jarvis.radar();
                    }
                break;

                case 5:
                    jarvis.simulador();
                break;

                case 6:
                    jarvis.destruirEnemigo();
                break;
            }
        } while (menu != 7);
        
    }
    public boolean isDestruido() {
        return destruido;
    }
    public Jarvis getJarvis() {
        return jarvis;
    }
    public void setJarvis(Jarvis jarvis) {
        this.jarvis = jarvis;
    }
}
