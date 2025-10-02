package co.edu.poli.actividad4.servicio;

import co.edu.poli.actividad4.model.Receta;

public class RecetaItaliana extends Receta {
    private String region;

    public RecetaItaliana(int id, String nombre, String dificultad, int tiempo, String region) {
        super(id, nombre, dificultad, tiempo);
        this.region = region;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("🍝 Italiana -> " + getNombre() +
                " | Dificultad: " + getDificultad() +
                " | Tiempo: " + getTiempo() + " min" +
                " | Región: " + region);
    }
}
