package Semana2.cookmaster;
import Semana2.cookmaster.pasos.Paso;
import Semana2.cookmaster.ingredientes.Ingrediente;
import Semana2.cookmaster.recetas.Receta;
import Semana2.cookmaster.recetas.factory.RecetaFactory;
import Semana2.cookmaster.libro.LibroDeRecetas;

public class Main {
    public static void main(String[] args) {

        LibroDeRecetas libro = LibroDeRecetas.getInstancia();

        // Crear postre
        Receta tarta = RecetaFactory.crearReceta("POSTRE", "Tiramisú", 40);
        tarta.agregarIngrediente(new Ingrediente("Café", 200, "ml"));
        tarta.agregarIngrediente(new Ingrediente("Azúcar", 80, "g"));

        tarta.agregarPaso(new Paso(1, "Preparar café fuerte."));
        tarta.agregarPaso(new Paso(2, "Mezclar mascarpone."));
        
        libro.agregarReceta(tarta);

        // Crear bebida
        Receta limonada = RecetaFactory.crearReceta("BEBIDA", "Limonada Natural", 10);
        limonada.agregarIngrediente(new Ingrediente("Agua", 500, "ml"));
        limonada.agregarIngrediente(new Ingrediente("Limón", 2, "u"));

        limonada.agregarPaso(new Paso(1, "Exprimir limones."));
        limonada.agregarPaso(new Paso(2, "Mezclar y servir."));

        libro.agregarReceta(limonada);

        tarta.imprimirDetalles();
    }
}