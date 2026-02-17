package MVC;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    //Consturctor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    //Setter y Getter
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
}
