package co.edu.poli.actividad4.model;

public class Chef {
    private String nombre;
    private String experiencia;
    private String especialidad;
    private int cedula;
    private String nacionalidad;
    private String certificado;

    public Chef(String nombre, String experiencia, String especialidad, int cedula,
                String nacionalidad, String certificado) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.especialidad = especialidad;
        this.cedula = cedula;
        this.nacionalidad = nacionalidad;
        this.certificado = certificado;
    }

    public void mostrarDetalle() {
        System.out.println("Chef: " + nombre + " | Experiencia: " + experiencia +
                           " | Especialidad: " + especialidad + " | Cédula: " + cedula +
                           " | Nacionalidad: " + nacionalidad + " | Certificado: " + certificado);
    }
}
