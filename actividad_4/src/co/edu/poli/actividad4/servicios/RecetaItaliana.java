package co.edu.poli.actividad4.servicios;

import co.edu.poli.actividad4.model.Receta; // <-- Importar la clase padre

public class RecetaItaliana extends Receta {
    private String tipoPasta;
    private String salsa;

    public RecetaItaliana(String nombre, String dificultad, int tiempo, String tipoPasta, String salsa) {
        super(nombre, dificultad, tiempo);
        this.tipoPasta = tipoPasta;
        this.salsa = salsa;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Receta Italiana: " + getNombre() +
                           " | Dificultad: " + getDificultad() +
                           " | Tiempo: " + getTiempo() +
                           " | Pasta: " + tipoPasta +
                           " | Salsa: " + salsa);
    }
}
