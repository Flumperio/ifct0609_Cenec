package MVC_MySQL;

import java.util.ArrayList;

public class ProductosVista {
    public void mostrarProductos(ArrayList<Productos> listaProductos) {
        System.out.println("Listado de productos");
        for (Productos prod : listaProductos) {
            System.out.println(
                "ID: " + prod.getId()
                + " | Nombre: " + prod.getNombre()
                + " | Precio: " + prod.getPrecio()
            );
        }
    }
}
