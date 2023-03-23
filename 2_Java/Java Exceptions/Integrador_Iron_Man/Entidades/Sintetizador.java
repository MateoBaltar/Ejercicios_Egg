package Integrador_Iron_Man.Entidades;

public class Sintetizador{
    public boolean destruido = false;
    public boolean estado = true;
    public final double consumo = 0.25;

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
}
