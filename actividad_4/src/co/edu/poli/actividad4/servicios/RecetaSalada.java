package co.edu.poli.actividad4.servicios;

import co.edu.poli.actividad4.model.Receta;

public class RecetaSalada extends Receta {
    private String nivelSal;
    private boolean picante;

    public RecetaSalada(String nombre, String dificultad, int tiempo, String nivelSal, boolean picante) {
        super(nombre, dificultad, tiempo);
        this.nivelSal = nivelSal;
        this.picante = picante;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Receta Salada: " + getNombre() +
                           " | Sal: " + nivelSal +
                           " | Picante: " + (picante ? "Sí" : "No"));
    }

}
