package Observer_Method_1;

import java.util.ArrayList;
import java.util.List;

//Clase que representa al sistema de productos
class SistemaVentaProductos {
    //Lista para almacenar los observadores
    private List <Observer> observadores = new ArrayList<>();
    private int totalVentas = 0;

    //Metodo para agregar un observador al sistema
    public void agregarObservador (Observer observador){
        observadores.add(observador);
    }
    //Metodo para eliminar un observador
    public void eliminarObservador(Observer observador){
        observadores.remove(observador);
    }
    //Metodo que simula la venta de un producto
    public void venderProducto(int cantidad){
        //Incrementamos la cantidad total de ventas
        totalVentas += cantidad;
        notificarObservadores(cantidad);
    }
    //Metodo privador para notificar a los observadores
    private void notificarObservadores (int cantidadVendida){
        // Recorre la lista de observadores y llama al metodo actualizar de cada uno
        for (Observer observador : observadores){
            observador.actualizar(cantidadVendida);
        }
    }
}
