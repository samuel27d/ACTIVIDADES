package Semana1.script;
public class Estudiante extends Usuario {
private String horariodeclase;
private String grupo;
public Estudiante(String nombre, int id, String password, String horariodeclases, String grupo){
    super(nombre, id, password);
}
public void sethorariodeclase(String horariodeclase){
    this.horariodeclase = horariodeclase;
}
public String gethorariodeclase() {
    return this.horariodeclase;
}
public void subirnotas(){
    System.out.println("subiendo notas del estudiante");
}
}