package JUnit;

public class Ejercicio_9 {
    private int edad;

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public int obtenerEdad(int edad) {
        setEdad(edad);
        return getEdad();
    }
}
