package estancias.persitencia;

import java.util.ArrayList;
import java.util.Collection;

import estancias.entidades.Cliente;

public class ClienteDAO extends DAO{

    public Collection<Cliente> getClientes() throws Exception{
        try {
            String sql = "SELECT * FROM clientes";
            consultarBase(sql);
            Cliente cliente = null;
            Collection<Cliente> clientes = new ArrayList();
            while (resultado.next()) {
                cliente = new Cliente();
                cliente.setId(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigoPostal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setEmail(resultado.getString(7));
                clientes.add(cliente);
            }
            desconectarBase();
            return clientes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

    public void consultarEstadiaClientes() throws Exception{
        try {
            String sql = "select clientes.*,casas.tipo_vivienda from clientes inner join estancias on clientes.id_cliente = estancias.id_cliente inner join casas on estancias.id_casa = casas.id_casa";
            consultarBase(sql);
            Cliente cliente;
            while (resultado.next()) {
                cliente = new Cliente();
                cliente.setId(resultado.getInt(1));
                cliente.setNombre(resultado.getString(2));
                cliente.setCalle(resultado.getString(3));
                cliente.setNumero(resultado.getInt(4));
                cliente.setCodigoPostal(resultado.getString(5));
                cliente.setCiudad(resultado.getString(6));
                cliente.setPais(resultado.getString(7));
                cliente.setEmail(resultado.getString(8));
                System.out.println(cliente.toString() + " Tipo de vivienda = "+resultado.getString(9) );
            }
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }

    }

    public void consultarEstadiaPorID(int id) throws Exception{
        try {
            String sql = "select clientes.nombre, clientes.pais, clientes.ciudad, casas.* from clientes inner join estancias on clientes.id_cliente = estancias.id_cliente inner join casas on estancias.id_casa = casas.id_casa where clientes.id_cliente ="+ id;
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Nombre del cliente: " + resultado.getString(1));
                System.out.println("Pais: " + resultado.getString(2));
                System.out.println("Ciudad: " + resultado.getString(3));
                System.out.println("ID de la casa: " + resultado.getInt(4));
                System.out.println("Calle: " + resultado.getString(5));
                System.out.println("Numero: " + resultado.getInt(6));
                System.out.println("Codig postal: " + resultado.getString(7));
                System.out.println("Ciudad: " + resultado.getString(8));
                System.out.println("Pais: " + resultado.getString(9));
                System.out.println("Fecha desde: " + resultado.getDate(10));
                System.out.println("Hasta el: " + resultado.getDate(11));
                System.out.println("Tiempo minimo: " + resultado.getInt(12));
                System.out.println("Tiempo maximo: " + resultado.getInt(13));
                System.out.println("Precio: " + resultado.getDouble(14));
                System.out.println("Tipo de vivienda: " + resultado.getString(15));
            }
            desconectarBase();
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw e;
        }
    }

}
