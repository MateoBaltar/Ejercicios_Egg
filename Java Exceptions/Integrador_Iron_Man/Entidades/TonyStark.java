package Integrador_Iron_Man.Entidades;

public class TonyStark {
    protected double generador = 1000000;

    public double getGenerador() {
        double porcentaje = ((generador * 100) / 1000000);
        return porcentaje;
    }

    public void consumo(double consumo){
        this.generador -= consumo;
    }
}
