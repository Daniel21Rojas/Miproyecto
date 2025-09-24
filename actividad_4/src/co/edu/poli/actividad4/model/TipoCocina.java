package co.edu.poli.actividad4.model;

public class TipoCocina {
    private String nombre;
    private String region;

    public TipoCocina(String nombre, String region) {
        this.nombre = nombre;
        this.region = region;
    }

    public void mostrarDetalle() {
        System.out.println("Tipo de cocina: " + nombre + " | Región: " + region);
    }
}
