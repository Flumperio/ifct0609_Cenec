package POO;

public class Ejercicio_1 {
    private String nombre;
    private String apellidos;

    //Constructor
    public Ejercicio_1(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    // to String
    @Override
    public String toString() {
        return "Ejercicio_1{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
    //Setter y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
