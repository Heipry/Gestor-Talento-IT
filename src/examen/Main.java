package examen;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // Fase 3: ArrayList de tipo Empleado
        ArrayList<Empleado> plantilla = new ArrayList<>();
        
        // Fase 4: Llamada al método
        cargarPlantilla(plantilla);

        // Fase 4: Recorrido y escritura con protección try-catch
        try (FileWriter escritor = new FileWriter("empleados_nomina.txt")) {
            
            for (Empleado emp : plantilla) {
                // Pista: añadir \n para que salgan en líneas distintas
                String linea = emp.obtenerDetalles() + "\n";
                escritor.write(linea);
            }
            
            System.out.println("Proceso finalizado. Fichero 'empleados_nomina.txt' generado.");
            
        } catch (IOException e) {
            System.err.println("Error al gestionar el archivo: " + e.getMessage());
        }
    }

    // Fase 3: Método estático fuera del main
    public static void cargarPlantilla(ArrayList<Empleado> lista) {
        lista.add(new Programador("Javier Díaz", 500.0));
        lista.add(new Programador("Pepe Grillo", 400.0));
        lista.add(new Programador("Bill Gates", 1000.0));
    }
}
