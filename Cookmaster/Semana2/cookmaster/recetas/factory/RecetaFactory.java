package Semana2.cookmaster.recetas.factory;
import Semana2.cookmaster.recetas.Receta;
import Semana2.cookmaster.recetas.tipos.*;

public class RecetaFactory {

    public static Receta crearReceta(String tipo, String nombre, int tiempo) {

        switch (tipo.toUpperCase()) {

            case "POSTRE":
                return new Postre(nombre, tiempo, "Medio");

            case "BEBIDA":
                return new Bebida(nombre, tiempo, true);

            case "PLATO":
            case "PLATOFUERTE":
                return new PlatoFuerte(nombre, tiempo, 500);

            default:
                throw new IllegalArgumentException("Tipo de receta desconocido: " + tipo);
        }
    }
}