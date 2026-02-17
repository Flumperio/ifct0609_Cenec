package MVC_2;

public class Controlador {
    //Atributos
    private Productos modelo;
    private Vista vista;
    //Controlador
    public Controlador(Productos modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    public void actualizarVista(){
        vista.mostrarProducto(modelo.getCodigo(), modelo.getNombre(), modelo.getPrecio());
    }
}
