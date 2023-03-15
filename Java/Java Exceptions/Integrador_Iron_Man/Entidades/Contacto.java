package Integrador_Iron_Man.Entidades;

public class Contacto {
    
    private String resistencia;
    private int x,y,z;
    private double distancia;
    private boolean hostil;
    private boolean activo;
    public double nivelSalud;
    
    public Contacto(int x, int y, int z, boolean hostil, String resistencia, boolean activo) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.hostil = hostil;
        this.resistencia = resistencia;
        this.activo = activo;
        switch (resistencia) {
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

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public boolean isHostil() {
        return hostil;
    }
    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }
    public String getResistencia() {
        return resistencia;
    }
    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public double getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(double nivelSalud) {
        this.nivelSalud = nivelSalud;
    }


}
