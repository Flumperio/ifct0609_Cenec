package MVC_3;

public class Alumnos {
    //Atributos
    private int id;
    private String nombre;
    private String apellidos;
    private String asignatura;
    private int nota;
    //Constructor
    public Alumnos(int id, String nombre, String apellidos, String asignatura, int nota) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asignatura = asignatura;
        this.nota = nota;
    }
    //Getter

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public String getAsignatura() {
        return asignatura;
    }
    public int getNota() {
        return nota;
    }
}

