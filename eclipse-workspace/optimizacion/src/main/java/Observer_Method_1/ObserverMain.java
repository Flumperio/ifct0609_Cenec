package Observer_Method_1;

public class ObserverMain {
    public static void main (String[] args){
        // Se crea el sistema de venta de productos (el observable)
        SistemaVentaProductos sistemaVentaProductos = new SistemaVentaProductos();

        // Se crea la barra de estado (observador) y se le pasa el sistema.
        // En el constructor de BarraEstado se registra automáticamente
        // como observador del sistema.
        BarraEstado barraEstado = new BarraEstado(sistemaVentaProductos);

        // Simular ventas de productos

        // Se vende un producto con cantidad 5.
        // El sistema notificará a todos los observadores registrados.
        sistemaVentaProductos.venderProducto(5);

        // Se elimina la barra de estado de la lista de observadores.
        // A partir de este momento NO recibirá notificaciones.
        sistemaVentaProductos.eliminarObservador(barraEstado);

        // Se vende otra cantidad de productos.
        // Como ya no hay observadores registrados, NO se mostrará nada en consola.
        sistemaVentaProductos.venderProducto(3);

        // Se vuelve a registrar la barra de estado como observador.
        sistemaVentaProductos.agregarObservador(barraEstado);

        // Se realiza otra venta.
        // Ahora sí se notificará al observador nuevamente.
        sistemaVentaProductos.venderProducto(2);
    }
}
