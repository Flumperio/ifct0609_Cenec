package MVC_2;

public class ProductosMain {
    public static void main (String[] args){
        Productos modelo = new Productos(1, "MacBook Pro", 2560.99);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        //Main
        controlador.actualizarVista();
    }
}
