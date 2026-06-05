package modelo;

import java.util.List;

public class Propietario {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String telefono;
    private double porcentajePropietario;
    private double porcentajeChofer;
    private List<Taxi> taxis;

    public Propietario() {
    }

    public Propietario(String cedula, String nombres, String apellidos, String telefono, double porcentajePropietario, double porcentajeChofer, List<Taxi> taxis) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.porcentajePropietario = porcentajePropietario;
        this.porcentajeChofer = porcentajeChofer;
        this.taxis = taxis;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getPorcentajePropietario() {
        return porcentajePropietario;
    }

    public void setPorcentajePropietario(double porcentajePropietario) {
        this.porcentajePropietario = porcentajePropietario;
    }

    public double getPorcentajeChofer() {
        return porcentajeChofer;
    }

    public void setPorcentajeChofer(double porcentajeChofer) {
        this.porcentajeChofer = porcentajeChofer;
    }

    public List<Taxi> getTaxis() {
        return taxis;
    }

    public void setTaxis(List<Taxi> taxis) {
        this.taxis = taxis;
    }
}
