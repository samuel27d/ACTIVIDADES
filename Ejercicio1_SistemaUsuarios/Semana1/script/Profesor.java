package Semana1.script;
public class Profesor extends Usuario{
    private String horarios_de_clase;
    private String asignar_materia;

    public Profesor(String nombre, int id, String password, String horarios_de_clase, String asignar_materia) {
        super(nombre, id, password);
    }
    public void asignar_materia(String asignar_materia) {
        System.out.println("asignando las notas...");
    }
     public void editarNotas() {
        System.out.println("comenzando a editar notas...");
    }
     public void Administrar_notas() {
        System.out.println("Administrando notas del profesor...");
    }
     public void Crear_notas() {
        System.out.println("Creando notas del profesor...");
    }
     public void Borrar_notas() {
        System.out.println("Borrando notas del profesor...");
    }

} 