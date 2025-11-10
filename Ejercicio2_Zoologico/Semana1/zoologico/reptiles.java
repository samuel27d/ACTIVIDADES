package Semana1.zoologico;

public class reptiles extends animales {
    private String Tomarlatemperaturadelambiente;
    public reptiles(String nombre, String nombre_cientifico, int Numero_de_jaula,String peso, String altura,String cuidador_encargado,String Tomarlatemperaturadelambiente){
    super(nombre, nombre_cientifico, Numero_de_jaula,peso, altura, cuidador_encargado);
    }
    public void humedecer_las_escamas() {
        System.out.println("los reptiles son expertos en humedecer sus escamas");
    }
    public void verificar_a_los_Huevos() {
        System.out.println("todo reptil verifica a sus huevos");
    }
}
