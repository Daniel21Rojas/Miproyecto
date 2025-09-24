package co.edu.poli.actividad4.servicios;

import co.edu.poli.actividad4.model.Receta;

// 🔒 Clase final: no se puede heredar
public final class RecetaEspecial extends Receta {

    private String motivoEspecial;

    public RecetaEspecial(String nombre, String dificultad, int tiempo, String motivoEspecial) {
        super(nombre, dificultad, tiempo);
        this.motivoEspecial = motivoEspecial;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Receta Especial: " + getNombre() +
                " | Motivo: " + motivoEspecial);
    }
}
