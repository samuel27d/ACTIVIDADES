package Semana1.zoologico;

public class caballo extends mamiferos {
    private String razadecaballo;
    private String velocidadlalcanzada;
    private String cantidaddehenoconsumido;

    public caballo(String nombre, String nombre_cientifico, int numero_de_jaula, String peso, String altura,String cuidador_encargado,String razadecaballo, String velocidadlalcanzada, String cantidaddehenoconsumido) {
        super(nombre, nombre_cientifico, numero_de_jaula, peso, altura, cuidador_encargado);
        
    }
    public void heno(){
        System.out.println("Juan prepara desde la madrugada los 15 kilos de heno para null");
    }
    public void metododeescape() {
        System.out.println("Los caballos salvajes escapan de los depredadores gracias a su gran velocidad, resistencia y fuerte instinto de grupo. Al detectar peligro, suelen huir en manada, lo que confunde al atacante y protege a los miembros más jóvenes o débiles. Además, utilizan movimientos rápidos y giros bruscos para evadir ataques, confiando en su agudo oído y vista para detectar amenazas a distancia.");
    }
}
