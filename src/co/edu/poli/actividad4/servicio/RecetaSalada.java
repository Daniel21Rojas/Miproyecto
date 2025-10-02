package co.edu.poli.actividad4.servicio;

import co.edu.poli.actividad4.model.Receta;

public class RecetaSalada extends Receta {
    private boolean picante;

    public RecetaSalada(int id, String nombre, String dificultad, int tiempo, boolean picante) {
        super(id, nombre, dificultad, tiempo);
        this.picante = picante;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("🍲 Salada -> " + getNombre() +
                " | Dificultad: " + getDificultad() +
                " | Tiempo: " + getTiempo() + " min" +
                " | Picante: " + picante);
    }
}
