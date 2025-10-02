package co.edu.poli.actividad4.servicio;

import co.edu.poli.actividad4.model.Receta;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ImplementacionOperacionCRUD implements Serializable {
    private Receta[] recetas;
    private int contador;

    public ImplementacionOperacionCRUD() {
        recetas = new Receta[100];
        contador = 0;
    }

    // CREATE
    public void create(Receta r) {
        if (contador < recetas.length) {
            recetas[contador++] = r;
        } else {
            System.out.println("❌ No se pueden agregar más recetas.");
        }
    }

    // READ
    public Receta read(int id) {
        for (int i = 0; i < contador; i++) {
            if (recetas[i].getId() == id) return recetas[i];
        }
        return null;
    }

    // UPDATE
    public boolean update(int id, Receta nueva) {
        for (int i = 0; i < contador; i++) {
            if (recetas[i].getId() == id) {
                nueva.setId(id);
                recetas[i] = nueva;
                return true;
            }
        }
        return false;
    }

    // DELETE
    public boolean delete(int id) {
        for (int i = 0; i < contador; i++) {
            if (recetas[i].getId() == id) {
                for (int j = i; j < contador - 1; j++) {
                    recetas[j] = recetas[j + 1];
                }
                recetas[--contador] = null;
                return true;
            }
        }
        return false;
    }

    // LISTA
    public Receta[] lista() {
        Receta[] copia = new Receta[contador];
        System.arraycopy(recetas, 0, copia, 0, contador);
        return copia;
    }

    // SERIALIZAR
    public void serializar(String archivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            List<Receta> listaGuardar = new ArrayList<>();
            for (int i = 0; i < contador; i++) listaGuardar.add(recetas[i]);
            out.writeObject(listaGuardar);
            System.out.println("💾 Archivo [" + archivo + "] guardado con " + listaGuardar.size() + " recetas.");
        } catch (IOException e) {
            System.out.println("❌ Error al guardar: " + e.getMessage());
        }
    }

    // DESERIALIZAR
    @SuppressWarnings("unchecked")
    public static ImplementacionOperacionCRUD deserializar(String archivo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            List<Receta> listaCargada = (List<Receta>) in.readObject();
            ImplementacionOperacionCRUD servicio = new ImplementacionOperacionCRUD();
            for (Receta r : listaCargada) servicio.create(r);
            System.out.println("📂 Archivo [" + archivo + "] cargado con " + listaCargada.size() + " recetas.");
            return servicio;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error al cargar: " + e.getMessage());
            return new ImplementacionOperacionCRUD();
        }
    }
}
