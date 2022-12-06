package estancias.entidades;

import java.sql.Date;

public class Estancia {
    
    private int id;
    private int idCliente;
    private int idCasa;
    private String nombreHuesped;
    private Date fechaDesde;
    private Date fechaHasta;

    public Estancia() {
    }
    public Estancia(int id, int idCliente, int idCasa, String nombreHuesped, Date fechaDesde, Date fechaHasta) {
        this.id = id;
        this.idCliente = idCliente;
        this.idCasa = idCasa;
        this.nombreHuesped = nombreHuesped;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public int getIdCasa() {
        return idCasa;
    }
    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }
    public String getNombreHuesped() {
        return nombreHuesped;
    }
    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }
    public Date getFechaDesde() {
        return fechaDesde;
    }
    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }
    public Date getFechaHasta() {
        return fechaHasta;
    }
    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    
}
