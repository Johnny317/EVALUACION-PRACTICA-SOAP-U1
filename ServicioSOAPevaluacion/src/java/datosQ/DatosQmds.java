package datosQ;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Carrera;
import modelo.Chofer;
import modelo.Jornada;
import modelo.Propietario;
import modelo.Taxi;

public class DatosQmds {

    private static List<Propietario> Datosquemados = null;

    public static List<Propietario> getDatos() {
        if (Datosquemados == null) {
            Datosquemados = new ArrayList<>();
            
            // Carrearas
            List<Carrera> carreras1 = new ArrayList<>();
            carreras1.add(new Carrera("C1", "Centro", "Sur", 5.50, new Date()));
            carreras1.add(new Carrera("C2", "Norte", "Sur", 10.00, new Date()));

            List<Carrera> carreras2 = new ArrayList<>();
            carreras2.add(new Carrera("C3", "Este", "Oeste", 20.00, new Date()));

            // Jornadas
            List<Jornada> jornadas1 = new ArrayList<>();
            jornadas1.add(new Jornada("J1", "DIA", new Date(), carreras1));

            List<Jornada> jornadas2 = new ArrayList<>();
            jornadas2.add(new Jornada("J2", "NOCHE", new Date(), carreras2));

            // Choferes
            List<Chofer> choferes1 = new ArrayList<>();
            choferes1.add(new Chofer("0106908403", "jhonny", "espinoza", "0967826214", "licN1", jornadas1));
            choferes1.add(new Chofer("0104592183", "fernando", "calle", "0987654321", "licN2", jornadas2));

            // Taxis
            List<Taxi> taxis1 = new ArrayList<>();
            taxis1.add(new Taxi("T1", "AAA-123", "Toyota", "Corolla", 2020, choferes1));
            taxis1.add(new Taxi("T2","BBB-123","Chevrolet","Optra",2006, choferes1));

            //Propietarios
            Datosquemados.add(new Propietario("0102030405", "Carlos", "Ruiz", "987", 60.0, 40.0, taxis1));
            Datosquemados.add(new Propietario("0908070605","diego","Cale","123", 70.0, 30.0, taxis1));
            
            
            
            
            
           
            for (Propietario p : Datosquemados) {
                if (p.getTaxis() != null) {
                    for (Taxi t : p.getTaxis()) {
                        t.setPropietario(p);
                        if (t.getChoferes() != null) {
                            for (Chofer c : t.getChoferes()) {
                                c.setTaxi(t);
                                if (c.getJornadas() != null) {
                                    for (Jornada j : c.getJornadas()) {
                                        j.setChofer(c);
                                        if (j.getCarreras() != null) {
                                            for (Carrera car : j.getCarreras()) {
                                                car.setJornada(j);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return Datosquemados;
    }
}
