package estancias;

import estancias.servicios.CasaService;
import estancias.servicios.ClienteService;
import estancias.servicios.FamiliaServicios;

public class main {
    public static void main(String[] args) throws Exception {
        FamiliaServicios familiaService = new FamiliaServicios();
        CasaService casaService = new CasaService();
        ClienteService clienteService = new ClienteService();

        familiaService.listarFamilias();
        casaService.listarCasas();
        casaService.consultarCasa();
        clienteService.consultarEstadiaClientes();
        clienteService.consultarEstanciasCliente(); 
        casaService.incrementarPrecio();
        casaService.contarCasasPorPais();
        casaService.buscarCasasLimpias();
    }
}
