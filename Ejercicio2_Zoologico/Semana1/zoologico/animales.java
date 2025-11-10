package Semana1.zoologico;

public class animales {
    private String nombre;
    private String nombre_cientifico;
    private int Numero_de_jaula;
    private String peso;
    private String altura;
    private String cuidador_encargado;
    public animales () {}
    public animales (String nombre, String nombre_cientifico, int Numero_de_jaula,String peso, String altura,String cuidador_encargado) {
        this.nombre=nombre;
        this.nombre_cientifico= nombre_cientifico;
        this.Numero_de_jaula= Numero_de_jaula;
        this.peso= peso;
        this.altura= altura;
        this.cuidador_encargado= cuidador_encargado; 
    }
    public String getnombre() {
        return nombre;
    }
    public void presentacion() {
        System.out.println("han llegado los nuevos animales del zoologico, dos reptiles y dos mamiferos");
    }
    public void presentacion2() {
        System.out.println(nombre + ", es uno de los nuevos animales del zoologico");
    }
    public void Sonido_producido() {
        System.out.println(nombre + " esta haciendo mucho ruido");
    }
    public void encargados() {
        System.out.println("y para ellos tenemos a tenemos a 2 encargados: a Jony, encargado de los reptiles y a Juan, encargado de los mamiferos");
    }
}
