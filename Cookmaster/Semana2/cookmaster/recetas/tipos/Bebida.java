package Semana2.cookmaster.recetas.tipos;
import Semana2.cookmaster.recetas.Receta;

public class Bebida extends Receta {
    private boolean conHielo;

    public Bebida(String nombre, int tiempo, boolean conHielo) {
        super(nombre, tiempo);
        this.tipo = "Bebida";
        this.conHielo = conHielo;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("=== Detalle de Receta ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " min");

        System.out.println("\nIngredientes:");
        int i = 1;
        for (var ing : ingredientes)
            System.out.println(" " + i++ + ") " + ing);

        System.out.println("\nPasos:");
        for (var p : pasos)
            System.out.println(" " + p);

        System.out.println("\nAtributos adicionales:");
        System.out.println(" - Con hielo: " + (conHielo ? "Sí" : "No"));
    }
}
