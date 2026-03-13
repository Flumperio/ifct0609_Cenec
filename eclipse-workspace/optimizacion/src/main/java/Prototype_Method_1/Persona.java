package Prototype_Method_1;

public class Persona implements Cloneable{
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    // Sobrescribir el método clone() que da la interfaz cloneable
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
