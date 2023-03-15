package estancias.persitencia;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import estancias.entidades.Casa;

public class CasaDAO extends DAO{

    public Collection<Casa> listarCasas() throws Exception{
        try {
            String sql = "SELECT * FROM casas WHERE fecha_desde BETWEEN '2020-08-01' AND '2020-08-31'";
            consultarBase(sql);
            Casa casa = null;
            Collection<Casa> casas = new ArrayList<>();
            while (resultado.next()) {
                casa = new Casa();
                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Collection<Casa> consultarCasas(Date fechaConsulta, int numeroDias) throws Exception{
        int dia = fechaConsulta.getDate();
        int mes = fechaConsulta.getMonth()+1;
        int anio = fechaConsulta.getYear()+1900;
        try {
            String sql = "SELECT * FROM casas WHERE fecha_desde <= '" + anio +"-"+ mes +"-"+ dia + "' AND fecha_hasta >= date_add('"+anio+"-"+mes+"-"+dia +"', INTERVAL " + numeroDias + " day)";
            consultarBase(sql);
            Casa casa = null;
            Collection<Casa> casas = new ArrayList<>();
            while (resultado.next()) {
                casa = new Casa();
                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public Casa mostrarCasaPorID() throws Exception{
        try {
            String sql = "SELECT * FROM casas WHERE fecha_desde BETWEEN '2020-08-01' AND '2020-08-31'";
            consultarBase(sql);
            Casa casa = null;
            while (resultado.next()) {
                casa = new Casa();
                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
            }
            desconectarBase();
            return casa;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public void incrementarPrecio(double incremento) throws Exception{
        try {
            String sql = "Update casas set precio_habitacion = precio_habitacion+(precio_habitacion * "+incremento+") where pais = 'Reino Unido'";
            insertarModificarEliminar(sql);
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
        
    }

    public void contarCasasPorPais(){
        try {
            String sql = "select pais,count(id_casa) from casas group by pais";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Pais: " + resultado.getString(1) + ". Numero de casas: " + resultado.getInt(2));
            }
        } catch (Exception e) {
        }
    }

    public Collection<Casa> buscarCasasLimpias() throws Exception{
        try {
            String sql = "select casas.* from casas inner join comentarios on casas.id_casa = comentarios.id_casa where comentarios.comentario like '%limpia%'";
            consultarBase(sql);
            Casa casa = null;
            Collection<Casa> casas = new ArrayList<>();
            while (resultado.next()) {
                casa = new Casa();
                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setNumero(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate(7));
                casa.setFechaHasta(resultado.getDate(8));
                casa.setTiempoMinimo(resultado.getInt(9));
                casa.setTiempoMaximo(resultado.getInt(10));
                casa.setPrecio_habitacion(resultado.getDouble(11));
                casa.setTipoVivienda(resultado.getString(12));
                casas.add(casa);
            }
            desconectarBase();
            return casas;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }
}
