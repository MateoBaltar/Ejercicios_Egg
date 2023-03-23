package estancias.persitencia;

import java.util.ArrayList;
import java.util.Collection;

public class EstanciaDAO extends DAO{
    private ClienteDAO clienteDAO;
    private CasaDAO casaDAO;

    public EstanciaDAO(){
        this.clienteDAO = new ClienteDAO();
        this.casaDAO = new CasaDAO();
    }

}
