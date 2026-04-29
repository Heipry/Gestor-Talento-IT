package examen;

public abstract class Empleado {
    private String nombre;

    // Constructor completo
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto obligatorio
    public abstract String obtenerDetalles();
}
