package estancias.servicios;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import estancias.entidades.Casa;
import estancias.persitencia.CasaDAO;

public class CasaService {
    Scanner leer = new Scanner(System.in);
    
    private CasaDAO dao;

    public CasaService(){
        this.dao = new CasaDAO();
    }

    public void listarCasas() throws Exception{
        Collection<Casa> casas = new ArrayList<>();
        casas = dao.listarCasas();
        for (Casa casa : casas) {
            System.out.println(casa.toString());
        }

    }

    public void consultarCasa() throws Exception{
        Collection<Casa> casas = new ArrayList<>();
        casas = dao.listarCasas();
        System.out.println("Introduzca el dia, luego el mes y luego el año de la fecha a confirmar");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt();
        Date fechaConsulta = new Date(anio, mes, dia);
        fechaConsulta.setDate(dia);
        fechaConsulta.setMonth(mes-1);
        fechaConsulta.setYear(anio-1900);

        System.out.println("Cuantos dias le gustaria quedarse");
        int dias = leer.nextInt();
        casas = dao.consultarCasas(fechaConsulta, dias);
        for (Casa casa : casas) {
            System.out.println(casa.toString());
            
        }

    }

    public void incrementarPrecio() throws Exception{
        try {
            System.out.println("Por cuanto desea incrementar el precio?");
            double incremento = leer.nextDouble();
            dao.incrementarPrecio(incremento);
            Collection<Casa> casas = new ArrayList<>();
            casas = dao.listarCasas();
            for (Casa casa : casas) {
                System.out.println(casa.toString());
            }
        } catch (Exception e) {
        }
        
    }

    public void contarCasasPorPais(){
        dao.contarCasasPorPais();
    }

    public void buscarCasasLimpias() throws Exception{
        Collection<Casa> casas = new ArrayList<>();
        casas = dao.buscarCasasLimpias();
        for (Casa casa : casas) {
            System.out.println(casa.toString());
            
        }
    }
}
