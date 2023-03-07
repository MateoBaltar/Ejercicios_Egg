package com.eggnews.news.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.eggnews.news.Enumeraciones.Rol;
import com.eggnews.news.Excepciones.MiExcepcion;
import com.eggnews.news.entidades.Usuario;
import com.eggnews.news.repositorios.UsuarioRepositorio;

import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;

@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Transactional
    public void registrar(String nombre, String email, String password, String password2) throws MiExcepcion {
        validar(nombre, email, password, password2);

        Usuario usuario = new Usuario();

        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));

        usuario.setRol(Rol.USER);

        usuarioRepositorio.save(usuario);
    }

    public void modificarUsuario(String id, String nombre, String email, String password, String password2) throws MiExcepcion{
        validar(nombre, email, password, password2);
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();

            usuario.setNombre(nombre);
            usuario.setEmail(email);
            usuario.setPassword(new BCryptPasswordEncoder().encode(password));


            usuarioRepositorio.save(usuario);
        }
    }

    public List<Usuario> listarUsuarios(){
        List<Usuario> usuarios;
        usuarios = usuarioRepositorio.findAll();
        return usuarios;
    }

    public List<Usuario> listarUsuariosPorRol(){
        List<Usuario> usuarios;
        usuarios = usuarioRepositorio.buscarPorRol();
        return usuarios;
    }

    public void eliminarNoticia(String id){
        usuarioRepositorio.deleteById(id);
    }

    public Usuario buscarPorID(String ID) throws MiExcepcion{
        Optional<Usuario> respuesta = usuarioRepositorio.findById(ID);

        if(respuesta.isPresent()){
            Usuario usuario = respuesta.get();
            return usuario;
        } else{
            return null;
        }
        
    }

    public Usuario getOne(String id){
        Usuario usuario = usuarioRepositorio.getOne(id);
        return usuario;
    }

    public void modificarUsuario(String id, String nombre, String email, String password) throws MiExcepcion{
        validar(nombre, email, password, password);
        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();

            usuario.setNombre(nombre);
            usuario.setEmail(email);
            usuario.setPassword(new BCryptPasswordEncoder().encode(password));

            usuarioRepositorio.save(usuario);
        }
    }

    public void eliminarUsuario(String id) throws MiExcepcion{
        usuarioRepositorio.deleteById(id);
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

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.buscarPorEmail(email);

        if (usuario != null) {

            List<GrantedAuthority> permisos = new ArrayList();

            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());

            permisos.add(p);

            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

            HttpSession session = attr.getRequest().getSession(true);

            session.setAttribute("usuariosession", usuario);

            return new User(usuario.getEmail(), usuario.getPassword(), permisos);
        } else {
            return null;
        }
    }
}
