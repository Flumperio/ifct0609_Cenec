package Factory_Metod_2;

public class Main {
    public static void main (String[] args){
        //Crear una fabrica de Profesores
        FabricaProfesores fabricaProfesores = new FabricaProfesores();
        //Utilizamos la fabrica para crear un profesor
        Persona profesorHistoria = fabricaProfesores.crearPersona();
        //Operar con profesor
        profesorHistoria.saludar();

        //Crear fabrica de Alumnos
        FabricaAlumnos fabricaAlumnos = new FabricaAlumnos();
        //Utilizamos la fabrica para crear alumnos
        Persona alumnoPelota = fabricaAlumnos.crearPersona();
        //Usamos Alumno
        alumnoPelota.saludar();
    }
}
