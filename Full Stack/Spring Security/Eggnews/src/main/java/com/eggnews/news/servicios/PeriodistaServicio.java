package com.eggnews.news.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.eggnews.news.Enumeraciones.Rol;
import com.eggnews.news.Excepciones.MiExcepcion;
import com.eggnews.news.entidades.Noticia;
import com.eggnews.news.entidades.Periodista;
import com.eggnews.news.repositorios.PeriodistaRepositorio;

import jakarta.transaction.Transactional;

@Service
public class PeriodistaServicio {
    @Autowired
    PeriodistaRepositorio periodistaRepositorio;

    @Transactional
    public void registrar(String nombre, String email, String password, String password2, int salario) throws MiExcepcion {
        validar(nombre, email, password, password2);

        Periodista periodista = new Periodista();

        periodista.setNombre(nombre);
        periodista.setEmail(email);
        periodista.setPassword(new BCryptPasswordEncoder().encode(password));
        periodista.setActivo(true);
        periodista.setSueldoMensual(salario);

        periodista.setRol(Rol.EDITOR);

        periodistaRepositorio.save(periodista);
    }

    public void modificarPeriodista(String id, String nombre, String email, String password, String password2, int salario) throws MiExcepcion{
        validar(nombre, email, password, password2);
        Optional<Periodista> respuesta = periodistaRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Periodista periodista = respuesta.get();

            periodista.setNombre(nombre);
            periodista.setEmail(email);
            periodista.setPassword(new BCryptPasswordEncoder().encode(password));
            periodista.setSueldoMensual(salario);

            periodistaRepositorio.save(periodista);
        }
    }

    public List<Periodista> listarPeriodistas(){
        List<Periodista> periodistas;
        periodistas = periodistaRepositorio.findAll();
        return periodistas;
    }

    public Periodista buscarPorID(String ID) throws MiExcepcion{
        Optional<Periodista> respuesta = periodistaRepositorio.findById(ID);

        if(respuesta.isPresent()){
            Periodista periodista = respuesta.get();
            return periodista;
        } else{
            return null;
        }
        
    }


    public void validar(String nombre, String email, String password, String password2) throws MiExcepcion {
        if (nombre == null || nombre.isEmpty()) {
            throw new MiExcepcion("El nombre no puede estar vacio");
        }

        if (email == null || email.isEmpty()) {
            throw new MiExcepcion("El email no puede estar vacio");
        }

        if (password == null || password.isEmpty() || password.length() <= 5) {
            throw new MiExcepcion("La contraseña no puede estar vacia y debe tener mas de 5 digitos");
        }

        if (!password2.equals(password)) {
            throw new MiExcepcion("Las contraseñas deben ser iguales");
        }
    }

}
