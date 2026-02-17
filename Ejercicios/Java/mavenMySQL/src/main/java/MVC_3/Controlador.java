package MVC_3;

public class Controlador {
    //Atributos
    private Alumnos modelo;
    private Vista vista;
    //Controlador
    public Controlador(Alumnos modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void actualizarVista(){
        vista.mostrarAlumno(modelo.getId(),
                modelo.getNombre(),
                modelo.getApellidos(),
                modelo.getAsignatura(),
                modelo.getNota());
    }
}
