package com.egg.news.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.egg.news.Excepciones.MiExcepcion;
import com.egg.news.entidades.Noticia;
import com.egg.news.servicios.NoticiaServicio;

@Controller
@RequestMapping("/")
public class NoticiaControlador {
    @Autowired
    private NoticiaServicio noticiaServicio;

    @GetMapping("/")
    public String index(ModelMap modelo){
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        return "index.html";
    }

    @GetMapping("/AdminPanel")
    public String adminPanel(){
        return "AdminPanel.html";
    }

    @GetMapping("AdminPanel/CrearNoticia")
    public String crearNoticia(){
        return "CrearNoticia.html";
    }

    @PostMapping("/AdminPanel/CrearNoticia/Guardar")
    public String guardarNoticia(@RequestParam String titulo, @RequestParam String cuerpo){
        try {
            noticiaServicio.crearNoticia(titulo,cuerpo);
            return "redirect:/AdminPanel/AdministrarNoticias";
        } catch (MiExcepcion e) {
            e.printStackTrace();
            return "redirect:/AdminPanel";
        }
        
    }

    @GetMapping("AdminPanel/AdministrarNoticias")
    public String administarNoticias(ModelMap modelo){
        List<Noticia> noticias = noticiaServicio.listarNoticias();

        modelo.addAttribute("noticias", noticias);

        return "AdministrarNoticias.html";
    }

    @GetMapping("AdminPanel/ModificarNoticia/{id}")
    public String modificarNoticia(@PathVariable String id, ModelMap modelo){
        modelo.put("noticia", noticiaServicio.getOne(id));

        return "ModificarNoticia.html";
    }

    @PostMapping("AdminPanel/ModificarNoticia/{id}")
    public String modificarNoticia(@PathVariable String id, String titulo, String cuerpo){
        try {
            noticiaServicio.modificarNoticia(id, titulo, cuerpo);

            return "redirect:/AdminPanel/AdministrarNoticias";
        } catch (MiExcepcion e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "ModificarNoticia.html";
        }
    }

    @GetMapping("AdminPanel/EliminarNoticia/{id}")
    public String eliminarNoticia(@PathVariable String id){
        try {
            noticiaServicio.eliminarNoticia(id);

            return "redirect:/AdminPanel/AdministrarNoticias";
        } catch (MiExcepcion e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "ModificarNoticia.html";
        }
    }

    @PostMapping("Noticia/{titulo}")
    public String mostrarNoticia(@PathVariable String titulo,String id, ModelMap modelo){
        modelo.put("noticia", noticiaServicio.getOne(id));
        return "Noticia.html";
    }
}
