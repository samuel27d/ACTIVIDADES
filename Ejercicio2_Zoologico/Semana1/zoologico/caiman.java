package Semana1.zoologico;

public class caiman extends reptiles {
    private String razadecaiman;
    private String fuerzademordida;
    private String cantidaddecarneconsumida;
    public caiman(String nombre, String nombre_cientifico, int Numero_de_jaula, String peso, String altura,
            String cuidador_encargado, String Tomarlatemperaturadelambiente, String razadecaiman, String fuerzademordida, String cantidaddecarneconsumida) {
        super(nombre, nombre_cientifico, Numero_de_jaula, peso, altura, cuidador_encargado, Tomarlatemperaturadelambiente);
        
    }
    public void metododecaza() {
        System.out.println("Los caimanes son cazadores sigilosos que utilizan la técnica del acecho y la emboscada. Permanecen inmóviles bajo el agua, con solo los ojos y las fosas nasales visibles, esperando pacientemente a que una presa se acerque. Cuando esta está lo suficientemente cerca, atacan con rapidez y fuerza, atrapándola con sus poderosas mandíbulas. Luego, suelen arrastrarla al agua para ahogarla antes de devorarla.");
    }
    public void metododealimenta(){
    System.out.println("Jony se mete a la jaula aquatica de null mientras la jaula  pricipal esta cerrada,  mete los 2kg de carne dentro del agua para que null lo cace");
}

}
