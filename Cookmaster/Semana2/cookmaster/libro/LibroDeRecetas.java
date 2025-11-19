package Semana2.cookmaster.libro;
import Semana2.cookmaster.recetas.Receta;

import java.util.ArrayList;
import java.util.List;

public class LibroDeRecetas {

    private static LibroDeRecetas instancia;

    private List<Receta> recetas = new ArrayList<>();

    private LibroDeRecetas() {}

    public static LibroDeRecetas getInstancia() {
        if (instancia == null)
            instancia = new LibroDeRecetas();
        return instancia;
    }

    public void agregarReceta(Receta r) {
        recetas.add(r);
        System.out.println("Receta guardada en el Libro de Recetas.");
    }

    public void mostrarTodas() {
        System.out.println("\nListado de recetas:");
        int i = 1;
        for (Receta r : recetas)
            System.out.println(i++ + ". " + r.getNombre());
    }

    public Receta buscarPorNombre(String nombre) {
        for (Receta r : recetas)
            if (r.getNombre().equalsIgnoreCase(nombre))
                return r;
        return null;
    }
}
