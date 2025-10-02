package co.edu.poli.actividad4.servicio;

import co.edu.poli.actividad4.model.Receta;

public interface OperacionCRUD {
    void create(Receta r);
    Receta read(int id);
    boolean update(int id, Receta r);
    boolean delete(int id);
    Receta[] lista();
}
