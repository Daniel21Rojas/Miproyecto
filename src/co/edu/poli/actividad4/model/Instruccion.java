package co.edu.poli.actividad4.model;

public class Instruccion {
    private int paso;
    private String descripcion;
    private int tiempoEstimado;
    private int orden;

    public Instruccion(int paso, String descripcion, int tiempoEstimado, int orden) {
        this.paso = paso;
        this.descripcion = descripcion;
        this.tiempoEstimado = tiempoEstimado;
        this.orden = orden;
    }

    public void mostrarDetalle() {
        System.out.println("Instrucción [Paso " + paso + "]: " + descripcion +
                           " | Tiempo estimado: " + tiempoEstimado + " min | Orden: " + orden);
    }
}
