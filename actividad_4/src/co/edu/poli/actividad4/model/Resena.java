package co.edu.poli.actividad4.model;

public class Resena {
    private int calificacion;
    private String comentario;
    private String fecha;
    private String hora;
    private String autor;

    public Resena(int calificacion, String comentario, String fecha, String hora, String autor) {
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecha = fecha;
        this.hora = hora;
        this.autor = autor;
    }

    public void mostrarDetalle() {
        System.out.println("Reseña: " + calificacion + " estrellas | " + comentario +
                           " | Fecha: " + fecha + " " + hora +
                           " | Autor: " + autor);
    }
}
