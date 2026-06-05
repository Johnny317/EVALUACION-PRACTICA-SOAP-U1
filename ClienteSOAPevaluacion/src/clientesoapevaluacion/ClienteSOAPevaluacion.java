/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientesoapevaluacion;

// Estas importaciones marcarán error (línea roja) hasta que crees el "Web Service Client" en NetBeans
import consultassoap.ServicioSOAPevalucion;
import consultassoap.ServicioSOAPevalucion_Service;
import consultassoap.Taxi;
import consultassoap.Chofer;

public class ClienteSOAPevaluacion {

    public static void main(String[] args) {
        try {
            System.out.println("Conectando=");
            
            // 1. Instanciar el servicio usando las clases generadas por NetBeans
            ServicioSOAPevalucion_Service service = new ServicioSOAPevalucion_Service();
            ServicioSOAPevalucion port = service.getServicioSOAPevalucionPort();

            // Consulta 1: Obtener Ganancia Total del Propietario
            double gananciaPropietario = port.obtenerGananciaPropietario("0102030405");
            System.out.println("1. Ganancia del Propietario Carlos (0102030405): $" + gananciaPropietario);

            // Consulta 2: Consultar Ganancia de un Chofer
            double gananciaChofer = port.obtenerGananciaChofer("0104592183");
            System.out.println("2. Ganancia del Chofer Fernando (0104592183): $" + gananciaChofer);

            // Consulta 3: Obtener Cantidad de Carreras de un Taxi
            int totalCarreras = port.obtenerTotalCarrerasPorTaxi("AAA-123");
            System.out.println("3. Total de carreras del Taxi (AAA-123): " + totalCarreras);
            
            // Consulta 4: Consultar Taxi Más Rentable
            Taxi taxiRentable = port.obtenerTaxiMasRentable("0102030405");
            if(taxiRentable != null) {
                System.out.println("4. Taxi mas rentable del Propietario (0102030405): Placa " + taxiRentable.getPlaca());
            }

            // Consulta 5: Consultar Chofer con Mayor Número de Carreras
            Chofer mejorChofer = port.obtenerMejorChofer("0102030405");
            if(mejorChofer != null) {
                System.out.println("5. Mejor chofer del Propietario (0102030405): " + mejorChofer.getNombres() + " " + mejorChofer.getApellidos());
            }

            // Consulta 6: Consultar Ingresos por Jornada
            double ingresosDia = port.obtenerIngresosPorJornada("AAA-123", "DIA");
            System.out.println("6. Ingresos del Taxi (AAA-123) en la jornada DIA: $" + ingresosDia);

            // Consulta 7: Consultar Total Recaudado por Taxi
            double totalRecaudadoTaxi = port.obtenerTotalRecaudadoTaxi("AAA-123");
            System.out.println("7. Total recaudado por el Taxi (AAA-123): $" + totalRecaudadoTaxi);

        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
            System.out.println("NOTA: Recuerda que el proyecto ServicioSOAPevaluacion debe estar ejecutándose (Run).");
        }
    }
}
