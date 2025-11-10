package Semana1.zoologico;

public class leon extends mamiferos {
    private String razadeleon;
    private String fuerzademordida;
    private String cantidaddecarneconsumida;
public leon(String nombre, String nombre_cientifico, int Numero_de_jaula,String peso, String altura,String cuidador_encargado,String razadeleon, String fuerzademordida, String cantidaddecarneconsumida){
super(nombre,nombre_cientifico, Numero_de_jaula,peso, altura, cuidador_encargado);
}

public void metododecaza() {
        System.out.println("Los leones cazan en grupo, generalmente liderados por las leonas, que coordinan emboscadas para rodear y aislar a sus presas. Aprovechan la cobertura del terreno y se acercan sigilosamente antes de lanzarse en una corta pero rápida persecución. Una vez que derriban a la presa, la matan con una mordida en el cuello o el hocico para asfixiarla, y luego el grupo se alimenta, empezando por los machos dominantes");
 }
public void metododealimenta(){
    System.out.println("Juan se mete al comedero de null mientras la jaula pricipal esta cerrada, Juan mete los 9kg de carne en el comedero");
}
}
