package Semana2.cookmaster.recetas.tipos;
import Semana2.cookmaster.recetas.Receta;

public class Postre extends Receta {
    private String nivelDulce;

    public Postre(String nombre, int tiempo, String nivelDulce) {
        super(nombre, tiempo);
        this.tipo = "Postre";
        this.nivelDulce = nivelDulce;
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("=== Detalle de Receta ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " min");

        System.out.println("\nIngredientes (" + ingredientes.size() + "):");
        int i = 1;
        for (var ing : ingredientes)
            System.out.println(" " + i++ + ") " + ing);

        System.out.println("\nPasos (" + pasos.size() + "):");
        for (var p : pasos)
            System.out.println(" " + p);

        System.out.println("\nAtributos adicionales:");
        System.out.println(" - Nivel de dulce: " + nivelDulce);
    }
}
