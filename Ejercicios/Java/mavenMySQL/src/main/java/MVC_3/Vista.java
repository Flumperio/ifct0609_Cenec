package MVC_3;

public class Vista {
    //Metodos
    //Mostrar Producto
    public void mostrarAlumno(int codigo, String nombre, String apellido,
                              String asignatura, int nota){
        System.out.printf("ID: %s%n" +
                        "Nombre y Apellidos: %s %s%n" +
                        "Asignatura: %s%n" +
                        "Nota: %s%n",
                codigo,
                nombre,
                apellido,
                asignatura,
                nota);
    }
}
