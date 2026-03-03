package JavaDoc;

/**
 * Clase que representa a un estudiante universitario.
 * Almacena información básica como nombre, edad, carrera y promedio académico.
 * Proporciona métodos de acceso para consultar los datos del estudiante.
 *
 * @author Juan Carlos
 * @version 1.0
 */
public class Estudiante {

    /** Nombre completo del estudiante. */
    private String nombre;

    /** Edad del estudiante en años. */
    private int edad;

    /** Carrera que está estudiando el estudiante. */
    private String carrera;

    /** Promedio académico del estudiante (0.0 - 10.0). */
    private double promedio;

    /**
     * Constructor que inicializa todos los atributos del estudiante.
     *
     * @param nombre el nombre completo del estudiante
     * @param edad la edad del estudiante (debe ser mayor a 0)
     * @param carrera la carrera que estudia el estudiante
     * @param promedio el promedio académico (entre 0.0 y 10.0)
     */
    public Estudiante(String nombre, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    /**
     * Obtiene el nombre del estudiante.
     *
     * @return el nombre del estudiante como String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la edad del estudiante.
     *
     * @return la edad del estudiante como entero
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Obtiene la carrera que estudia el estudiante.
     *
     * @return la carrera del estudiante como String
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Obtiene el promedio académico del estudiante.
     *
     * @return el promedio como double (0.0 - 10.0)
     */
    public double getPromedio() {
        return promedio;
    }
}

