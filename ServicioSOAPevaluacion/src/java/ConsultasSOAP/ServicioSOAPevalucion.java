/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ConsultasSOAP;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Carrera;
import modelo.Chofer;
import modelo.Jornada;
import modelo.Propietario;
import modelo.Taxi;

@WebService(serviceName = "ServicioSOAPevalucion")
public class ServicioSOAPevalucion {


    // OPERACIONES DEL WEB SERVICE 
    

    @WebMethod(operationName = "obtenerGananciaPropietario")
    public double obtenerGananciaPropietario(@WebParam(name = "cedula") String cedula) {
        Propietario p = buscarPropietario(cedula);
        if (p == null) return 0.0;

        double totalRecaudado = 0.0;
        if (p.getTaxis() != null) {
            for (Taxi t : p.getTaxis()) {
                if (t.getChoferes() != null) {
                    for (Chofer c : t.getChoferes()) {
                        totalRecaudado += sumarCarreras(c.getJornadas());
                    }
                }
            }
        }
        return totalRecaudado * (p.getPorcentajePropietario() / 100.0);
    }

    @WebMethod(operationName = "obtenerGananciaChofer")
    public double obtenerGananciaChofer(@WebParam(name = "cedulaChofer") String cedulaChofer) {
        Chofer c = buscarChofer(cedulaChofer);
        if (c == null) return 0.0;

        double recaudado = sumarCarreras(c.getJornadas());
        double porcentaje = c.getTaxi().getPropietario().getPorcentajeChofer();
        return recaudado * (porcentaje / 100.0);
    }

    @WebMethod(operationName = "obtenerTotalCarrerasPorTaxi")
    public int obtenerTotalCarrerasPorTaxi(@WebParam(name = "placa") String placa) {
        Taxi t = buscarTaxi(placa);
        if (t == null) return 0;

        int total = 0;
        if (t.getChoferes() != null) {
            for (Chofer c : t.getChoferes()) {
                total += contarCarreras(c.getJornadas());
            }
        }
        return total;
    }

    @WebMethod(operationName = "obtenerTaxiMasRentable")
    public Taxi obtenerTaxiMasRentable(@WebParam(name = "cedulaPropietario") String cedulaPropietario) {
        Propietario p = buscarPropietario(cedulaPropietario);
        if (p == null || p.getTaxis() == null) return null;

        Taxi masRentable = null;
        double maxIngresos = -1.0;

        for (Taxi t : p.getTaxis()) {
            double ingresos = 0.0;
            if (t.getChoferes() != null) {
                for (Chofer c : t.getChoferes()) {
                    ingresos += sumarCarreras(c.getJornadas());
                }
            }
            if (ingresos > maxIngresos) {
                maxIngresos = ingresos;
                masRentable = t;
            }
        }
        return masRentable;
    }

    @WebMethod(operationName = "obtenerMejorChofer")
    public Chofer obtenerMejorChofer(@WebParam(name = "cedulaPropietario") String cedulaPropietario) {
        Propietario p = buscarPropietario(cedulaPropietario);
        if (p == null || p.getTaxis() == null) return null;

        Chofer mejor = null;
        int maxCarreras = -1;

        for (Taxi t : p.getTaxis()) {
            if (t.getChoferes() != null) {
                for (Chofer c : t.getChoferes()) {
                    int numCarreras = contarCarreras(c.getJornadas());
                    if (numCarreras > maxCarreras) {
                        maxCarreras = numCarreras;
                        mejor = c;
                    }
                }
            }
        }
        return mejor;
    }

    @WebMethod(operationName = "obtenerIngresosPorJornada")
    public double obtenerIngresosPorJornada(@WebParam(name = "placa") String placa, @WebParam(name = "jornada") String jornada) {
        Taxi t = buscarTaxi(placa);
        if (t == null || t.getChoferes() == null) return 0.0;

        double ingresos = 0.0;
        for (Chofer c : t.getChoferes()) {
            if (c.getJornadas() != null) {
                for (Jornada j : c.getJornadas()) {
                    if (j.getTipo() != null && j.getTipo().equalsIgnoreCase(jornada)) {
                        if (j.getCarreras() != null) {
                            for (Carrera car : j.getCarreras()) {
                                ingresos += car.getValorCarrera();
                            }
                        }
                    }
                }
            }
        }
        return ingresos;
    }

    @WebMethod(operationName = "obtenerTotalRecaudadoTaxi")
    public double obtenerTotalRecaudadoTaxi(@WebParam(name = "placa") String placa) {
        Taxi t = buscarTaxi(placa);
        if (t == null || t.getChoferes() == null) return 0.0;

        double total = 0.0;
        for (Chofer c : t.getChoferes()) {
            total += sumarCarreras(c.getJornadas());
        }
        return total;
    }
    
    //Metodos para ayudar a las consults 
    
       private Propietario buscarPropietario(String cedula) {
        for (Propietario p : datosQ.DatosQmds.getDatos()) {
            if (p.getCedula().equals(cedula)) return p;
        }
        return null;
    }

    private Taxi buscarTaxi(String placa) {
        for (Propietario p : datosQ.DatosQmds.getDatos()) {
            if (p.getTaxis() != null) {
                for (Taxi t : p.getTaxis()) {
                    if (t.getPlaca().equals(placa)) return t;
                }
            }
        }
        return null;
    }

    private Chofer buscarChofer(String cedula) {
        for (Propietario p : datosQ.DatosQmds.getDatos()) {
            if (p.getTaxis() != null) {
                for (Taxi t : p.getTaxis()) {
                    if (t.getChoferes() != null) {
                        for (Chofer c : t.getChoferes()) {
                            if (c.getCedula().equals(cedula)) return c;
                        }
                    }
                }
            }
        }
        return null;
    }

    private double sumarCarreras(List<Jornada> jornadas) {
        double total = 0.0;
        if (jornadas != null) {
            for (Jornada j : jornadas) {
                if (j.getCarreras() != null) {
                    for (Carrera car : j.getCarreras()) {
                        total += car.getValorCarrera();
                    }
                }
            }
        }
        return total;
    }

    private int contarCarreras(List<Jornada> jornadas) {
        int total = 0;
        if (jornadas != null) {
            for (Jornada j : jornadas) {
                if (j.getCarreras() != null) {
                    total += j.getCarreras().size();
                }
            }
        }
        return total;
    }
}
