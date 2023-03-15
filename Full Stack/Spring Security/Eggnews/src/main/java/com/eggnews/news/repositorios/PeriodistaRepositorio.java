package com.eggnews.news.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eggnews.news.entidades.Periodista;

@Repository
public interface PeriodistaRepositorio extends JpaRepository<Periodista, String> {

    @Query(value = "SELECT * FROM periodista p WHERE p.email = :email", nativeQuery = true)
    public Periodista buscarPorEmail(@Param("email") String email);
}
