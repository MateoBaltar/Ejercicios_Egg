package com.eggnews.news.entidades;

import java.util.ArrayList;
import java.util.List;

import com.eggnews.news.Enumeraciones.Rol;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Periodista extends Usuario{

    public Periodista() {
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "noticia_id")
    private List<Noticia> misNoticias;
    int sueldoMensual;


    public Periodista(String nombre, String email, String password) {
        super(nombre, email, password, true, Rol.EDITOR);
    }

    public List<Noticia> getMisNoticias() {
        return misNoticias;
    }

    public void setMisNoticias(List<Noticia> misNoticias) {
        this.misNoticias = misNoticias;
    }

    public int getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(int sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
}
