package Semana1.script;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Usuario pepito = new Usuario("Juan", 123,"hola");
        pepito.logear();
        pepito.leerNota();

        Administrador admin = new Administrador("Admin", 1, "adminpass");
        admin.logear();
        admin.crearNota();

        Profesor profesor = new Profesor("PROFE JUAN", 2, "Profe01", "por la tarde", "3 notas");
        profesor.logear();
        profesor.Administrar_notas();
        profesor.editarNotas();
        profesor.Crear_notas();
        profesor.Borrar_notas();
        profesor.asignar_materia("matematicas");

        Estudiante estudiante =new Estudiante("Juan", 123, "hola", "en la tarde", "01");
        estudiante.logear();
        estudiante.subirnotas();
    }
    
}
