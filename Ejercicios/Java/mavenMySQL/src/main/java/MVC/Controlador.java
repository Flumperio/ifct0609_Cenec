package MVC;

public class Controlador {
    private Persona modelo;
    private Vista vista;

    public Controlador(Persona modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void actualizarVista(){
        vista.mostrarPersona(modelo.getNombre(), modelo.getApellido(), modelo.getEdad());
    }
}
