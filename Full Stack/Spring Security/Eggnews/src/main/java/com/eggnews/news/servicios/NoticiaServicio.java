package com.eggnews.news.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eggnews.news.Excepciones.MiExcepcion;
import com.eggnews.news.entidades.Noticia;
import com.eggnews.news.entidades.Periodista;
import com.eggnews.news.repositorios.NoticiaRepositorio;

@Service
public class NoticiaServicio {
    @Autowired
    private NoticiaRepositorio noticiaRepositorio;

    @Transactional
    public void crearNoticia(String titulo, String cuerpo, Periodista autor) throws MiExcepcion{
        validar(titulo, cuerpo);
        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setAutor(autor);
        noticiaRepositorio.save(noticia);
    }

    public Noticia IDporTitulo(String titulo){
        String id = noticiaRepositorio.getIDNoticia(titulo);
        Noticia noticia = noticiaRepositorio.getOne(id);
        return noticia;
    }

    public void modificarNoticia(String id, String titulo, String cuerpo) throws MiExcepcion{
        validar(titulo, cuerpo);
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();

            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);

            noticiaRepositorio.save(noticia);
        }
    }

    public List<Noticia> listarNoticias(){
        List<Noticia> noticias = new ArrayList<>();
        noticias = noticiaRepositorio.listarDESC();
        return noticias;
    }

    public Noticia getOne(String id){
        Noticia noticia = noticiaRepositorio.getOne(id);
        return noticia;
    }

    public void eliminarNoticia(String id) throws MiExcepcion{
        noticiaRepositorio.deleteById(id);
    }

    private void validar(String titulo, String cuerpo) throws MiExcepcion{
        if (titulo == null || titulo.isEmpty()) {
            throw new MiExcepcion("El titulo no puede estar vacio");
        }

        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new MiExcepcion("El cuerpo no puede estar vacio");
        }
    }

    
}   
