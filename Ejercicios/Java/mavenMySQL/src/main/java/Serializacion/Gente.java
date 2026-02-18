package Serializacion;

import java.io.Serializable;

public class Gente implements Serializable {
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    //Constructos
    public Gente(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    //toString
    @Override
    public String toString() {
        return "Gente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
