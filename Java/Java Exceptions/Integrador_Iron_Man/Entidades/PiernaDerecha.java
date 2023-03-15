package Integrador_Iron_Man.Entidades;

import java.util.Random;

public class PiernaDerecha{
    public boolean destruido = false;
    public  boolean estado = true;
    private final double consumo = 0.5;

    public double getConsumo() {
        return consumo;
    }

    public double usar(int tiempo, String intensidad){
        Random random = new Random();
        if (estado == true) {
            int danio = random.nextInt(100);
            if ( danio <= 30) {
                System.out.println("La pierna derecha fue dañada");
                this.estado = false;
            }
            switch (intensidad) {
                case "Basico":
                return (consumo * tiempo);
                case "Normal":
                return ((consumo * 2) * tiempo);
                case "Intensivo":
                return ((consumo * 3) * tiempo);
                default:
                return 0;
                
            }
        } else{
            System.out.println("La pierna derecha se encuentra dañada");
            return 0;
        }
     }

    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public void setDestruido(boolean destruido){
        this.destruido = destruido;
        this.estado = false;
    }
}
