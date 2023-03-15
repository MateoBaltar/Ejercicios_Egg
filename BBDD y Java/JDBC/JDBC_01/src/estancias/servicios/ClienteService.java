package estancias.servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import estancias.entidades.Cliente;
import estancias.persitencia.ClienteDAO;

public class ClienteService {
    ClienteDAO dao;

    public ClienteService(){
        this.dao= new ClienteDAO();
    }

    public void consultarEstadiaClientes() throws Exception{
        try {
            dao.consultarEstadiaClientes();
            
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public void consultarEstanciasCliente(){
        Scanner leer = new Scanner(System.in);
        try {
            Collection<Cliente> clientes = new ArrayList<>();
            clientes = dao.getClientes();
            
            for (Cliente cliente : clientes) {
                System.out.println(cliente.toString());
            }

            System.out.println("Ingrese el ID del cliente del cual desea saber las estadias");
            int id = leer.nextInt();

            dao.consultarEstadiaPorID(id);

        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
