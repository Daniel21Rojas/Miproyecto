package co.edu.poli.actividad4.model;

import java.io.Serializable;

public abstract class Receta implements Serializable {
    private int id;
    private String nombre;
    private String dificultad;
    private int tiempo;

    public Receta(int id, String nombre, String dificultad, int tiempo) {
        this.id = id;
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.tiempo = tiempo;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDificultad() { return dificultad; }
    public void setDificultad(String dificultad) { this.dificultad = dificultad; }

    public int getTiempo() { return tiempo; }
    public void setTiempo(int tiempo) { this.tiempo = tiempo; }

    public abstract void mostrarDetalle();
}

