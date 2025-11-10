package Semana1.zoologico;

public class iguana extends reptiles {
    private String razadeiguana;
    private String temperaturacorporal;
    public iguana(String nombre, String nombre_cientifico, int Numero_de_jaula, String peso, String altura,
            String cuidador_encargado, String Tomarlatemperaturadelambiente, String razadeiguana, String temperaturacorporal) {
        super(nombre, nombre_cientifico, Numero_de_jaula, peso, altura, cuidador_encargado, Tomarlatemperaturadelambiente);
    }
    public void metododeescape() {
        System.out.println("Las iguanas escapan de sus depredadores principalmente corriendo a gran velocidad hacia zonas seguras, como árboles o cuerpos de agua. Si se sienten acorraladas, pueden lanzarse al agua y nadar hábilmente para alejarse. Además, usan su cola como látigo para defenderse y, en casos extremos, pueden desprenderse de parte de ella para distraer al atacante y huir.");
    }
    public void metododealimenta(){
    System.out.println("Jony le da las sobras de carne que quedaron de los demas animales a null");
}

}
