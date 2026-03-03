package JUnit;

public class Ejercicio_11 {
    private int edad;
    //Constructor
    public Ejercicio_11(int edad) {
        this.edad = edad;
    }
    public boolean mayorEdad (int anio){
        if (anio >= 18)
            return true;
        else
            return false;
    }
}
