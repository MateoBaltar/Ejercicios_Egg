package com.eggnews.news.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eggnews.news.entidades.Noticia;

@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, String>{
    
    @Query(value= "SELECT n FROM noticia n WHERE n.titulo = :titulo", nativeQuery = true)
    public Noticia buscarPorTitulo(@Param("titulo") String titulo);

    @Query(value= "SELECT id FROM noticia n WHERE n.titulo = :titulo", nativeQuery = true)
    public String getIDNoticia(@Param("titulo") String titulo);

    @Query(value= "SELECT * FROM noticia ORDER BY creacion DESC", nativeQuery = true)
    public List<Noticia> listarDESC();
    
}
