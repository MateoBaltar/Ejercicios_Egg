package com.eggnews.news.controladores;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;

import com.eggnews.news.Excepciones.MiExcepcion;
import com.eggnews.news.entidades.Noticia;
import com.eggnews.news.entidades.Periodista;
import com.eggnews.news.entidades.Usuario;
import com.eggnews.news.servicios.NoticiaServicio;
import com.eggnews.news.servicios.PeriodistaServicio;
import com.eggnews.news.servicios.UsuarioServicio;

@Controller
@RequestMapping("/admin")
public class AdminControlador {

    @Autowired
    private NoticiaServicio noticiaServicio;

    @Autowired
    private UsuarioServicio usuarioServicio;

    @Autowired
    private PeriodistaServicio periodistaServicio;

    @GetMapping("/dashboard")
    public String adminPanel(){
        return "AdminPanel.html";
    }

    @GetMapping("/CrearNoticia")
    public String crearNoticia(ModelMap modelo){
        List<Periodista> periodistas = periodistaServicio.listarPeriodistas();

        modelo.addAttribute("periodistas", periodistas);
        return "CrearNoticia.html";
    }

    @PostMapping("/CrearNoticia/Guardar")
    public String guardarNoticia(@RequestParam String titulo, @RequestParam String cuerpo, @RequestParam String periodistaID){
        try {
            Periodista periodista = periodistaServicio.buscarPorID(periodistaID);
            noticiaServicio.crearNoticia(titulo,cuerpo, periodista);
            return "redirect:/admin/AdministrarNoticias";
        } catch (MiExcepcion e) {
            e.printStackTrace();
            return "redirect:/dashboard";
        }
        
    }

    @GetMapping("/AdministrarNoticias")
    public String administarNoticias(ModelMap modelo){
        List<Noticia> noticias = noticiaServicio.listarNoticias();

        modelo.addAttribute("noticias", noticias);

        return "AdministrarNoticias.html";
    }

    @GetMapping("/ModificarNoticia/{id}")
    public String modificarNoticia(@PathVariable String id, ModelMap modelo){
        modelo.put("noticia", noticiaServicio.getOne(id));

        return "ModificarNoticia.html";
    }

    @PostMapping("/ModificarNoticia/{id}")
    public String modificarNoticia(@PathVariable String id, String titulo, String cuerpo){
        try {
            noticiaServicio.modificarNoticia(id, titulo, cuerpo);

            return "redirect:/admin/AdministrarNoticias";
        } catch (MiExcepcion e) {
            e.printStackTrace();
            return "ModificarNoticia.html";
        }
    }

    @GetMapping("/EliminarNoticia/{id}")
    public String eliminarNoticia(@PathVariable String id){
        try {
            noticiaServicio.eliminarNoticia(id);

            return "redirect:/admin/AdministrarNoticias";
        } catch (MiExcepcion e) {
            e.printStackTrace();
            return "ModificarNoticia.html";
        }
    }

    @GetMapping("/AdministrarUsuarios")
    public String administarUsuarios(ModelMap modelo){
        List<Usuario> usuarios = usuarioServicio.listarUsuariosPorRol();
        modelo.addAttribute("usuarios", usuarios);
        return "AdministrarUsuarios.html";
    }

    @GetMapping("/EliminarUsuario/{id}")
    public String eliminarUsuario(@PathVariable String id) throws MiExcepcion{
        usuarioServicio.eliminarNoticia(id);
        return "redirect:/admin/AdministrarUsuarios";
    }

    @GetMapping("/RegistroPeriodista")
    public String registrarPeriodista(){
        return "RegistroPeriodista.html";
    }

    @GetMapping("/ModificarUsuario/{id}")
    public String modificarUsuario(@PathVariable String id, ModelMap modelo){
        Usuario usuario = usuarioServicio.getOne(id);
        modelo.addAttribute("usuario",usuario);
        return "ModificarUsuario.html";
    }

    @PostMapping("/ModificarUsuario/{id}")
    public String modificarUsuario(@PathVariable String id, String nombre, String email, String password, String password2){
        try {
            usuarioServicio.modificarUsuario(id, nombre,email, password, password2);

            return "redirect:/admin/AdministrarUsuarios";
        } catch (MiExcepcion e) {
            e.printStackTrace();
            return "AdministrarUsuarios.html";
        }
    }

    @PostMapping("/ModificarPeriodista/{id}")
    public String modificarPeriodista(@PathVariable String id, String nombre, String email, String password, String password2, int salario){
        try {
            periodistaServicio.modificarPeriodista(id, nombre,email, password, password2, salario);

            return "redirect:/admin/AdministrarUsuarios";
        } catch (MiExcepcion e) {
            e.printStackTrace();
            return "AdministrarUsuarios.html";
        }
    }

    @PostMapping("/RegistrarPeriodista")
    public String registroPeriodista(@RequestParam String nombre, @RequestParam String email,@RequestParam String password, @RequestParam String password2,@RequestParam int salario, ModelMap modelo){
        try {
            periodistaServicio.registrar(nombre, email, password, password2, salario);
            return "redirect:/admin/dashboard";
        } catch (MiExcepcion e) {
            e.getMessage();
            return "registro.html";
        }
    }
}
