package co.edu.poli.actividad4.vistas;

import co.edu.poli.actividad4.model.Receta;
import co.edu.poli.actividad4.servicio.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ImplementacionOperacionCRUD servicio = new ImplementacionOperacionCRUD();
        int opcion;

        do {
            System.out.println("\n===== MENÚ CRUD =====");
            System.out.println("1. Crear receta");
            System.out.println("2. Listar todas");
            System.out.println("3. Leer por ID");
            System.out.println("4. Modificar receta");
            System.out.println("5. Eliminar receta");
            System.out.println("6. Guardar en archivo");
            System.out.println("7. Cargar de archivo");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: // CREAR
                    System.out.println("Tipo de receta: 1-Salada, 2-Dulce, 3-Italiana");
                    int tipo = sc.nextInt(); sc.nextLine();

                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Dificultad: ");
                    String dificultad = sc.nextLine();

                    System.out.print("Tiempo (min): ");
                    int tiempo = sc.nextInt(); sc.nextLine();

                    Receta r = null;
                    if (tipo == 1) {
                        System.out.print("¿Es picante? (true/false): ");
                        boolean picante = sc.nextBoolean(); sc.nextLine();
                        r = new RecetaSalada(id, nombre, dificultad, tiempo, picante);
                    } else if (tipo == 2) {
                        System.out.print("Nivel de azúcar: ");
                        String azucar = sc.nextLine();
                        r = new RecetaDulce(id, nombre, dificultad, tiempo, azucar);
                    } else if (tipo == 3) {
                        System.out.print("Región: ");
                        String region = sc.nextLine();
                        r = new RecetaItaliana(id, nombre, dificultad, tiempo, region);
                    }

                    servicio.create(r);
                    System.out.println("✅ Receta creada!");
                    break;

                case 2: // LISTAR
                    System.out.println("📋 Listado de recetas:");
                    for (Receta rec : servicio.lista()) {
                        rec.mostrarDetalle();
                        System.out.println("------------------");
                    }
                    break;

                case 3: // READ
                    System.out.print("ID a buscar: ");
                    int idBuscar = sc.nextInt(); sc.nextLine();
                    Receta encontrada = servicio.read(idBuscar);
                    if (encontrada != null) encontrada.mostrarDetalle();
                    else System.out.println("❌ No encontrada");
                    break;

                case 4: // UPDATE
                    System.out.print("ID a modificar: ");
                    int idUpdate = sc.nextInt(); sc.nextLine();
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();
                    System.out.print("Nueva dificultad: ");
                    String nuevaDificultad = sc.nextLine();
                    System.out.print("Nuevo tiempo: ");
                    int nuevoTiempo = sc.nextInt(); sc.nextLine();
                    Receta nueva = new RecetaSalada(idUpdate, nuevoNombre, nuevaDificultad, nuevoTiempo, false);
                    boolean actualizado = servicio.update(idUpdate, nueva);
                    System.out.println(actualizado ? "✅ Actualizada!" : "❌ No encontrada");
                    break;

                case 5: // DELETE
                    System.out.print("ID a eliminar: ");
                    int idDelete = sc.nextInt(); sc.nextLine();
                    boolean eliminado = servicio.delete(idDelete);
                    System.out.println(eliminado ? "🗑️ Eliminada!" : "❌ No encontrada");
                    break;

                case 6: // GUARDAR
                    servicio.serializar("recetas.dat");
                    break;

                case 7: // CARGAR
                    servicio = ImplementacionOperacionCRUD.deserializar("recetas.dat");
                    break;

                case 8: // SALIR
                    System.out.println("👋 Saliendo...");
                    break;

                default:
                    System.out.println("❌ Opción inválida");
            }
        } while (opcion != 8);

        sc.close();
    }
}
