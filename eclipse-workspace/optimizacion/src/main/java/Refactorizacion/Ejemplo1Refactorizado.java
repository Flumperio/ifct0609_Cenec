package Refactorizacion;

public class Ejemplo1Refactorizado {
    private String nombre;
    private int edad;
    private String curso;
    private String estudios;
    //Constructor
    public Ejemplo1Refactorizado(String nombre, int edad, String curso, String estudios) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.estudios = estudios;
    }
    @Override
    public String toString() {
        return "Ejemplo1SinRefactorizar{\n" +
                "nombre='" + nombre + '\'' +
                ",\nedad=" + edad +
                ", \ncurso='" + curso + '\'' +
                ", \nestudios='" + estudios + '\'' +
                '}';
    }
    public static void main (String[] args){
        Ejemplo1Refactorizado ser = new Ejemplo1Refactorizado("Ser", 54, "Cocinillas", "Pocos");
        System.out.printf(ser.toString());
    }
}
