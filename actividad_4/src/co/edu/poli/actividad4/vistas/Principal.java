package co.edu.poli.actividad4.vistas;

import co.edu.poli.actividad4.model.Receta;
import co.edu.poli.actividad4.servicios.RecetaEspecial;

public class Principal {
    public static void main(String[] args) {

        // ==============================
        // PUNTO 1: Herencia
        // ==============================
        System.out.println("\n===== PUNTO 1: Herencia =====");
        Receta receta1 = new Receta("Arepas", "Fácil", 20);
        receta1.mostrarDetalle();

        RecetaEspecial recetaEspecial1 = new RecetaEspecial("Postre", "Media", 40, "Cumpleaños");
        recetaEspecial1.mostrarDetalle();

        // ==============================
        // PUNTO 2: Polimorfismo
        // ==============================
        System.out.println("\n===== PUNTO 2: Polimorfismo =====");
        Receta receta2 = new Receta("Arroz", "Fácil", 30);
        Receta receta3 = new RecetaEspecial("Sopa", "Difícil", 60, "Reunión Familiar");

        receta2.mostrarDetalle(); // usa método de Receta
        receta3.mostrarDetalle(); // usa método sobrescrito en RecetaEspecial

        // ==============================
        // PUNTO 3: final (atributo, método y clase)
        // ==============================
        System.out.println("\n===== PUNTO 3: Atributo, método y clase final =====");

        // (1) Ejemplo de atributo final y método final
        Receta receta4 = new Receta("General", "Fácil", 15);
        receta4.mostrarDetalle();
        receta4.mostrarCreador(); // 🔒 este método es final, no se puede sobrescribir

        // (2) Ejemplo de clase final
        RecetaEspecial recetaEspecial2 = new RecetaEspecial("Postre Navideño", "Difícil", 120, "Navidad");
        recetaEspecial2.mostrarDetalle();
        recetaEspecial2.mostrarCreador(); // 🔒 método heredado que tampoco puede sobrescribirse

        // COMENTARIOS:
        // - Atributo final: en Receta.java (private final String creador)
        // - Método final: en Receta.java (public final void mostrarCreador())
        // - Clase final: en RecetaEspecial.java (public final class RecetaEspecial)
    }
}

