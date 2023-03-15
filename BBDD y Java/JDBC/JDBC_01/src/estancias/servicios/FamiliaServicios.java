package estancias.servicios;

import java.util.ArrayList;
import java.util.Collection;

import estancias.entidades.Familia;
import estancias.persitencia.FamiliaDAO;

public class FamiliaServicios {
    private FamiliaDAO dao;

    public FamiliaServicios(){
        this.dao = new FamiliaDAO();
    }

    public void listarFamilias() throws Exception{
        try {
            Collection<Familia> familias = new ArrayList<>();
            familias = dao.listarFamilias();

            for (Familia familia : familias) {
                System.out.println(familia.toString());
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void listarHotmail(){
        try {
            Collection<Familia> familias = new ArrayList<>();
            familias = dao.listarHotmail();

            for (Familia familia : familias) {
                System.out.println(familia.toString());
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }


}
