package co.edu.poli.actividad4.servicios;

import co.edu.poli.actividad4.model.Receta;

public class RecetaDulce extends Receta {
    private String nivelAzucar;
    private String esPostre;

    public RecetaDulce(String nombre, String dificultad, int tiempo, String nivelAzucar, String esPostre) {
        super(nombre, dificultad, tiempo);
        this.nivelAzucar = nivelAzucar;
        this.esPostre = esPostre;
    }

    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle(); // llama el detalle de Receta
        System.out.println("Tipo: Receta Dulce | Nivel Azúcar: " + nivelAzucar + " | Es Postre: " + esPostre);
    }
}

