package modelo;

import java.util.Date;

public class Carrera {
    private String idCarrera;
    private String origen;
    private String destino;
    private double valorCarrera;
    private Date fechaHora;
    private Jornada jornada;

    public Carrera() {
    }

    public Carrera(String idCarrera, String origen, String destino, double valorCarrera, Date fechaHora) {
        this.idCarrera = idCarrera;
        this.origen = origen;
        this.destino = destino;
        this.valorCarrera = valorCarrera;
        this.fechaHora = fechaHora;
    }

    public String getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(String idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    @javax.xml.bind.annotation.XmlTransient
    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }
}
