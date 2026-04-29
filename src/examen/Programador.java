package examen;

public class Programador extends Empleado {
    private double bono;
    // Constante según el enunciado: Sueldo Base de la empresa
    private final double SUELDO_BASE = 1250.0;

    // Constructor completo
    public Programador(String nombre, double bono) {
        super(nombre);
        this.bono = bono;
    }

    @Override
    public String obtenerDetalles() {
        // Cálculo según enunciado: Sueldo Base + Bono
        double sueldoTotal = SUELDO_BASE + this.bono;
        // Pista de la Fase 2: Llamada al getter del padre (getNombre())
        return "Programador: " + getNombre() + " - Sueldo: " + sueldoTotal + " €";
    }
}