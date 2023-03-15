package Integrador_Iron_Man.Entidades;

public class Casco{

    public boolean destruido = false;
    public  boolean estado = true;
    private Consola consola = new Consola();
    private Sintetizador sintetizador = new Sintetizador();
    

    public boolean isEstado() {
        return estado;
    }

    public Consola getConsola() {
        return consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setDestruido(boolean destruido){
        this.destruido = destruido;
    }
}

