package co.edu.poli.actividad4.model;

public class Receta {

    private String nombre;
    private String dificultad;
    private int tiempo;
    private final String creador = "Daniel Felipe Rojas"; // atributo final

    // Constructor
    public Receta(String nombre, String dificultad, int tiempo) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.tiempo = tiempo;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    // Método que se puede sobrescribir
    public void mostrarDetalle() {
        System.out.println("Receta: " + getNombre() +
                           " | Dificultad: " + getDificultad() +
                           " | Tiempo: " + getTiempo());
    }

    // Método final: no se puede sobrescribir
    public final void mostrarCreador() {
        System.out.println("Creador: " + creador);
    }
}

