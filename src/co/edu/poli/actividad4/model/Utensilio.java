package co.edu.poli.actividad4.model;

public class Utensilio {
    private String nombre;
    private String tipo;
    private boolean electrico;
    private String marca;
    private double costo;

    public Utensilio(String nombre, String tipo, boolean electrico, String marca, double costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.electrico = electrico;
        this.marca = marca;
        this.costo = costo;
    }

    public void mostrarDetalle() {
        System.out.println("Utensilio: " + nombre + " | Tipo: " + tipo +
                           " | Es eléctrico: " + electrico +
                           " | Marca: " + marca + " | Costo: " + costo);
    }
}
