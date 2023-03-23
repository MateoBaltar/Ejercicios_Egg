package com.eggnews.news.repositorios;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eggnews.news.entidades.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {

    @Query(value = "SELECT * FROM usuario u WHERE u.email = :email", nativeQuery = true)
    public Usuario buscarPorEmail(@Param("email") String email);


    @Query(value = "SELECT * FROM usuario ORDER BY rol ASC", nativeQuery = true)
    public ArrayList<Usuario> buscarPorRol();
}
