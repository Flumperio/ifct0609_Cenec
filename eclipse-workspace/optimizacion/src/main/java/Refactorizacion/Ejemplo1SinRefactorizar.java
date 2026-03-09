package Refactorizacion;

public class Ejemplo1SinRefactorizar {
    private String nombre;
    private int edad;
    private String curso;
    private String estudios;
    //Constructor
    public Ejemplo1SinRefactorizar(String nombre, int edad, String curso, String estudios) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.estudios = estudios;
    }
    @Override
    public String toString() {
        return "Ejemplo1SinRefactorizar{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                ", estudios='" + estudios + '\'' +
                '}';
    }
    public static void main (String[] args){
        Ejemplo1SinRefactorizar ser = new Ejemplo1SinRefactorizar("Ser", 54, "Cocinillas", "Pocos");
        System.out.printf(ser.toString());
    }
}
