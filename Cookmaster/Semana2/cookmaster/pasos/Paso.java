package Semana2.cookmaster.pasos;

public class Paso {
     private int numero;
    private String descripcion;

    public Paso(int numero, String descripcion) {
        this.numero = numero;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return numero + ". " + descripcion;
    }
    
}
