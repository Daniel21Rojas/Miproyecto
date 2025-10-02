package co.edu.poli.actividad4.servicio;

import co.edu.poli.actividad4.model.Receta;

public class RecetaDulce extends Receta {
    private String nivelAzucar;

    public RecetaDulce(int id, String nombre, String dificultad, int tiempo, String nivelAzucar) {
        super(id, nombre, dificultad, tiempo);
        this.nivelAzucar = nivelAzucar;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("🍰 Dulce -> " + getNombre() +
                " | Dificultad: " + getDificultad() +
                " | Tiempo: " + getTiempo() + " min" +
                " | Azúcar: " + nivelAzucar);
    }
}
