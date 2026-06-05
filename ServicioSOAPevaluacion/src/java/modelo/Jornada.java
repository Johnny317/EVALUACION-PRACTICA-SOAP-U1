package modelo;

import java.util.Date;
import java.util.List;

public class Jornada {
    private String idJornada;
    private String tipo;
    private Date fecha;
    private List<Carrera> carreras;
    private Chofer chofer;

    public Jornada() {
    }

    public Jornada(String idJornada, String tipo, Date fecha, List<Carrera> carreras) {
        this.idJornada = idJornada;
        this.tipo = tipo;
        this.fecha = fecha;
        this.carreras = carreras;
    }

    public String getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(String idJornada) {
        this.idJornada = idJornada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    @javax.xml.bind.annotation.XmlTransient
    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }
}
