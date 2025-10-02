package co.edu.poli.actividad4.model;

public class Ingrediente {
	
    private String nombre;
    private float cantidad;
    private String unidad;
    private float calorias;
    private float carbohidratos;
    private float grasas;
    private float proteinas;
    private int numero;
    private String fecha;

    public Ingrediente(String nombre, float cantidad, String unidad, float calorias,
                       float carbohidratos, float grasas, float proteinas,
                       int numero, String fecha) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.calorias = calorias;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
        this.proteinas = proteinas;
        this.numero = numero;
        this.fecha = fecha;
    }

    public void mostrarDetalle() {
        System.out.println("Ingrediente: " + nombre + " | Cantidad: " + cantidad + " " + unidad +
                           " | Calorías: " + calorias + " | Carbohidratos: " + carbohidratos +
                           " | Grasas: " + grasas + " | Proteínas: " + proteinas +
                           " | Nº: " + numero + " | Fecha: " + fecha);
    }
}
