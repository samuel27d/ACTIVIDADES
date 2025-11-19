package Semana2.cookmaster.ingredientes;

public class Ingrediente {
        private String nombre;
    private double cantidad;
    private String unidad;

    public Ingrediente(String nombre, double cantidad, String unidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return nombre + " – " + cantidad + " " + unidad;
    }
    
}
