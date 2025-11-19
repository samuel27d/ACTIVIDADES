package Semana2.cookmaster.recetas;
import Semana2.cookmaster.ingredientes.Ingrediente;
import Semana2.cookmaster.pasos.Paso;
import java.util.ArrayList;
import java.util.List;

public abstract class Receta {
    protected String nombre;
    protected int tiempoPreparacion;
    protected String tipo;

    protected List<Ingrediente> ingredientes = new ArrayList<>();
    protected List<Paso> pasos = new ArrayList<>();

    public Receta(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempoPreparacion = tiempo;
    }

    public void agregarIngrediente(Ingrediente ing) {
        ingredientes.add(ing);
    }

    public void agregarPaso(Paso paso) {
        pasos.add(paso);
    }

    public String getNombre() { return nombre; }

    public abstract void imprimirDetalles();
}