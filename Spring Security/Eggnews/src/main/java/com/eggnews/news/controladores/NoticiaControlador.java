package com.eggnews.news.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eggnews.news.Excepciones.MiExcepcion;
import com.eggnews.news.entidades.Noticia;
import com.eggnews.news.entidades.Usuario;
import com.eggnews.news.servicios.NoticiaServicio;
import com.eggnews.news.servicios.UsuarioServicio;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class NoticiaControlador {
    @Autowired
    private NoticiaServicio noticiaServicio;
    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/")
    public String index(ModelMap modelo){
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        return "index.html";
    }


    @PostMapping("Noticia/{titulo}")
    public String mostrarNoticia(@PathVariable String titulo,String id, ModelMap modelo){
        modelo.put("noticia", noticiaServicio.getOne(id));
        return "Noticia.html";
    }

    @GetMapping("/registrar")
    public String registrar(){
        return "registro.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, @RequestParam String email,@RequestParam String password, @RequestParam String password2, ModelMap modelo){
        try {
            usuarioServicio.registrar(nombre, email, password, password2);
            return "redirect:/";
        } catch (MiExcepcion e) {
            e.getMessage();
            return "registro.html";
        }
    }

    @GetMapping("/login")
    public String login(@RequestParam(required=false) String error, ModelMap modelo){
        if (error != null) {
        }
        return "login.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_EDITOR', 'ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String inicio(ModelMap modelo, HttpSession session){
        Usuario logeado = (Usuario) session.getAttribute("usuariosession");

        if(logeado.getRol().toString().equals("ADMIN")){
            return "redirect:/admin/dashboard";
        }
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        return "inicio.html";
    }
}
